package ex9;

import javax.swing.JOptionPane;
import java.util.Random;

public class Ex9 {

    public static void main(String[] args) {

        // Declaração de array 1 e preenchimento com valores aletatorios
        int vet1[] = new int[10];
        
        Random rand = new Random();

        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = rand.nextInt(10) + 1;
        }

        // Declaração do array 2 e preenchimento com dados do usuario
        int vet2[] = new int[3];

        for (int i=0; i<vet2.length; i++) {
            vet2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("Digite o %d° número: ", i + 1)));
        }

        // Verificação se array 2 está contido no array 1
        int cont = 0;
        int indice = 0;

        for (int i = 0; i < vet1.length; i++) {
            if (vet1[i] == vet2[cont]) {
                cont++;
            } else {
                cont = 0;
            }
            
            if (cont == 3) {
                indice = i-2;
                break;
            }
        }

        // Geração da string de saída
        StringBuilder sb = new StringBuilder();

        sb.append("O vetor digitado: \n");

        for (int n : vet2) {
           sb.append(n)
                   .append(" ");
        }
        
        if (cont == 3) {
            sb.append("\nestá contido no vetor abaixo a partir do indice ")
                    .append(indice)
                    .append("\n");
        } else {
            sb.append("\nnão está contido no vetor: ");
        }
        
        for (int n : vet1) {
            sb.append(n)
                    .append(" ");
        }
        
        // Mensagem de saída
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
