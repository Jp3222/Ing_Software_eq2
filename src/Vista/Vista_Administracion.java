package Vista;

import Controlador.Con_Inventario;

/**
 *
 * @author jp
 */
public class Vista_Administracion extends javax.swing.JFrame {

    private Vista_MenuAdmin admin;
    private Con_Inventario controlador;
    private Vista_Info vista;

    public Vista_Administracion(Vista_MenuAdmin admin) {
        this.admin = admin;
        vista = Vista_Info.getNodo();
        //
        this.controlador = new Con_Inventario(admin, this);
        initComponents();
        addControlador();
    }

    private void addControlador() {
        jbtSalir.addActionListener(controlador);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtSalir = new javax.swing.JButton();
        jbtInventario = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txt2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(35, 35, 40));
        jPanel1.setForeground(new java.awt.Color(171, 178, 185));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(35, 35, 40));
        jPanel2.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 200);

        jbtSalir.setBackground(new java.awt.Color(255, 0, 0));
        jbtSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbtSalir.setText("Atras");
        jbtSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jbtSalir);
        jbtSalir.setBounds(0, 550, 300, 50);

        jbtInventario.setBackground(new java.awt.Color(200, 0, 255));
        jbtInventario.setForeground(new java.awt.Color(0, 0, 0));
        jbtInventario.setText("Info");
        jbtInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInventarioActionPerformed(evt);
            }
        });
        jPanel2.add(jbtInventario);
        jbtInventario.setBounds(0, 200, 300, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 300, 600);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(1, 1, 1));
        jTabbedPane1.setFocusable(false);

        jPanel4.setBackground(new java.awt.Color(35, 35, 40));
        jPanel4.setBorder(null);
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Marca", "Pz. Existentes"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(12, 0, 400, 450);

        jLabel2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Buscar");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(410, 0, 50, 25);

        jButton1.setBackground(new java.awt.Color(92, 92, 92));
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Buscar");
        jPanel4.add(jButton1);
        jButton1.setBounds(780, 0, 100, 25);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Clave", "Nombre", "Marca" }));
        jPanel4.add(jComboBox1);
        jComboBox1.setBounds(460, 0, 100, 25);

        jTextField1.setBackground(new java.awt.Color(254, 254, 254));
        jTextField1.setForeground(new java.awt.Color(1, 1, 1));
        jTextField1.setText("jTextField1");
        jPanel4.add(jTextField1);
        jTextField1.setBounds(650, 50, 78, 27);

        jTabbedPane1.addTab("Inventario", null, jPanel4, "Consulta un listado de los productos\nen inventario ");

        jPanel5.setBackground(new java.awt.Color(35, 35, 40));
        jPanel5.setBorder(null);
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(null);

        jTable2.setBackground(new java.awt.Color(35, 35, 40));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 107, 255)));
        jTable2.setForeground(new java.awt.Color(254, 254, 254));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Marca", "Productos"
            }
        ));
        jTable2.setFillsViewportHeight(true);
        jScrollPane2.setViewportView(jTable2);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(0, 190, 880, 273);

        txt2.setForeground(new java.awt.Color(0, 0, 0));
        txt2.setText("Buscar:");
        jPanel5.add(txt2);
        txt2.setBounds(464, 12, 70, 25);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField2);
        jTextField2.setBounds(534, 12, 200, 25);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Marca" }));
        jPanel5.add(jComboBox2);
        jComboBox2.setBounds(734, 12, 110, 25);

        jButton2.setBackground(new java.awt.Color(213, 216, 220));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Buscar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jButton2);
        jButton2.setBounds(464, 72, 390, 25);

        jTabbedPane1.addTab("Marcas", null, jPanel5, "Consulta un listado de los productos\nen inventario ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Agenda", jPanel3);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(300, 0, 900, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInventarioActionPerformed
        vista.setVisible(true);
        vista.setTxt(2);
    }//GEN-LAST:event_jbtInventarioActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtInventario;
    private javax.swing.JButton jbtSalir;
    private javax.swing.JLabel txt2;
    // End of variables declaration//GEN-END:variables
}
