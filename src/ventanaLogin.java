
import Borde.RoundedBorder;
import static Conexion.Conexion.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class ventanaLogin extends javax.swing.JFrame {

    /**
     * Creates new form ventanaLogin
     */
    public ventanaLogin() {
        initComponents();
        conectar();
        pnlIniciar.setVisible(false);
        txtNombre.setBorder(new RoundedBorder(20));
        txtPass.setBorder(new RoundedBorder(20));
        txtPassI.setBorder(new RoundedBorder(20));
        txtTel.setBorder(new RoundedBorder(20));
        txtUsuario.setBorder(new RoundedBorder(20));
        txtUsuarioI.setBorder(new RoundedBorder(20));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIniciar = new javax.swing.JPanel();
        chxTerI = new javax.swing.JCheckBox();
        lblReg = new javax.swing.JLabel();
        jPanelRound3 = new LIB.JPanelRound();
        lblIniciarS = new javax.swing.JLabel();
        jPanelRound1 = new LIB.JPanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuarioI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPassI = new javax.swing.JPasswordField();
        pnlReg = new javax.swing.JPanel();
        chxTer = new javax.swing.JCheckBox();
        lblIniciar = new javax.swing.JLabel();
        jPanelRound4 = new LIB.JPanelRound();
        lblRegistro = new javax.swing.JLabel();
        jPanelRound5 = new LIB.JPanelRound();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtNombre = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlIniciar.setPreferredSize(new java.awt.Dimension(1000, 600));
        pnlIniciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chxTerI.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        chxTerI.setText("Mantener sesión iniciada");
        pnlIniciar.add(chxTerI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 250, -1));

        lblReg.setBackground(new java.awt.Color(255, 255, 255));
        lblReg.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblReg.setText("No tienes una cuenta? Registrate");
        lblReg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegMouseClicked(evt);
            }
        });
        pnlIniciar.add(lblReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 200, 30));

        jPanelRound3.setBackground(new java.awt.Color(234, 69, 76));
        jPanelRound3.setToolTipText("");
        jPanelRound3.setOpaque(true);

        lblIniciarS.setFont(new java.awt.Font("Calibri", 1, 21)); // NOI18N
        lblIniciarS.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciarS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciarS.setText("Iniciar Sesión");
        lblIniciarS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblIniciarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniciarSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelRound3Layout = new javax.swing.GroupLayout(jPanelRound3);
        jPanelRound3.setLayout(jPanelRound3Layout);
        jPanelRound3Layout.setHorizontalGroup(
            jPanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIniciarS, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRound3Layout.setVerticalGroup(
            jPanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIniciarS, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlIniciar.add(jPanelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c392ba101244345 1.png"))); // NOI18N

        javax.swing.GroupLayout jPanelRound1Layout = new javax.swing.GroupLayout(jPanelRound1);
        jPanelRound1.setLayout(jPanelRound1Layout);
        jPanelRound1Layout.setHorizontalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelRound1Layout.setVerticalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlIniciar.add(jPanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 530, 600));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setText("Bienvenido de nuevo");
        pnlIniciar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtUsuarioI.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pnlIniciar.add(txtUsuarioI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 310, 40));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel3.setText("Bienvenido de nuevo! Porfavor ingrese sus datos");
        pnlIniciar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 310, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Contraseña");
        pnlIniciar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Usuario");
        pnlIniciar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        txtPassI.setText("jPasswordField1");
        pnlIniciar.add(txtPassI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 310, 40));

        pnlReg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chxTer.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        chxTer.setText("Aceptar Terminos y Condiciones");
        pnlReg.add(chxTer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 250, -1));

        lblIniciar.setBackground(new java.awt.Color(255, 255, 255));
        lblIniciar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblIniciar.setText("Tienes una cuenta? Inicia Sesión");
        lblIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniciarMouseClicked(evt);
            }
        });
        pnlReg.add(lblIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 200, 30));

        jPanelRound4.setBackground(new java.awt.Color(234, 69, 76));
        jPanelRound4.setToolTipText("");
        jPanelRound4.setOpaque(true);

        lblRegistro.setFont(new java.awt.Font("Calibri", 1, 21)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistro.setText("Registrarse");
        lblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelRound4Layout = new javax.swing.GroupLayout(jPanelRound4);
        jPanelRound4.setLayout(jPanelRound4Layout);
        jPanelRound4Layout.setHorizontalGroup(
            jPanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelRound4Layout.setVerticalGroup(
            jPanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlReg.add(jPanelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 160, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c392ba101244345 1.png"))); // NOI18N

        javax.swing.GroupLayout jPanelRound5Layout = new javax.swing.GroupLayout(jPanelRound5);
        jPanelRound5.setLayout(jPanelRound5Layout);
        jPanelRound5Layout.setHorizontalGroup(
            jPanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelRound5Layout.setVerticalGroup(
            jPanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlReg.add(jPanelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 530, 600));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel11.setText("Bienvenido");
        pnlReg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pnlReg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 310, 40));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel12.setText("Bienvenido! Porfavor ingrese sus datos");
        pnlReg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 310, -1));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel15.setText("Telefono");
        pnlReg.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel16.setText("Nombre");
        pnlReg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        txtPass.setText("jPasswordField1");
        pnlReg.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 310, 40));

        txtNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pnlReg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 310, 40));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel17.setText("Usuario");
        pnlReg.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtTel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pnlReg.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 310, 40));

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel18.setText("Contraseña");
        pnlReg.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblIniciarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarSMouseClicked
        try {
            st = cnn.createStatement();
            String u = "";
            String p;
            String sql = "SELECT Usuario,Contraseña from cliente where Usuario='" + txtUsuarioI.getText() + "'";  //Consulta sql
            ResultSet resultado = st.executeQuery(sql);  //Linea que ejecuta la consulta sql y almacena los datos en resultado
            if (resultado.next()) {                                    //Bucle que recorre la consulta obtenida
                u = resultado.getString("usuario");
                p = resultado.getString("contraseña");
                
                //showMessageDialog(null,p);
                if (txtPassI.getText().equals(p)) {                   
                    System.out.println("Iniciaste sesión correctamente");
                    PnlCarrito.main();
                    this.dispose();
                    //Lo que pasa cuando inicias sesión correctamente
                } else {
                    showMessageDialog(null, "CONTRASEÑA INCORRECTA");
                }
            } else {
                showMessageDialog(null, "NO EXISTE EL USUARIO");
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al cargar los Datos\n" + ex);
        }
    }//GEN-LAST:event_lblIniciarSMouseClicked

    private void lblRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegMouseClicked
        pnlReg.setVisible(true);
        pnlIniciar.setVisible(false);
    }//GEN-LAST:event_lblRegMouseClicked

    private void lblIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseClicked
        pnlReg.setVisible(false);
        pnlIniciar.setVisible(true);
    }//GEN-LAST:event_lblIniciarMouseClicked

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        try {
            st = cnn.createStatement();
            String R[] = new String[4];
            R[0] = txtNombre.getText();
            R[1] = txtPass.getText();
            R[2] = txtPass.getText();
            R[3] = txtTel.getText();
            String sql = "INSERT INTO cliente (Nombre,Usuario,Contraseña,Telefono)VALUES ('" + R[0] + "','" + R[1] + "','" + R[2] + "','" + R[3] + "')"; //Consulta sql
            System.out.print(sql);
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ventanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblRegistroMouseClicked

    public void cargarDatos() {
        String datos[] = new String[4];    //Variable que almacena los datos de la consulta
        String sql = "select * from Usuarios";  //Consulta sql
        try {
            ResultSet resultado = st.executeQuery(sql);  //Linea que ejecuta la consulta sql y almacena los datos en resultado

            while (resultado.next()) {                                    //Bucle que recorre la consulta obtenida
                datos[0] = resultado.getInt("id_usuario") + "";
                datos[1] = resultado.getString("username");
                datos[2] = resultado.getString("password") + "";
                datos[3] = resultado.getString("privilegio") + "";
                //m.addRow(datos);
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al cargar los Datos\n" + ex);
        }
    }
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
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chxTer;
    private javax.swing.JCheckBox chxTerI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private LIB.JPanelRound jPanelRound1;
    private LIB.JPanelRound jPanelRound3;
    private LIB.JPanelRound jPanelRound4;
    private LIB.JPanelRound jPanelRound5;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JLabel lblIniciarS;
    private javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel pnlIniciar;
    private javax.swing.JPanel pnlReg;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPassI;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioI;
    // End of variables declaration//GEN-END:variables
}
