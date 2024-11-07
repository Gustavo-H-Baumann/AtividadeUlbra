import javax.swing.*;

public class MediaAluno {

    public static void main(String[] args) {
    
        double nota1 = 0, nota2 = 0, trabalho = 0;

        nota1 = obterNota("Digite a nota da primeira prova:");
        nota2 = obterNota("Digite a nota da segunda prova:");
        trabalho = obterNota("Digite a nota do trabalho:");

        double media = (nota1 + nota2 + trabalho) / 3;
        String resultado = media >= 6 ? "Aprovado" : "Reprovado";

        String resposta = String.format("Média: %.2f\nStatus: %s", media, resultado);
        JOptionPane.showMessageDialog(null, resposta);
    }


    public static double obterNota(String mensagem) {
        double nota;
        while (true) {
            String input = JOptionPane.showInputDialog(mensagem);
            try {
                nota = Double.parseDouble(input);
                if (nota >= 0 && nota <= 10) {
                    return nota;
                } else {
                    JOptionPane.showMessageDialog(null, "Nota inválida! A nota deve estar entre 0 e 10.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, insira um número válido.");
            }
        }
    }
}

