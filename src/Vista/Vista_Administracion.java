package Vista;

import Controlador.Con_Inventario;
import Controlador.Evt_Ventana;
import javax.swing.JButton;

/**
 *
 * @author jp
 */
public class Vista_Administracion extends javax.swing.JFrame {

    private Vista_MenuAdmin admin;
    private Con_Inventario controlador;
    private Vista_Info vista;
    private Evt_Ventana evt_Ventana;

    public Vista_Administracion(Vista_MenuAdmin admin) {
        this.admin = admin;
        vista = Vista_Info.getNodo();
        //
        this.controlador = new Con_Inventario(admin, this);
        initComponents();
        addControlador();
        evt_Ventana = Evt_Ventana.getNodo();
        addWindowListener(evt_Ventana);
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
        jPanel3 = new javax.swing.JPanel();
        txt4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jbtBuscar1 = new javax.swing.JButton();
        txt5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jbtActualizar1 = new javax.swing.JButton();
        jbtInsertar1 = new javax.swing.JButton();
        jbtEliminar1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMarcas = new javax.swing.JTable();
        txt2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jbtBuscar = new javax.swing.JButton();
        txt3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jbtActualizar_TB = new javax.swing.JButton();
        jbtEliminar = new javax.swing.JButton();
        jbtInsertar = new javax.swing.JButton();
        jbtActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(35, 35, 40));
        jPanel1.setForeground(new java.awt.Color(171, 178, 185));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(35, 35, 40));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 290, 200);

        jbtSalir.setBackground(new java.awt.Color(255, 0, 0));
        jbtSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbtSalir.setText("Atras");
        jbtSalir.setToolTipText("Salir de administracion");
        jbtSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jbtSalir);
        jbtSalir.setBounds(0, 530, 290, 50);

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
        jbtInventario.setBounds(0, 220, 290, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 290, 580);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
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
        jScrollPane1.setBounds(10, 10, 400, 440);

        jLabel2.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Buscar");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(410, 0, 50, 25);

        jButton1.setBackground(new java.awt.Color(92, 92, 92));
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Buscar");
        jPanel4.add(jButton1);
        jButton1.setBounds(510, 180, 100, 25);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Clave", "Nombre", "Marca" }));
        jPanel4.add(jComboBox1);
        jComboBox1.setBounds(460, 0, 100, 25);

        jTextField1.setBackground(new java.awt.Color(254, 254, 254));
        jTextField1.setForeground(new java.awt.Color(1, 1, 1));
        jTextField1.setText("jTextField1");
        jPanel4.add(jTextField1);
        jTextField1.setBounds(560, 0, 220, 35);

        jTabbedPane1.addTab("Inventario", null, jPanel4, "Consulta un listado de los productos\nen inventario ");

        jPanel3.setBackground(new java.awt.Color(35, 35, 40));
        jPanel3.setLayout(null);

        txt4.setForeground(new java.awt.Color(0, 0, 0));
        txt4.setText("Buscar:");
        jPanel3.add(txt4);
        txt4.setBounds(300, 20, 70, 25);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Marca" }));
        jPanel3.add(jComboBox3);
        jComboBox3.setBounds(460, 10, 110, 25);
        jPanel3.add(jTextField4);
        jTextField4.setBounds(570, 10, 200, 25);

        jbtBuscar1.setBackground(new java.awt.Color(213, 216, 220));
        jbtBuscar1.setForeground(new java.awt.Color(0, 0, 0));
        jbtBuscar1.setText("Buscar");
        jbtBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jbtBuscar1);
        jbtBuscar1.setBounds(460, 40, 310, 25);

        txt5.setForeground(new java.awt.Color(0, 0, 0));
        txt5.setText("Empresa :");
        jPanel3.add(txt5);
        txt5.setBounds(390, 100, 70, 25);
        jPanel3.add(jTextField5);
        jTextField5.setBounds(460, 100, 310, 25);

        jbtActualizar1.setBackground(new java.awt.Color(213, 216, 220));
        jbtActualizar1.setForeground(new java.awt.Color(0, 0, 0));
        jbtActualizar1.setText("Actualizar");
        jbtActualizar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jbtActualizar1);
        jbtActualizar1.setBounds(390, 180, 100, 30);

        jbtInsertar1.setBackground(new java.awt.Color(213, 216, 220));
        jbtInsertar1.setForeground(new java.awt.Color(0, 0, 0));
        jbtInsertar1.setText("Insertar");
        jbtInsertar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jbtInsertar1);
        jbtInsertar1.setBounds(520, 180, 100, 30);

        jbtEliminar1.setBackground(new java.awt.Color(213, 216, 220));
        jbtEliminar1.setForeground(new java.awt.Color(0, 0, 0));
        jbtEliminar1.setText("Eliminar");
        jbtEliminar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jbtEliminar1);
        jbtEliminar1.setBounds(660, 180, 100, 30);

        jTabbedPane1.addTab("Agenda", jPanel3);

        jPanel5.setBackground(new java.awt.Color(35, 35, 40));
        jPanel5.setBorder(null);
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(null);

        jtMarcas.setBackground(new java.awt.Color(35, 35, 40));
        jtMarcas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 107, 255)));
        jtMarcas.setForeground(new java.awt.Color(254, 254, 254));
        jtMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Marca"
            }
        ));
        jtMarcas.setFillsViewportHeight(true);
        jScrollPane2.setViewportView(jtMarcas);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 370, 410);

        txt2.setForeground(new java.awt.Color(0, 0, 0));
        txt2.setText("Empresa :");
        jPanel5.add(txt2);
        txt2.setBounds(390, 100, 70, 25);
        jPanel5.add(jTextField2);
        jTextField2.setBounds(460, 100, 310, 25);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Marca" }));
        jPanel5.add(jComboBox2);
        jComboBox2.setBounds(460, 10, 110, 25);

        jbtBuscar.setBackground(new java.awt.Color(213, 216, 220));
        jbtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jbtBuscar.setText("Buscar");
        jbtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jbtBuscar);
        jbtBuscar.setBounds(460, 40, 310, 25);

        txt3.setForeground(new java.awt.Color(0, 0, 0));
        txt3.setText("Buscar:");
        jPanel5.add(txt3);
        txt3.setBounds(390, 10, 70, 25);
        jPanel5.add(jTextField3);
        jTextField3.setBounds(570, 10, 200, 25);

        jbtActualizar_TB.setBackground(new java.awt.Color(213, 216, 220));
        jbtActualizar_TB.setForeground(new java.awt.Color(0, 0, 0));
        jbtActualizar_TB.setText("Actualizar Tabla");
        jbtActualizar_TB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jbtActualizar_TB);
        jbtActualizar_TB.setBounds(10, 440, 370, 30);

        jbtEliminar.setBackground(new java.awt.Color(213, 216, 220));
        jbtEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jbtEliminar.setText("Eliminar");
        jbtEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jbtEliminar);
        jbtEliminar.setBounds(660, 180, 100, 30);

        jbtInsertar.setBackground(new java.awt.Color(213, 216, 220));
        jbtInsertar.setForeground(new java.awt.Color(0, 0, 0));
        jbtInsertar.setText("Insertar");
        jbtInsertar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jbtInsertar);
        jbtInsertar.setBounds(520, 180, 100, 30);

        jbtActualizar.setBackground(new java.awt.Color(213, 216, 220));
        jbtActualizar.setForeground(new java.awt.Color(0, 0, 0));
        jbtActualizar.setText("Actualizar");
        jbtActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jbtActualizar);
        jbtActualizar.setBounds(390, 180, 100, 30);

        jTabbedPane1.addTab("Marcas", null, jPanel5, "Consulta un listado de los productos\nen inventario ");

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(310, 10, 880, 530);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton jbtActualizar;
    private javax.swing.JButton jbtActualizar1;
    private javax.swing.JButton jbtActualizar_TB;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtBuscar1;
    private javax.swing.JButton jbtEliminar;
    private javax.swing.JButton jbtEliminar1;
    private javax.swing.JButton jbtInsertar;
    private javax.swing.JButton jbtInsertar1;
    private javax.swing.JButton jbtInventario;
    private javax.swing.JButton jbtSalir;
    private javax.swing.JTable jtMarcas;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    // End of variables declaration//GEN-END:variables

    public class Marcas {

        public JButton getJbtActualizar() {
            return jbtActualizar;
        }

        public JButton getJbtActualizar_TB() {
            return jbtActualizar_TB;
        }

        public JButton getJbtInsertar() {
            return jbtInsertar;
        }

        public JButton getJbtBuscar() {
            return jbtBuscar;
        }

        public JButton getJbtEliminar() {
            return jbtEliminar;
        }

    }

    public class agenda {
    }

    public class Inventario {
    }

}
