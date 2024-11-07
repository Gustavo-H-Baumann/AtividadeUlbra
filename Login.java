import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loginCorreto = "java8";
        String senhaCorreta = "java8";
        int tentativas = 3;
        boolean autenticado = false;

        while (tentativas > 0) {
            System.out.print("Digite o login: ");
            String login = sc.nextLine();
            
            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido! Bem-vindo.");
                autenticado = true;
                break; 
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Login ou senha incorretos. Você ainda tem " + tentativas + " tentativas.");
                } else {
                    System.out.println("Você excedeu o número de tentativas. Acesso negado.");
                }
            }
        }

        if (!autenticado) {
            System.out.println("Acesso negado. Tente novamente mais tarde.");
        }

        sc.close();
    }
}
