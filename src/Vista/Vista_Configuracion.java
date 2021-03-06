package Vista;

import Controlador.Sistema.Install;
import Controlador.Sistema;
import Modelo.Ficheros;
import Modelo.cons;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Vista_Configuracion extends javax.swing.JFrame {

    private String user, pass, url;
    private Install so;

    public Vista_Configuracion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfUrl = new javax.swing.JTextField();
        jtfUser = new javax.swing.JTextField();
        jtfPass = new javax.swing.JTextField();
        jbtConectar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("J - Shop");

        jPanel1.setBackground(new java.awt.Color(35, 35, 40));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 230, 100, 25);

        jLabel3.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 200, 100, 25);

        jtfUrl.setBackground(new java.awt.Color(255, 255, 255));
        jtfUrl.setForeground(new java.awt.Color(1, 1, 1));
        jtfUrl.setText("jdbc:mysql://localhost/Tienda");
        jtfUrl.setToolTipText("Ruta de la base de datos");
        jPanel1.add(jtfUrl);
        jtfUrl.setBounds(150, 260, 200, 25);

        jtfUser.setBackground(new java.awt.Color(255, 253, 255));
        jtfUser.setForeground(new java.awt.Color(1, 1, 1));
        jtfUser.setToolTipText("Usuario de MySql");
        jPanel1.add(jtfUser);
        jtfUser.setBounds(150, 200, 200, 25);

        jtfPass.setBackground(new java.awt.Color(255, 255, 255));
        jtfPass.setForeground(new java.awt.Color(1, 1, 1));
        jtfPass.setToolTipText("Contraseña MySql");
        jPanel1.add(jtfPass);
        jtfPass.setBounds(150, 230, 200, 25);

        jbtConectar.setBackground(new java.awt.Color(96, 17, 207));
        jbtConectar.setForeground(new java.awt.Color(255, 255, 255));
        jbtConectar.setText("Conectar");
        jbtConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConectarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtConectar);
        jbtConectar.setBounds(0, 510, 400, 29);

        jLabel4.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Ruta");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 260, 100, 25);

        jTextArea1.setBackground(new java.awt.Color(16, 16, 16));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 253, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Los datos solicitados son para establecer una conexion\nentre el programa y la base de datos.\n\nEL usuario dado debera tener permisos para poder:\nInsertar\nLeer\nActualizar\nBorrar \nInformacion correspondiente de la base de datos establecida");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 300, 400, 200);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/JSHOP.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 400, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConectarActionPerformed
        user = jtfUser.getText();
        pass = jtfPass.getText();
        url = jtfUrl.getText();
        Init();
        this.dispose();
    }//GEN-LAST:event_jbtConectarActionPerformed

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    private void Init() {
        Ficheros ft = new Ficheros();
        if (!ft.Exists(cons.url(1) + "/Install.jshop")) {
            so = Sistema.getNodo().getNodoIll();
            so.Install(user, pass, url);
            Sistema.getNodo().star();
            Vista_Login log = Vista_Login.getNodo();
            log.setVisible(true);
        } else {
            Vista_Login log = Vista_Login.getNodo();
            log.dispose();
            ft.escribirArchivo(cons.url(1) + "/Usuario.jshop", user + "-" + pass + "-" + url);
            cons.getMessage("Para que los cambios se apliquen", "vuela a abrir el programa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            System.exit(1);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtConectar;
    private javax.swing.JTextField jtfPass;
    private javax.swing.JTextField jtfUrl;
    private javax.swing.JTextField jtfUser;
    // End of variables declaration//GEN-END:variables
}
