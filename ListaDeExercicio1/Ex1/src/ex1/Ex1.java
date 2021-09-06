package ex1;

import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        
        JOptionPane.showMessageDialog(null, String.format("%s, sua idade é: %d", nome, idade));
    }
}