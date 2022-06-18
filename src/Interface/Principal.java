/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import jflex.*;
/**
 *
 * @author CerPin
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:/Users/familia/Desktop/interfaceCompilador/src/Interface/Lexer.flex";
        String ruta2 = "C:/Users/familia/Desktop/interfaceCompilador/src/Interface/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "C:/Users/familia/Desktop/interfaceCompilador/src/Interface/Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("C:/Users/familia/Desktop/interfaceCompilador/src/Interface/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:/Users/familia/Desktop/interfaceCompilador/sym.java"), 
                Paths.get("C:/Users/familia/Desktop/interfaceCompilador/src/Interface/sym.java")
        );
        Path rutaSin = Paths.get("C:/Users/familia/Desktop/interfaceCompilador/src/Interface/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:/Users/familia/Desktop/interfaceCompilador/Sintax.java"), 
                Paths.get("C:/Users/familia/Desktop/interfaceCompilador/src/Interface/Sintax.java")
        );
    }
}
