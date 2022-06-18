package Interface;

import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.undo.UndoManager;


/**
 * @version 1.0
 * @author Anael Dominique Cervantes Pinedo
 *         Adonaí Benjamín Cervantes Pinedo
 */
public class compilator extends javax.swing.JFrame{
    
    ArchivosES componente=new ArchivosES();
    UndoManager manager = new UndoManager();

    public compilator() {
        initComponents();
        //Aqui este codigo se utiliza para asignar formato a los iconos de acceso rapido.
        initimages();
        //Este codigo es para poder hacer el cambio de color del texto e identificar las palabras reservadas
        jTextPaneCode.getStyledDocument();
        jTextPaneCode.getDocument().addUndoableEditListener(manager);
        ((AbstractDocument) jTextPaneCode.getDocument()).setDocumentFilter(new CustomDocumentFilter(jTextPaneCode));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jButton_compilar = new javax.swing.JButton();
        jButton_nuevo = new javax.swing.JButton();
        jButton_abrir = new javax.swing.JButton();
        jButton_guardar = new javax.swing.JButton();
        jButton_copiar = new javax.swing.JButton();
        jButton_cortar = new javax.swing.JButton();
        jButton_pegar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneCode = new javax.swing.JTextPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane3 = new javax.swing.JEditorPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jEditorPane4 = new javax.swing.JEditorPane();
        jMenuBar_compilator = new javax.swing.JMenuBar();
        jMenu_archivo = new javax.swing.JMenu();
        jMenuItemNuevo = new javax.swing.JMenuItem();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jMenuItemGuardarComo = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCopiar = new javax.swing.JMenuItem();
        jMenuItemCortar = new javax.swing.JMenuItem();
        jMenuItemPegar = new javax.swing.JMenuItem();
        jMenuItemDeshacer = new javax.swing.JMenuItem();
        jMenuItemRehacer = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador by Anael & Benjamin");
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(948, 540));
        setMinimumSize(new java.awt.Dimension(948, 540));
        setResizable(false);
        setSize(new java.awt.Dimension(948, 540));

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setEnabled(false);
        jToolBar1.setRequestFocusEnabled(false);

        jButton_compilar.setAlignmentX(0.5F);
        jButton_compilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_compilar.setIconTextGap(0);
        jButton_compilar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton_compilar.setMaximumSize(new java.awt.Dimension(25, 25));
        jButton_compilar.setMinimumSize(new java.awt.Dimension(25, 25));
        jButton_compilar.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton_compilar.setRequestFocusEnabled(false);
        jButton_compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_compilarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_compilar);

        jButton_nuevo.setAlignmentX(0.5F);
        jButton_nuevo.setFocusable(false);
        jButton_nuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_nuevo.setIconTextGap(0);
        jButton_nuevo.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton_nuevo.setMaximumSize(new java.awt.Dimension(25, 25));
        jButton_nuevo.setMinimumSize(new java.awt.Dimension(25, 25));
        jButton_nuevo.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton_nuevo.setRequestFocusEnabled(false);
        jButton_nuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_nuevo);

        jButton_abrir.setAlignmentX(0.5F);
        jButton_abrir.setFocusable(false);
        jButton_abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_abrir.setIconTextGap(0);
        jButton_abrir.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton_abrir.setMaximumSize(new java.awt.Dimension(25, 25));
        jButton_abrir.setMinimumSize(new java.awt.Dimension(25, 25));
        jButton_abrir.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton_abrir.setRequestFocusEnabled(false);
        jButton_abrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_abrirActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_abrir);

        jButton_guardar.setAlignmentX(0.5F);
        jButton_guardar.setFocusable(false);
        jButton_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_guardar.setIconTextGap(0);
        jButton_guardar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton_guardar.setMaximumSize(new java.awt.Dimension(25, 25));
        jButton_guardar.setMinimumSize(new java.awt.Dimension(25, 25));
        jButton_guardar.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton_guardar.setRequestFocusEnabled(false);
        jButton_guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_guardar);

        jButton_copiar.setAlignmentX(0.5F);
        jButton_copiar.setFocusable(false);
        jButton_copiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_copiar.setIconTextGap(0);
        jButton_copiar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton_copiar.setMaximumSize(new java.awt.Dimension(25, 25));
        jButton_copiar.setMinimumSize(new java.awt.Dimension(25, 25));
        jButton_copiar.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton_copiar.setRequestFocusEnabled(false);
        jButton_copiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_copiarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_copiar);

        jButton_cortar.setAlignmentX(0.5F);
        jButton_cortar.setFocusable(false);
        jButton_cortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_cortar.setIconTextGap(0);
        jButton_cortar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton_cortar.setMaximumSize(new java.awt.Dimension(25, 25));
        jButton_cortar.setMinimumSize(new java.awt.Dimension(25, 25));
        jButton_cortar.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton_cortar.setRequestFocusEnabled(false);
        jButton_cortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cortarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_cortar);

        jButton_pegar.setAlignmentX(0.5F);
        jButton_pegar.setFocusable(false);
        jButton_pegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_pegar.setIconTextGap(0);
        jButton_pegar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton_pegar.setMaximumSize(new java.awt.Dimension(25, 25));
        jButton_pegar.setMinimumSize(new java.awt.Dimension(25, 25));
        jButton_pegar.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton_pegar.setRequestFocusEnabled(false);
        jButton_pegar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pegarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_pegar);

        jScrollPane1.setViewportView(jTextPaneCode);

        jScrollPane2.setViewportView(jEditorPane1);

        jTabbedPane5.addTab("Léxico", jScrollPane2);

        jScrollPane3.setViewportView(jEditorPane2);

        jTabbedPane5.addTab("Sintactico", jScrollPane3);

        jScrollPane4.setViewportView(jEditorPane3);

        jTabbedPane5.addTab("Semantico", jScrollPane4);

        jScrollPane5.setViewportView(jEditorPane4);

        jTabbedPane5.addTab("Codigo Intermedio", jScrollPane5);

        jMenuBar_compilator.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar_compilator.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jMenu_archivo.setText("Archivo");

        jMenuItemNuevo.setText("Nuevo");
        jMenuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoActionPerformed(evt);
            }
        });
        jMenu_archivo.add(jMenuItemNuevo);

        jMenuItemAbrir.setText("Abrir");
        jMenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirActionPerformed(evt);
            }
        });
        jMenu_archivo.add(jMenuItemAbrir);

        jMenuItemGuardar.setText("Guardar");
        jMenuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarActionPerformed(evt);
            }
        });
        jMenu_archivo.add(jMenuItemGuardar);

        jMenuItemGuardarComo.setText("Guardar como...");
        jMenuItemGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarComoActionPerformed(evt);
            }
        });
        jMenu_archivo.add(jMenuItemGuardarComo);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu_archivo.add(jMenuItemSalir);

        jMenuBar_compilator.add(jMenu_archivo);

        jMenu2.setText("Editar");

        jMenuItemCopiar.setText("Copiar");
        jMenuItemCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCopiarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCopiar);

        jMenuItemCortar.setText("Cortar");
        jMenuItemCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCortarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCortar);

        jMenuItemPegar.setText("Pegar");
        jMenuItemPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPegarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPegar);

        jMenuItemDeshacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemDeshacer.setText("Deshacer");
        jMenuItemDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeshacerActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemDeshacer);

        jMenuItemRehacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemRehacer.setText("Rehacer");
        jMenuItemRehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRehacerActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemRehacer);

        jMenuBar_compilator.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuItemAcercaDe.setText("Acerca de...");
        jMenuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAcercaDe);

        jMenuBar_compilator.add(jMenu3);

        setJMenuBar(jMenuBar_compilator);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jTabbedPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                .addGap(0, 122, Short.MAX_VALUE))
        );

        jTabbedPane5.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirActionPerformed
        // ActionListener de abrir un archivo
        String cadena = componente.abrirArchivo();
        if (cadena != null){
            jTextPaneCode.setText(cadena);
        }
    }//GEN-LAST:event_jMenuItemAbrirActionPerformed

    private void jMenuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarActionPerformed
        // ActionListener de guardar un archivo
        try {
            componente.guardar(jTextPaneCode.getText());        
        } catch (IOException ex) {
            Logger.getLogger(compilator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemGuardarActionPerformed

    private void jMenuItemGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarComoActionPerformed
        // ActionListener de guardar como un archivo
        componente.guardarComo(jTextPaneCode.getText());
    }//GEN-LAST:event_jMenuItemGuardarComoActionPerformed

    private void jMenuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoActionPerformed
       // ActionListener de generar un nuevo archivo
        componente.cleanRoute();
        jTextPaneCode.setText("");
    }//GEN-LAST:event_jMenuItemNuevoActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // ActionListener para cerrar compilador
        System.exit(0x0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCopiarActionPerformed
        // ActionListener de copiar un texto
        jTextPaneCode.copy();
    }//GEN-LAST:event_jMenuItemCopiarActionPerformed

    private void jMenuItemCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCortarActionPerformed
        // ActionListener de cortar un texto
        jTextPaneCode.cut();
    }//GEN-LAST:event_jMenuItemCortarActionPerformed

    private void jMenuItemPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPegarActionPerformed
        // ActionListener de pegar un texto
        jTextPaneCode.paste();
    }//GEN-LAST:event_jMenuItemPegarActionPerformed

    private void jMenuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaDeActionPerformed
        // ActionListener que manda un mensaje con informacion
         JOptionPane.showMessageDialog(null, "Proyecto de compiladores.\nHecho por: \nAnael Dominique Cervantes Pinedo 219536\nAdonaí Benjamín Cervantes Pinedo 254802");
    }//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

    private void jMenuItemDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeshacerActionPerformed
        // Rehace cambios en el TextPane
        manager.undo();
    }//GEN-LAST:event_jMenuItemDeshacerActionPerformed

    private void jMenuItemRehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRehacerActionPerformed
        // Rehace cambios en el TextPane
        manager.redo();
    }//GEN-LAST:event_jMenuItemRehacerActionPerformed

    private void jButton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevoActionPerformed
        // ActionListener de generar un nuevo archivo
        componente.cleanRoute();
        jTextPaneCode.setText("");
    }//GEN-LAST:event_jButton_nuevoActionPerformed

    private void jButton_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_abrirActionPerformed
        // ActionListener de abrir un archivo
        String cadena = componente.abrirArchivo();
        if (cadena != null){
            jTextPaneCode.setText(cadena);
        }
    }//GEN-LAST:event_jButton_abrirActionPerformed

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        // ActionListener de guardar un archivo
        try {
            componente.guardar(jTextPaneCode.getText());        
        } catch (IOException ex) {
            Logger.getLogger(compilator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_guardarActionPerformed

    private void jButton_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_copiarActionPerformed
        // ActionListener de copiar un texto
        jTextPaneCode.copy();
    }//GEN-LAST:event_jButton_copiarActionPerformed

    private void jButton_cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cortarActionPerformed
        // ActionListener de copiar un texto
        jTextPaneCode.cut();
    }//GEN-LAST:event_jButton_cortarActionPerformed

    private void jButton_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pegarActionPerformed
        // ActionListener de copiar un texto
        jTextPaneCode.paste();
    }//GEN-LAST:event_jButton_pegarActionPerformed

    private void jButton_compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_compilarActionPerformed
        // TODO add your handling code here:
        if(componente.getAbsoluteRouteFile()==null){
            componente.guardarComo(jTextPaneCode.getText());
        }else{
            try {
                componente.guardar(jTextPaneCode.getText());
            } catch (IOException ex) {
                Logger.getLogger(compilator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String ruta = componente.getAbsoluteRouteFile();
        //System.out.println(ruta);
        Process proc;
        //jEditorPane1.setText("webos");
        try{
            String[] args1 = new String[] {"python","C:\\Users\\CerPin\\Desktop\\interfaceCompilador\\src\\sources\\#Analizador lexicografico by Anael & Ben.py","-f",ruta/*"C:\\Users\\CerPin\\Documents\\Practicas_Python\\ejemplo.txt"*/};
            proc=Runtime.getRuntime().exec(args1);
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            String texto="";
            while ((line = in.readLine()) != null) {
                texto=texto+line+'\n';
                //jEditorPane1.setText(line);
                //System.out.println(line);
            }
            jEditorPane1.setText(texto);
             in.close();
             proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Analizador sintactico
        String ST = jTextPaneCode.getText();
        Sintax s = new Sintax(new Interface.LexerCup(new StringReader(ST)));
        
        try {
            s.parse();
            jEditorPane2.setText("Analisis realizado correctamente");
            jEditorPane2.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            jEditorPane2.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            jEditorPane2.setForeground(Color.red);
        }
    }//GEN-LAST:event_jButton_compilarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(compilator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(compilator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(compilator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(compilator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new compilator().setVisible(true);                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_abrir;
    private javax.swing.JButton jButton_compilar;
    private javax.swing.JButton jButton_copiar;
    private javax.swing.JButton jButton_cortar;
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JButton jButton_nuevo;
    private javax.swing.JButton jButton_pegar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JEditorPane jEditorPane3;
    private javax.swing.JEditorPane jEditorPane4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar_compilator;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemCopiar;
    private javax.swing.JMenuItem jMenuItemCortar;
    private javax.swing.JMenuItem jMenuItemDeshacer;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemGuardarComo;
    private javax.swing.JMenuItem jMenuItemNuevo;
    private javax.swing.JMenuItem jMenuItemPegar;
    private javax.swing.JMenuItem jMenuItemRehacer;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenu_archivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextPane jTextPaneCode;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
    //Metodo para colocar la imagen a un boton
    public Icon seticono(String url,JButton boton){ 
        
        ImageIcon icono= new ImageIcon(getClass().getResource(url));
        int anc=jButton_compilar.getWidth();
        int alt=jButton_compilar.getHeight();
        ImageIcon ico = new ImageIcon(icono.getImage().getScaledInstance(anc, alt, Image.SCALE_DEFAULT));
        
        return ico;
    }
    //Metodo para colocar la imagen a un boton con un efecto al presionar
    public Icon seticonoPress(String url,JButton boton,int ancho,int altura){
        
        ImageIcon icono= new ImageIcon(getClass().getResource(url));
        int anc=jButton_compilar.getWidth()-ancho;
        int alt=jButton_compilar.getHeight()-altura;
        ImageIcon ico = new ImageIcon(icono.getImage().getScaledInstance(anc, alt, Image.SCALE_DEFAULT));
        
        return ico;
    }
    
    private void initimages(){
    jButton_compilar.setIcon(seticono("/sources/icon_compilar.png",jButton_compilar));
        jButton_compilar.setPressedIcon(seticonoPress("/sources/icon_compilar.png",jButton_compilar,1,1));
        
        jButton_nuevo.setIcon(seticono("/sources/nuevo.png",jButton_nuevo));
        jButton_nuevo.setPressedIcon(seticonoPress("/sources/nuevo.png",jButton_nuevo,1,1));
        
        jButton_abrir.setIcon(seticono("/sources/abrir-documento.png",jButton_abrir));
        jButton_abrir.setPressedIcon(seticonoPress("/sources/abrir-documento.png",jButton_abrir,1,1));
        
        jButton_guardar.setIcon(seticono("/sources/guardar.png",jButton_guardar));
        jButton_guardar.setPressedIcon(seticonoPress("/sources/guardar.png",jButton_guardar,1,1));
        
        jButton_copiar.setIcon(seticono("/sources/copiar.png",jButton_copiar));
        jButton_copiar.setPressedIcon(seticonoPress("/sources/copiar.png",jButton_copiar,1,1));
        
        jButton_cortar.setIcon(seticono("/sources/cortar.png",jButton_cortar));
        jButton_cortar.setPressedIcon(seticonoPress("/sources/cortar.png",jButton_cortar,1,1));
        
        jButton_pegar.setIcon(seticono("/sources/pegar.png",jButton_pegar));
        jButton_pegar.setPressedIcon(seticonoPress("/sources/pegar.png",jButton_pegar,1,1));
    }
}

