import javax.swing.*;

public class CalculadoraITBI {

    public static void main(String[] args) {
        String getValorTransacao = JOptionPane.showInputDialog("Digite o valor de transação do imóvel: ");
        double valorTransacao = Double.parseDouble(getValorTransacao); 

        String getValorVenal = JOptionPane.showInputDialog("Digite o valor venal do imóvel: ");
        double valorVenal = Double.parseDouble(getValorVenal);  

        String getPorcentagem = JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI: ");
        double porcentagemITBI = Double.parseDouble(getPorcentagem); 

        double valorMaior = Math.max(valorTransacao, valorVenal);

        double impostoITBI = valorMaior * (porcentagemITBI / 100);

        String mensagem = String.format("Imposto ITBI: R$ %.2f", impostoITBI);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
