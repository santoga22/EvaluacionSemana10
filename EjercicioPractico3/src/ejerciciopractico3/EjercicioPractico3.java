package ejerciciopractico3;

import javax.swing.JOptionPane;

public class EjercicioPractico3 {

    public static void main(String[] args) {

        int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de productos"));
        int ventasTienda[][] = new int[7][fila];
        String producto[] = new String[fila];
        Ventas utilMatrix = new Ventas();
        utilMatrix.solData(ventasTienda, 7, fila);
        utilMatrix.producto(producto, fila);
        utilMatrix.random(ventasTienda, 7, fila);

        //utilMatrix.printMatrix(ventasTienda, 7,fila);
    }

}
