
package ec.edu.ups.vista;


import javax.swing.JButton;
import javax.swing.JOptionPane;


public class TresRaya extends javax.swing.JFrame {

    private int turno,contp,contimp;
    private boolean gano=false;
    public javax.swing.JButton[][] cuadro; 
    
    
    
    public TresRaya() {
        initComponents();
        setTitle("TRES EN RAYA");
        setSize(410, 535);
        setLocation(600,600);
        setLocationRelativeTo(null);
        turno=contp=contimp=1;
        cuadro= new JButton[][]{{btnUno,btnDos,btnTres},{btnCuatro,btnCinco,btnSeis},{btnSiete,btnOcho,btnNueve}};
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        btnNueve = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().setLayout(null);

        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        getContentPane().add(btnNueve);
        btnNueve.setBounds(290, 300, 60, 40);

        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUno);
        btnUno.setBounds(90, 130, 60, 40);

        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        getContentPane().add(btnDos);
        btnDos.setBounds(190, 130, 60, 40);

        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        getContentPane().add(btnTres);
        btnTres.setBounds(290, 130, 60, 40);

        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCuatro);
        btnCuatro.setBounds(90, 210, 60, 40);

        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCinco);
        btnCinco.setBounds(190, 210, 60, 40);

        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeis);
        btnSeis.setBounds(290, 210, 60, 40);

        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiete);
        btnSiete.setBounds(90, 300, 60, 40);

        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        getContentPane().add(btnOcho);
        btnOcho.setBounds(190, 300, 60, 40);

        jLabel1.setFont(new java.awt.Font("Georgia", 2, 36)); // NOI18N
        jLabel1.setText("Tres en Raya");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 40, 220, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/3raya.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 110, 310, 250);

        btnReiniciar.setBackground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(0, 153, 153));
        btnReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/vista/O.png"))); // NOI18N
        btnReiniciar.setText("Volver a jugar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar);
        btnReiniciar.setBounds(90, 390, 290, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
    
       dato(btnUno);
       maquina();
       
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
       dato(btnDos);
       maquina();
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
       dato(btnTres);
       maquina();
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
       dato(btnCuatro);
      maquina();
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        dato(btnCinco);
       maquina();
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
       dato(btnSeis);
       maquina();
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
       dato(btnSiete);
       maquina();
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
       dato(btnOcho);
       maquina();
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        dato(btnNueve);
        maquina();
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        nuevo();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    
    public void dato(JButton cuadro){
    
        if (!gano){
        
            if (cuadro.getText().equals("")){
            
                if (turno%2==1){
                
                    cuadro.setText("X");
                    cuadro.setForeground(java.awt.Color.red);
                    if (contimp>=3){
                    
                       verificar("X");
                    }
                    contimp++;
                }else{
                
                    cuadro.setText("O");
                    cuadro.setForeground(java.awt.Color.red);
                    if (contimp>=3){
                    
                       verificar("O");
                    }
                    contimp++;
                }
                turno++;
            }
        }
    }
    
    public void verificar(String parametro){
    
        int contador=0;
        int a = 0,b = 0;
        boolean reinicio=false;
        for(int x=0;x<2;x++){
        
            for(int i=0;i<cuadro.length;i++){
            
                for (int j=0;j<cuadro.length;j++){
                
                    if (x==0){
                    
                        a=i;
                        b=j;
                    }else{
                    
                        a=j;
                        b=i;
                        
                    }
                    if (cuadro[a][b].getText().equals(parametro)){
                        contador++;
                    }
                }
                
                if (!gano && contador==3){
                
                    JOptionPane.showMessageDialog(null, "GANO JUGADOR 1");
                    
                    if(JOptionPane.showConfirmDialog(null, "desea reiniciar el juego")==0){
                    
                        nuevo();
                        reinicio=true;
                    }else{
                    
                        gano=false;
                    }
                    contador=0;
                    break;
                }
                contador=0;
            }
            
        }
    }
    
    public void nuevo(){
    
        gano = false;
        turno=contp=contimp=1;
        for(int i=0;i<cuadro.length;i++){
        
            for(int j=0;j<cuadro.length;j++){
            
                cuadro[i][j].setText("");
            }
        }
    }
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
            java.util.logging.Logger.getLogger(TresRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TresRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TresRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TresRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TresRaya().setVisible(true);
            }
        });
    }
    public void maquina(){
    
        if(gano==false){
        int p=(int)(Math.random()*(9-1+1)+1);
        System.out.println(p);
        if(p==1){
            if(btnUno.getText().equals("")){
                dato(btnUno);
            }else{
                maquina();
            }
        }else if(p==2){
            if(btnDos.getText().equals("")){
                dato(btnDos);
            }else{
                maquina();
            }
        }else if(p==3){
            if (btnTres.getText().equals("")){
                dato(btnTres);
            }else{
                maquina();
            }
        }else if(p==4){
            if (btnCuatro.getText().equals("")){
                dato(btnCuatro);
            }else{
                maquina();
            }
        }else if (p==5){
            if(btnCinco.getText().equals("")){
                dato(btnCinco);
            }else{
                maquina();
            }
        }else if(p==6){
            if(btnSeis.getText().equals("")){
                dato(btnSeis);
            }else{
                maquina();
            }    
        }else if (p==7){
            if (btnSiete.getText().equals("")){
                dato(btnSiete);
            }else{
                maquina();
            }
        }else if(p==8){
            if (btnOcho.getText().equals("")){    
                dato(btnOcho);
            }else{
                maquina();
            }
        }else if(p==9){
            if(btnNueve.getText().equals("")){
                dato(btnNueve);
            }else{
            maquina();
            }
        }
        } 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
