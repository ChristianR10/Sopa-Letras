/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import EDD.Pila;
import ValidacionesTXT.LecturaTXT;
import Sopa_Letras.SopaLetras;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author cgrc1
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrincipal
     */
    SopaLetras sopaletras;
    funcionesInterfaz func; 
    public InterfazPrincipal(SopaLetras sopaletras) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sopaletras = sopaletras;
        this.func = new funcionesInterfaz(this);
        
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
        text = new javax.swing.JTextField();
        buscarDFS = new javax.swing.JToggleButton();
        Dic = new javax.swing.JButton();
        V4 = new javax.swing.JTextField();
        V0 = new javax.swing.JTextField();
        V12 = new javax.swing.JTextField();
        V8 = new javax.swing.JTextField();
        V5 = new javax.swing.JTextField();
        V1 = new javax.swing.JTextField();
        V13 = new javax.swing.JTextField();
        V9 = new javax.swing.JTextField();
        V6 = new javax.swing.JTextField();
        V2 = new javax.swing.JTextField();
        V14 = new javax.swing.JTextField();
        V10 = new javax.swing.JTextField();
        V7 = new javax.swing.JTextField();
        V3 = new javax.swing.JTextField();
        V15 = new javax.swing.JTextField();
        V11 = new javax.swing.JTextField();
        allDFS = new javax.swing.JToggleButton();
        allBFS = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscarBFS = new javax.swing.JToggleButton();
        guardarTXT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abrirTXT.setText("Abrir TXT");
        abrirTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirTXTActionPerformed(evt);
            }
        });
        jPanel1.add(abrirTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });
        jPanel1.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 160, -1));

        buscarDFS.setText("DFS");
        buscarDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDFSActionPerformed(evt);
            }
        });
        jPanel1.add(buscarDFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 60, -1));

        Dic.setText("Diccionario");
        Dic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DicActionPerformed(evt);
            }
        });
        jPanel1.add(Dic, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        V4.setEditable(false);
        V4.setBackground(new java.awt.Color(255, 255, 255));
        V4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V4.setForeground(new java.awt.Color(0, 0, 0));
        V4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 50, 50));

        V0.setEditable(false);
        V0.setBackground(new java.awt.Color(255, 255, 255));
        V0.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V0.setForeground(new java.awt.Color(0, 0, 0));
        V0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, 50));

        V12.setEditable(false);
        V12.setBackground(new java.awt.Color(255, 255, 255));
        V12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V12.setForeground(new java.awt.Color(0, 0, 0));
        V12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 50, 50));

        V8.setEditable(false);
        V8.setBackground(new java.awt.Color(255, 255, 255));
        V8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V8.setForeground(new java.awt.Color(0, 0, 0));
        V8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 50, 50));

        V5.setEditable(false);
        V5.setBackground(new java.awt.Color(255, 255, 255));
        V5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V5.setForeground(new java.awt.Color(0, 0, 0));
        V5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, 50));

        V1.setEditable(false);
        V1.setBackground(new java.awt.Color(255, 255, 255));
        V1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V1.setForeground(new java.awt.Color(0, 0, 0));
        V1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 50, 50));

        V13.setEditable(false);
        V13.setBackground(new java.awt.Color(255, 255, 255));
        V13.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V13.setForeground(new java.awt.Color(0, 0, 0));
        V13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 50, 50));

        V9.setEditable(false);
        V9.setBackground(new java.awt.Color(255, 255, 255));
        V9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V9.setForeground(new java.awt.Color(0, 0, 0));
        V9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, 50));

        V6.setEditable(false);
        V6.setBackground(new java.awt.Color(255, 255, 255));
        V6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V6.setForeground(new java.awt.Color(0, 0, 0));
        V6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 50, 50));

        V2.setEditable(false);
        V2.setBackground(new java.awt.Color(255, 255, 255));
        V2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V2.setForeground(new java.awt.Color(0, 0, 0));
        V2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 50, 50));

        V14.setEditable(false);
        V14.setBackground(new java.awt.Color(255, 255, 255));
        V14.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V14.setForeground(new java.awt.Color(0, 0, 0));
        V14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 50, 50));

        V10.setEditable(false);
        V10.setBackground(new java.awt.Color(255, 255, 255));
        V10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V10.setForeground(new java.awt.Color(0, 0, 0));
        V10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 50, 50));

        V7.setEditable(false);
        V7.setBackground(new java.awt.Color(255, 255, 255));
        V7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V7.setForeground(new java.awt.Color(0, 0, 0));
        V7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 50, 50));

        V3.setEditable(false);
        V3.setBackground(new java.awt.Color(255, 255, 255));
        V3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V3.setForeground(new java.awt.Color(0, 0, 0));
        V3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        V15.setEditable(false);
        V15.setBackground(new java.awt.Color(255, 255, 255));
        V15.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V15.setForeground(new java.awt.Color(0, 0, 0));
        V15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 50, 50));

        V11.setEditable(false);
        V11.setBackground(new java.awt.Color(255, 255, 255));
        V11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        V11.setForeground(new java.awt.Color(0, 0, 0));
        V11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(V11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 50, 50));

        allDFS.setText("DFS");
        allDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allDFSActionPerformed(evt);
            }
        });
        jPanel1.add(allDFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        allBFS.setText("BFS");
        allBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allBFSActionPerformed(evt);
            }
        });
        jPanel1.add(allBFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jLabel1.setText("Buscar todas ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel2.setText("Buscar palabra");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        buscarBFS.setText("BFS");
        buscarBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBFSActionPerformed(evt);
            }
        });
        jPanel1.add(buscarBFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 60, -1));

        guardarTXT.setText("Guardar TXT");
        jPanel1.add(guardarTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
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
                if(txt.comprobacionTXT(cadena)==0){
                    this.sopaletras.armarSopa(cadena);
                    func.mostrarLetras();
                    func.colorReset();
                }
                else if (txt.comprobacionTXT(cadena)==1){
                    String cadenaNueva = txt.nuevoTXT(cadena);
                    this.sopaletras.armarSopa(cadenaNueva);
                    func.mostrarLetras();
                    func.colorReset ();
                }
                else {}
                
            }
            catch (IOException el){el.printStackTrace();}
        }
    }//GEN-LAST:event_abrirTXTActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void buscarDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDFSActionPerformed
        // TODO add your handling code here:
        String palabra = text.getText();
        Pila posiciones = sopaletras.buscarDFS(palabra);
        if (posiciones.vacia()){
            JOptionPane.showMessageDialog(null, "Palabra no encontrada");
        }
        else{
            func.colorReset();
            func.colorearLetras(posiciones, -1);}
        text.setText("");
    }//GEN-LAST:event_buscarDFSActionPerformed

    private void DicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DicActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, sopaletras.getDiccionario().getListaPalabras());
    }//GEN-LAST:event_DicActionPerformed

    private void buscarBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBFSActionPerformed
        // TODO add your handling code here:
        String palabra = text.getText();
        Pila posiciones = sopaletras.buscarBFS(palabra);
        if (posiciones.vacia()){
            JOptionPane.showMessageDialog(null, "Palabra no encontrada");
        }
        else{
            func.colorReset();
            func.colorearLetras(posiciones, -1);}
        text.setText("");
    }//GEN-LAST:event_buscarBFSActionPerformed

    private void allBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allBFSActionPerformed
        // TODO add your handling code here:
        func.colorReset();
        for (int i = 0; i < sopaletras.getDiccionario().getListaPalabras().length; i++){
            Pila posiciones = sopaletras.buscarBFS(sopaletras.getDiccionario().getListaPalabras()[i]);
            if (!posiciones.vacia()){
               func.colorearLetras(posiciones, i); 
            }
        }
    }//GEN-LAST:event_allBFSActionPerformed

    private void allDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allDFSActionPerformed
        // TODO add your handling code here:
        func.colorReset();
        for (int i = 0; i < sopaletras.getDiccionario().getListaPalabras().length; i++){
            Pila posiciones = sopaletras.buscarDFS(sopaletras.getDiccionario().getListaPalabras()[i]);
            if (!posiciones.vacia()){
               func.colorearLetras(posiciones, i); 
            }
        }
    }//GEN-LAST:event_allDFSActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }
    //getter and setter
    
    public JTextField getV0() {
        return V0;
    }

    public void setV0(JTextField V0) {
        this.V0 = V0;
    }

    public JTextField getV1() {
        return V1;
    }

    public void setV1(JTextField V1) {
        this.V1 = V1;
    }

    public JTextField getV10() {
        return V10;
    }

    public void setV10(JTextField V10) {
        this.V10 = V10;
    }

    public JTextField getV11() {
        return V11;
    }

    public void setV11(JTextField V11) {
        this.V11 = V11;
    }

    public JTextField getV12() {
        return V12;
    }

    public void setV12(JTextField V12) {
        this.V12 = V12;
    }

    public JTextField getV13() {
        return V13;
    }

    public void setV13(JTextField V13) {
        this.V13 = V13;
    }

    public JTextField getV14() {
        return V14;
    }

    public void setV14(JTextField V14) {
        this.V14 = V14;
    }

    public JTextField getV15() {
        return V15;
    }

    public void setV15(JTextField V15) {
        this.V15 = V15;
    }

    public JTextField getV2() {
        return V2;
    }

    public void setV2(JTextField V2) {
        this.V2 = V2;
    }

    public JTextField getV3() {
        return V3;
    }

    public void setV3(JTextField V3) {
        this.V3 = V3;
    }

    public JTextField getV4() {
        return V4;
    }

    public void setV4(JTextField V4) {
        this.V4 = V4;
    }

    public JTextField getV5() {
        return V5;
    }

    public void setV5(JTextField V5) {
        this.V5 = V5;
    }

    public JTextField getV6() {
        return V6;
    }

    public void setV6(JTextField V6) {
        this.V6 = V6;
    }

    public JTextField getV7() {
        return V7;
    }

    public void setV7(JTextField V7) {
        this.V7 = V7;
    }

    public JTextField getV8() {
        return V8;
    }

    public void setV8(JTextField V8) {
        this.V8 = V8;
    }

    public JTextField getV9() {
        return V9;
    }

    public void setV9(JTextField V9) {
        this.V9 = V9;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dic;
    private javax.swing.JTextField V0;
    private javax.swing.JTextField V1;
    private javax.swing.JTextField V10;
    private javax.swing.JTextField V11;
    private javax.swing.JTextField V12;
    private javax.swing.JTextField V13;
    private javax.swing.JTextField V14;
    private javax.swing.JTextField V15;
    private javax.swing.JTextField V2;
    private javax.swing.JTextField V3;
    private javax.swing.JTextField V4;
    private javax.swing.JTextField V5;
    private javax.swing.JTextField V6;
    private javax.swing.JTextField V7;
    private javax.swing.JTextField V8;
    private javax.swing.JTextField V9;
    private javax.swing.JButton abrirTXT;
    private javax.swing.JToggleButton allBFS;
    private javax.swing.JToggleButton allDFS;
    private javax.swing.JToggleButton buscarBFS;
    private javax.swing.JToggleButton buscarDFS;
    private javax.swing.JButton guardarTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}
