package view;

import controller.Ex2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Ex2 m = new Ex2();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 10 a 999999: "));
        while (num1 < 10 || num1 > 999999){
            JOptionPane.showMessageDialog(null,"O número precisa ser de 10 a 999999!");
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente um valor: "));
        }
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 9: "));
        while (num2 < 0 || num2 > 9){
            JOptionPane.showMessageDialog(null,"O número precisa ser de 0 a 9!");
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente um valor: "));
        }
        System.out.println(m.freccontador(num1, num2, 0));
    }
}