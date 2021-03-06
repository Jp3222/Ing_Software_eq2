package Controlador;

import Modelo.BD;
import Modelo.CL_Movimiento;
import Modelo.Operaciones;
import Modelo.cons;
import Modelo.func;
import Modelo.CL_Producto;
import Vista.Vista_Empleados;
import Vista.Vista_Administracion;
import Vista.Vista_Login;
import Vista.Vista_MenuAdmin;
import Vista.Vista_MenuAdmin.Carrito;
import Vista.Vista_Productos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Con_MenuAdmin extends KeyAdapter implements ActionListener {

    private Vista_MenuAdmin admin;
    private Vista_Login login;
    //
    private Vista_Productos productos;
    private Vista_Administracion administracion;
    private Vista_Empleados empleados;
    //
    private Carrito carrito;
    //
    private final Operaciones opc = Operaciones.getNodo();

    public Con_MenuAdmin(Vista_MenuAdmin admin) {
        this.admin = admin;
        carrito = admin.getCarrito();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Agregar" ->
                Agregar();
            case "Quitar" ->
                Quitar();
            case "Cobrar" ->
                Cobrar();
            case "Buscar" ->
                Buscar();
            case "Perfil" ->
                Perfil();
            case "Empleados" ->
                Empleados();
            case "Productos" ->
                Productos();
            case "Administracion" ->
                Administracion();
            case "Cerrar Sesion" ->
                Cerrar_Sesion();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ENTER ->
                Buscar();
            case KeyEvent.VK_SPACE ->
                Agregar();
        }
    }

    public void Agregar() {
        if (carrito.getProducto() == null) {
            cons.getMessage("Accion", "no valida", "Mensaje", JOptionPane.WARNING_MESSAGE);
            return;
        }
        addCarrito((DefaultTableModel) carrito.getJtbCarrito().getModel());
        carrito.clear();
    }

    public void addCarrito(DefaultTableModel tb) {
        tb.addRow(
                func.getArray(
                        carrito.getClave(),
                        carrito.getNombre(),
                        carrito.getContenido(),
                        carrito.getPiezas() + "",
                        (carrito.getPrecio() * carrito.getPiezas()) + ""
                ));
    }

    public void Quitar() {
        removeCarrito((DefaultTableModel) carrito.getJtbCarrito().getModel());
    }

    public void removeCarrito(DefaultTableModel tb) {
        if (tb.getRowCount() > 0) {
            tb.removeRow(tb.getRowCount() - 1);
        } else {
            cons.getMessage("NO hay productos", "en el carrito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void Cobrar() {
        EmptyCarrito((DefaultTableModel) carrito.getJtbCarrito().getModel());
        carrito.clear();
        CL_Movimiento mov = new CL_Movimiento(
                Sistema.getNodo().getNodoRlg().getCl(),
                cons.getMovimiento(2),
                admin.getUsuario().getUsuario()
        );
        opc.setMovimiento(mov);
    }

    public void EmptyCarrito(DefaultTableModel tb) {
        if (tb.getRowCount() < 1) {
            return;
        }
        double total = 0;
        int fin = tb.getRowCount();
        for (int i = 0; i < fin; i++) {
            total += Double.parseDouble((String) tb.getValueAt(i, tb.getColumnCount() - 1));
        }
        do {
            tb.removeRow(0);
        } while (tb.getRowCount() != 0);
        carrito.setTotal(total);
    }

    public void Buscar() {
        CL_Producto cl = opc.getProducto("*", carrito.getCampo() + " = '" + BD.IN(carrito.getValue()) + "'");
        if (cl == null) {
            cons.getMessage("El producto con " + carrito.getCampo() + ":" + carrito.getValue(), "No existe", "Mnesaje", JOptionPane.WARNING_MESSAGE);
            return;
        }
        carrito.setProducto(cl);
        carrito.clear_2();

    }

    public void Perfil() {
        System.out.println("perfil");
    }

    public void Empleados() {
        admin.dispose();
        empleados.setVisible(true);

    }

    public void Productos() {
        admin.dispose();
        productos.setVisible(true);
    }

    public void Administracion() {
        admin.dispose();
        administracion.setVisible(true);
    }

    public void Cerrar_Sesion() {
        CL_Movimiento mov = new CL_Movimiento(
                Sistema.getNodo().getNodoRlg().getCl(),
                cons.getMovimiento(1),
                admin.getUsuario().getUsuario()
        );
        opc.setMovimiento(mov);
        admin.dispose();
        login.setVisible(true);
    }

    public void setAdministracion(Vista_Administracion administracion) {
        this.administracion = administracion;
    }

    public void setEmpleados(Vista_Empleados empleados) {
        this.empleados = empleados;
    }

    public void setProductos(Vista_Productos productos) {
        this.productos = productos;
    }

    public void setAdmin(Vista_MenuAdmin admin) {
        this.admin = admin;
    }

    public void setLogin(Vista_Login login) {
        this.login = login;
    }

}
