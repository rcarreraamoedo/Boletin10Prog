/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Adivina {
    private int cont;
    private int numero;
    private int intentos;
    private int numeroSecreto;

    Scanner sc = new Scanner(System.in);

    public void pedirNumero1() {
        do {
            int numSecreto = Integer.parseInt(JOptionPane.showInputDialog("Numero Secreto entre 1 y 50"));
            this.numeroSecreto = numSecreto;
            int inte = Integer.parseInt(JOptionPane.showInputDialog("Numero de intentos limitados"));
            this.intentos = inte;
        } while (numeroSecreto <= 0|| numeroSecreto >= 51);
    }
    
    public void pedirNumero2() {
        do {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Adivina cual es el numero?"));
            this.numero = num;
        } while (numero > 51 || numero < 0);
    }

    public void Adivinar() {
         for (cont = 0; cont < intentos && numero != numeroSecreto; cont++) {
            pedirNumero2();
            if (numero > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "El numero es menor");
            } else if (numero < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "El numero es más grande");
            }
        }
        if (numeroSecreto == numero) {
            JOptionPane.showMessageDialog(null, "Has acertado");
        } else {
            JOptionPane.showMessageDialog(null, "Has fallado");
        }
    }
}
