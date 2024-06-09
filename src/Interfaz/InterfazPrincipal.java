package Interfaz;

import ValidacionesTXT.*;
import Sopa_Letras.SopaLetras;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Interfaz grafica del proyecto
 * @author Christian Ramos
 * @version 1.0
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrincipal
     */
    SopaLetras sopaletras;
    funcionesInterfaz func;
    LecturaTXT archivotxt;

    /**
     * Constructor de la interfaz. No recibe parametro de entrada
     */
    public InterfazPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.func = new funcionesInterfaz(this);
        this.archivotxt = new LecturaTXT();
        this.sopaletras = new SopaLetras (4,4);
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
        palabra = new javax.swing.JTextField();
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
        agregarDic = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tiempo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abrirTXT.setText("Abrir TXT");
        abrirTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirTXTActionPerformed(evt);
            }
        });
        jPanel1.add(abrirTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        palabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabraActionPerformed(evt);
            }
        });
        jPanel1.add(palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));

        buscarDFS.setText("DFS");
        buscarDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDFSActionPerformed(evt);
            }
        });
        jPanel1.add(buscarDFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 80, -1));

        Dic.setText("Lista ");
        Dic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DicActionPerformed(evt);
            }
        });
        jPanel1.add(Dic, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 80, -1));

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
        jPanel1.add(allDFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 80, -1));

        allBFS.setText("BFS");
        allBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allBFSActionPerformed(evt);
            }
        });
        jPanel1.add(allBFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 80, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Diccionario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Buscar palabra específica");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        buscarBFS.setText("BFS");
        buscarBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBFSActionPerformed(evt);
            }
        });
        jPanel1.add(buscarBFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 80, -1));

        guardarTXT.setText("Guardar TXT");
        guardarTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarTXTActionPerformed(evt);
            }
        });
        jPanel1.add(guardarTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        agregarDic.setText("Agregar");
        agregarDic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDicActionPerformed(evt);
            }
        });
        jPanel1.add(agregarDic, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Buscar todas las palabras");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel4.setText("ms");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        tiempo.setEditable(false);
        tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoActionPerformed(evt);
            }
        });
        jPanel1.add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 312, 60, 20));

        jLabel5.setText("Tiempo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * boton que abre el JFileChooser  
     */
    private void abrirTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirTXTActionPerformed
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("archivos de texto", "txt");
        fc.setFileFilter(filter);
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
                
                String txtArreglado = archivotxt.comprobacionTXT(cadena);
                
                if("".equals(txtArreglado)){
                    JOptionPane.showMessageDialog(null, "Archivo de texto no válido");
                }else{
                    this.sopaletras = new SopaLetras(4, 4);
                    this.sopaletras.armarSopa(txtArreglado);
                    func.mostrarLetras();
                    func.colorReset();
                }
                
            }
            catch (IOException el){}
        }
    }//GEN-LAST:event_abrirTXTActionPerformed

    /**
     * recuadro de texto para ingresar una palabra para la busqueda
     */
    private void palabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palabraActionPerformed

    /**
     * boton que busca una palabra usando la metodologia DFS
     */
    private void buscarDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDFSActionPerformed
        func.buscarUna("DFS");
    }//GEN-LAST:event_buscarDFSActionPerformed

    /**
     * boton que muestra la lista de palabras del diccionario
     */
    private void DicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DicActionPerformed
        // TODO add your handling code here:
        if (this.sopaletras.isSopaArmada()){
            JOptionPane.showMessageDialog(null, sopaletras.getDiccionario().getListaPalabras());}
        else {
            JOptionPane.showMessageDialog(null, "No se ha cargado ningun archivo de texto");
        }
    }//GEN-LAST:event_DicActionPerformed

    /**
     * boton que busca una palabra usando la metodologia BFS
     */
    private void buscarBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBFSActionPerformed
        func.buscarUna("BFS");
    }//GEN-LAST:event_buscarBFSActionPerformed

    /**
     * boton que busca todas las palabras usando la metodologia BFS
     */
    private void allBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allBFSActionPerformed
        func.buscarTodas("BFS");
    }//GEN-LAST:event_allBFSActionPerformed

    /**
     * boton que busca todas las palabras usando la metodologia DFS
     */
    private void allDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allDFSActionPerformed
        func.buscarTodas("DFS");
    }//GEN-LAST:event_allDFSActionPerformed

    /**
     * recuadro que muestra el cronometro
     */
    private void tiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoActionPerformed

    /**
     * boton para agregar una palabra al diccionario
     */
    private void agregarDicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDicActionPerformed
        // TODO add your handling code here:
        if(this.sopaletras.isSopaArmada()){
            String palabra = JOptionPane.showInputDialog("Inserte una Palabra").toUpperCase();
            String palabraComprobada = archivotxt.palabraValida(palabra);
            if (!"".equals(palabraComprobada)){
                palabra = archivotxt.palabrasCorregidas(palabra);
                sopaletras.getDiccionario().agregarPalabra(palabra);
            }else{
                JOptionPane.showMessageDialog(null, "Palabra no válida");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "No se ha cargado ningun archivo de texto");
        }
    }//GEN-LAST:event_agregarDicActionPerformed

    /**
     * boton para guardar el txt
     */
    private void guardarTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarTXTActionPerformed
        if(this.sopaletras.isSopaArmada()){
            JFileChooser fc = new JFileChooser();
            int selection = fc.showSaveDialog(this);
            if (selection == JFileChooser.APPROVE_OPTION){
                File fichero = fc.getSelectedFile();
                try (FileWriter fw = new FileWriter(fichero)){
                    fw.write(sopaletras.getDiccionario().generarTXT());
                }
                catch (IOException el){
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "No se ha cargado ningun archivo de texto");
        }
    }//GEN-LAST:event_guardarTXTActionPerformed

    
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
        java.awt.EventQueue.invokeLater(() -> {
            new InterfazPrincipal().setVisible(true);
        });
    }
    
    /**
     * @return parametro interno V0
     */
    public JTextField getV0() {
        return V0;
    }

    /**
     * @return parametro interno V1
     */
    public JTextField getV1() {
        return V1;
    }

    /**
     * @return parametro interno V10
     */
    public JTextField getV10() {
        return V10;
    }

    /**
     * @return parametro interno V11
     */
    public JTextField getV11() {
        return V11;
    }

    /**
     * @return parametro interno V12
     */
    public JTextField getV12() {
        return V12;
    }

    /**
     * @return parametro interno V13
     */
    public JTextField getV13() {
        return V13;
    }

    /**
     * @return parametro interno V14
     */
    public JTextField getV14() {
        return V14;
    }

    /**
     * @return parametro interno V15
     */
    public JTextField getV15() {
        return V15;
    }

    /**
     * @return parametro interno V2
     */
    public JTextField getV2() {
        return V2;
    }

    /**
     * @return parametro interno V3
     */
    public JTextField getV3() {
        return V3;
    }

    /**
     * @return parametro interno V4
     */
    public JTextField getV4() {
        return V4;
    }

    /**
     * @return parametro interno V5
     */
    public JTextField getV5() {
        return V5;
    }

    /**
     * @return parametro interno V6
     */
    public JTextField getV6() {
        return V6;
    }

    /**
     * @return parametro interno V7
     */
    public JTextField getV7() {
        return V7;
    }

    /**
     * @return parametro interno V8
     */
    public JTextField getV8() {
        return V8;
    }

    /**
     * @return parametro interno V9
     */
    public JTextField getV9() {
        return V9;
    }

    /**
     * @return parametro interno tiempo
     */
    public JTextField getTiempo() {
        return tiempo;
    }

    /**
     * @return parametro interno palabra
     */
    public JTextField getPalabra() {
        return palabra;
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
    private javax.swing.JButton agregarDic;
    private javax.swing.JToggleButton allBFS;
    private javax.swing.JToggleButton allDFS;
    private javax.swing.JToggleButton buscarBFS;
    private javax.swing.JToggleButton buscarDFS;
    private javax.swing.JButton guardarTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField palabra;
    private javax.swing.JTextField tiempo;
    // End of variables declaration//GEN-END:variables
}
