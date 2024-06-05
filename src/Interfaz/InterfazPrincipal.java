/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import EDD.Pila;
import LecturaTXT.LecturaTXT;
import Sopa_Letras.SopaLetras;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author cgrc1
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrincipal
     */
    SopaLetras sopaletras;
    public InterfazPrincipal(SopaLetras sopaletras) {
        initComponents();
        this.sopaletras = sopaletras;
    }

    private InterfazPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        abrirTXT = new javax.swing.JButton();
        textBFS = new javax.swing.JTextField();
        buscarBFS = new javax.swing.JToggleButton();
        Dic = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        txt = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abrirTXT.setText("Abrir TXT");
        abrirTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirTXTActionPerformed(evt);
            }
        });
        jPanel1.add(abrirTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        textBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBFSActionPerformed(evt);
            }
        });
        jPanel1.add(textBFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, -1));

        buscarBFS.setText("BUSCAR");
        buscarBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBFSActionPerformed(evt);
            }
        });
        jPanel1.add(buscarBFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 80, -1));

        Dic.setText("Diccionario");
        Dic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DicActionPerformed(evt);
            }
        });
        jPanel1.add(Dic, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jButton1.setText("Ver Sopa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jMenu1.setText("File");

        txt.setText("Abrir TxT");
        jMenu1.add(txt);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirTXTActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int selection = fc.showOpenDialog(this);
        
        if (selection == JFileChooser.APPROVE_OPTION){
            File fichero = fc.getSelectedFile();
            
            try (FileReader fr = new FileReader(fichero)){
                String cadena = "";
                int valor = fr.read();
                while (valor != -1){
                    cadena += (char) valor;
                    valor = fr.read();
                }
                //JOptionPane.showMessageDialog(null, cadena);
                LecturaTXT txt = new LecturaTXT ();
                if(txt.comprobacionTXT(cadena)){
                    this.sopaletras.armarSopa(cadena);}
                
            }
            catch (IOException el){el.printStackTrace();}
        }
    }//GEN-LAST:event_abrirTXTActionPerformed

    private void textBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBFSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBFSActionPerformed

    private void buscarBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBFSActionPerformed
        // TODO add your handling code here:
        String palabra = textBFS.getText();
        Pila posiciones = sopaletras.buscarBFS(palabra);
        posiciones.imprimirInv();
        textBFS.setText("");
    }//GEN-LAST:event_buscarBFSActionPerformed

    private void DicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DicActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, sopaletras.getDiccionario().getListaPalabras());
    }//GEN-LAST:event_DicActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String cadena = "";
        for (int i = 0; i<sopaletras.getNumFilas();i++){
            for (int j = 0; j < sopaletras.getNumCol();j++){
                cadena += sopaletras.getLetraSopa()[i][j] + "   ";
            }
            cadena += "\n\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dic;
    private javax.swing.JButton abrirTXT;
    private javax.swing.JToggleButton buscarBFS;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textBFS;
    private javax.swing.JMenu txt;
    // End of variables declaration//GEN-END:variables
}
