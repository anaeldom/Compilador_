/**
 * @version 1.0
 * @author Anael Dominique Cervantes Pinedo
 *         Adonaí Benjamín Cervantes Pinedo
 */

package Interface;
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.SwingUtilities;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

public final class CustomDocumentFilter extends DocumentFilter{

    private final javax.swing.JTextPane styledDocument;
    private StyledDocument sd;
    private final StyleContext styleContext = StyleContext.getDefaultStyleContext();
    private final AttributeSet greenAttributeSet = styleContext.addAttribute(styleContext.getEmptySet(), StyleConstants.Foreground, Color.ORANGE);
    private final AttributeSet blackAttributeSet = styleContext.addAttribute(styleContext.getEmptySet(), StyleConstants.Foreground, Color.DARK_GRAY);

    //Extraemos el formato del TextPane
    public CustomDocumentFilter(javax.swing.JTextPane styledDocument_) {
        this.styledDocument=styledDocument_;
        this.sd=styledDocument.getStyledDocument();
    }
        
    // Usamos una expresion para encontrar las palabras que deseamos encontrar
    Pattern pattern = buildPattern();

    //Sobreescribimos los metodos para tener guardado el texto
    @Override
    public void insertString(FilterBypass fb, int offset, String text, AttributeSet attributeSet) throws BadLocationException {
        super.insertString(fb, offset, text, attributeSet);
        handleTextChanged();
    }

    //Quitamos la palabra a la cual tenemos dentro de nuestro de nuestro array
    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        super.remove(fb, offset, length);
        handleTextChanged();
    }

    //Colocamos la palabra nueva con color
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attributeSet) throws BadLocationException {
        super.replace(fb, offset, length, text, attributeSet);
        handleTextChanged();
    }

    //Se ejecuta despues de haber escrito en la caja de texto    
    private void handleTextChanged()
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                updateTextStyles();
            }
        });
    }

    //Construimos el patron a traves de las palabras reservadas
    private Pattern buildPattern()
    {
        StringBuilder sb = new StringBuilder();
        List<String> myList = Arrays.asList("private","main","int","if","else",
                "fi","do","until","while","read","write","float","bool","not",
                "and","or");
        
        for (String token : myList) {
            sb.append("\\b"); 
            sb.append(token);
            sb.append("\\b|");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        Pattern p = Pattern.compile(sb.toString());
        return p;
    }
    
    //Cambiamos los estilos a los nuevos del TextPane
    private void updateTextStyles()
    {
        sd.setCharacterAttributes(0, styledDocument.getText().length(), blackAttributeSet, true);
        Matcher matcher = pattern.matcher(styledDocument.getText());
        while (matcher.find()) {
            sd.setCharacterAttributes(matcher.start(), matcher.end() - matcher.start(), greenAttributeSet, false);
        }
    }
}