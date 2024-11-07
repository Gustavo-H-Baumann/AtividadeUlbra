import java.util.Scanner;

public class CalculoAposentadoria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        System.out.print("Digite seu sexo (M para Masculino, F para Feminino): ");
        String sexo = sc.next().toUpperCase();
        
        System.out.print("Informe o total de anos de contribuição: ");
        int anosContribuicao = sc.nextInt();
        
        String resultado = verificarAposentadoria(idade, sexo, anosContribuicao);
        
        System.out.println(resultado);
        
        sc.close();
    }

    public static String verificarAposentadoria(int idade, String sexo, int anosContribuicao) {
        String resposta = "";
        int idadeAposentadoria = 0;
        int anosContribuicaoMinimos = 0;
        int anosFaltando = 0;

        if (sexo.equals("M")) {
            idadeAposentadoria = 65;
            anosContribuicaoMinimos = 35;
        } else if (sexo.equals("F")) {
            idadeAposentadoria = 62;
            anosContribuicaoMinimos = 30;
        } else {
            return "Sexo inválido. Digite 'M' para Masculino ou 'F' para Feminino.";
        }

        if (idade >= idadeAposentadoria && anosContribuicao >= anosContribuicaoMinimos) {
            resposta = "Você já pode se aposentar!";
        } else {
            if (idade < idadeAposentadoria) {
                anosFaltando = idadeAposentadoria - idade;
                resposta += "Faltam " + anosFaltando + " anos para a aposentadoria por idade.\n";
            }

            if (anosContribuicao < anosContribuicaoMinimos) {
                int anosFaltandoContribuicao = anosContribuicaoMinimos - anosContribuicao;
                resposta += "Faltam " + anosFaltandoContribuicao + " anos de contribuição para a aposentadoria por tempo de contribuição.";
            }
        }

        return resposta;
    }
}

