
/**
 * @version 1.0
 * @author Anael Dominique Cervantes Pinedo
 *         Adonaí Benjamín Cervantes Pinedo
 */

package Interface;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivosES {
    //Variable
    private String absoluteRouteFile;
    //Constructor   
    public ArchivosES() {
        cleanRoute();
    }
    //Getter y Setter
    public String getAbsoluteRouteFile() {
        return absoluteRouteFile;
    }
    public void setAbsoluteRouteFile(String route) {
        this.absoluteRouteFile = route;
    }
    //Metodos---------------------------------------------------
    public void cleanRoute(){
        this.absoluteRouteFile = null;
    }
    
    public String lee(){
        String cadena="";
        try {
            //Lee el archivo
            FileReader entrada= new FileReader(absoluteRouteFile);
            //Variable que almacena el valor del caracter
            //int c = entrada.read();;
            int c = 0;
            //Ciclo para leer el archivo, el -1 indica el final del archivo
            while(c!=-1){
                //Almacena un caracter del archivo que se lee
                c=entrada.read();
                //Se convierte a caracter el valor
                char letra=(char)c;
                if(c!=-1)
                    cadena+=letra;
            }
            entrada.close();
        }catch (IOException e){
            System.out.printf("No se ha encontrado el archivo.");
        }
        return cadena;
    }
    
    public void guardarFichero(String contenido,File arch){
        FileWriter escribir;
        try {
            escribir = new FileWriter(arch, false);
            escribir.write(contenido);
            escribir.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar, ponga nombre al archivo");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar, en la salida");
        }
    }
        
    public void guardarComo(String contenido){
        JFileChooser guardar = new JFileChooser();
        //Seleccionamos un dialog y almacenamos pasamos la ruta por donde se almacenara el archivo.
        guardar.showSaveDialog(null);
        guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        File archivo = guardar.getSelectedFile();
        //Mandamos la ubicacion seleccionada
        guardarFichero(contenido, archivo);
        setAbsoluteRouteFile(archivo.getPath());
    }
    
    public void guardar(String contenido) throws IOException{
        //Condicion de validar si el archivo fue abierto o es uno nuevo
        if(this.absoluteRouteFile!=null){
            File auxiliar = new File(absoluteRouteFile);
            guardarFichero(contenido,auxiliar);
        }else{
            guardarComo(contenido);
        }    
    }

    public String abrirArchivo(){
        String texto = "";
        //Filtro para el tipo de archivo
        FileFilter filter = new FileNameExtensionFilter("Documento de texto", "txt");
        //Variable de JFileChooser para elegir archivos desde ventana
        JFileChooser seleccionarArchivo=new JFileChooser();
        //Se agrega el filtro de busqueda
        seleccionarArchivo.setFileFilter(filter);
        //Abre la ventana para buscar archivos
        int seleccion = seleccionarArchivo.showOpenDialog(null);
        //Se guarda en una cadena la dirección del archivo elegido

        if (seleccion == JFileChooser.APPROVE_OPTION){
            String patch=seleccionarArchivo.getSelectedFile().getAbsolutePath();
            this.setAbsoluteRouteFile(patch);
            texto = lee();
        }
        return  texto;
    }
}
    //--------------------------------------------------------------------