/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico3;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Ventas {

    /**
     * public void printMatrix(int matrix[][], int a, int fila) {
     *
     * String result = ""; for (int i = 0; i < a; i++) { for (int j = 0; j <
     * fila; j++) { result = result + matrix[i][j] + "-"; } result = result +
     * "\n";
     *
     * }
     * JOptionPane.showMessageDialog(null, result);
     *
     * }
     *
     *
     * public void definirFilas(int matrix[][], int a, int col) { col =
     * Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de
     * productos")); }
    *
     */
    public void solData(int matrix[][], int a, int fila) {
        String result = "";
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < fila; j++) {
            }
        }

    }

    public void random(int matrix[][], int a, int fila) {
        String result = "";
        for (int i = 0; i < a; i++) {
            Random random = new Random();
            for (int j = 0; j < fila; j++) {
                matrix[i][j] = random.nextInt(9);
                result = result + matrix[i][j] + "-";
            }
            result = result + "\n";

        }
        JOptionPane.showMessageDialog(null, result);
    }

    public void producto(String producto[], int fila) {
        String dato = "";
        for (int i = 0; i < fila; i++) {
            producto[i] = JOptionPane.showInputDialog("Ingrese producto " + i);
            dato = dato + producto[i] + "-";
        }
        dato = dato + "\n";
        JOptionPane.showMessageDialog(null, dato);
    }
    public void totalVentas(int matrix[][], int a, int fila){
        
    }
}
