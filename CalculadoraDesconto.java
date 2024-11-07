import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.println("Informe a porcentagem de desconto: ");
        double desconto = sc.nextDouble();

        double valorDesconto = valorProduto * (desconto/100);
        System.out.printf("O desconto aplicado foi de R$ %.2f%n" , valorDesconto);

        double precoFinal = valorProduto - valorDesconto;
        System.out.printf("O preço final do produto é de R$ %.2f%n" , precoFinal);

        sc.close();
    }
}
