package View;

public class Inicio_GUI extends javax.swing.JFrame {

    public Inicio_GUI() {
        initComponents();
        img1.setVisible(false);
        img2.setVisible(false);
        img3.setVisible(false);
        img4.setVisible(false);
        img5.setVisible(false);
        img6.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Altura1 = new javax.swing.JTextField();
        Peso1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Limpar_BTN = new javax.swing.JButton();
        Calcular_BTN1 = new javax.swing.JButton();
        IMC1 = new javax.swing.JTextField();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        Sair_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Calculo de IMC");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 0, 140, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Peso :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 50, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Altura :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 120, 60, 30);

        Altura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Altura1ActionPerformed(evt);
            }
        });
        getContentPane().add(Altura1);
        Altura1.setBounds(80, 120, 80, 30);

        Peso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Peso1ActionPerformed(evt);
            }
        });
        getContentPane().add(Peso1);
        Peso1.setBounds(80, 70, 80, 30);

        jPanel1.setLayout(null);

        Limpar_BTN.setText("Limpar");
        Limpar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpar_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(Limpar_BTN);
        Limpar_BTN.setBounds(130, 190, 90, 40);

        Calcular_BTN1.setText("Calcular");
        Calcular_BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcular_BTN1ActionPerformed(evt);
            }
        });
        jPanel1.add(Calcular_BTN1);
        Calcular_BTN1.setBounds(20, 190, 90, 40);

        IMC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMC1ActionPerformed(evt);
            }
        });
        jPanel1.add(IMC1);
        IMC1.setBounds(30, 250, 400, 40);

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/img_a.png"))); // NOI18N
        jPanel1.add(img1);
        img1.setBounds(320, 160, 40, 10);

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/img_b.png"))); // NOI18N
        jPanel1.add(img2);
        img2.setBounds(320, 150, 34, 14);

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/img_c.png"))); // NOI18N
        jPanel1.add(img3);
        img3.setBounds(320, 150, 34, 14);

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/img_d.png"))); // NOI18N
        jPanel1.add(img4);
        img4.setBounds(330, 150, 30, 20);

        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/img_d.png"))); // NOI18N
        jPanel1.add(img5);
        img5.setBounds(320, 150, 34, 14);

        img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/img_e.png"))); // NOI18N
        jPanel1.add(img6);
        img6.setBounds(320, 150, 34, 14);

        Sair_BTN.setText("Sair");
        Sair_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(Sair_BTN);
        Sair_BTN.setBounds(10, 310, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 350);

        setSize(new java.awt.Dimension(464, 345));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sair_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair_BTNActionPerformed
        //Botão Sair
        System.exit(0);
    }//GEN-LAST:event_Sair_BTNActionPerformed

    private void Peso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Peso1ActionPerformed
        //Peso        
    }//GEN-LAST:event_Peso1ActionPerformed

    private void Limpar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpar_BTNActionPerformed
        // Botão de Limpar
        Controller.Calcula_DAO.limpar();
    }//GEN-LAST:event_Limpar_BTNActionPerformed

    private void Altura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altura1ActionPerformed
        //Altura        
    }//GEN-LAST:event_Altura1ActionPerformed

    private void IMC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMC1ActionPerformed
        //Resultado do calculo        
    }//GEN-LAST:event_IMC1ActionPerformed

    private void Calcular_BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcular_BTN1ActionPerformed
        //Botão Calcular
        Controller.Calcula_DAO.calc_imc();
    }//GEN-LAST:event_Calcular_BTN1ActionPerformed

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Altura1;
    private javax.swing.JButton Calcular_BTN1;
    public static javax.swing.JTextField IMC1;
    private javax.swing.JButton Limpar_BTN;
    public static javax.swing.JTextField Peso1;
    private javax.swing.JButton Sair_BTN;
    public static javax.swing.JLabel img1;
    public static javax.swing.JLabel img2;
    public static javax.swing.JLabel img3;
    public static javax.swing.JLabel img4;
    public static javax.swing.JLabel img5;
    public static javax.swing.JLabel img6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
