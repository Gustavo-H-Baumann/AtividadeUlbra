import java.util.Scanner;

public class CalculoResistencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da resistência 1 (em ohms): ");
        double res1 = sc.nextDouble();
        
        System.out.print("Digite o valor da resistência es2 (em ohms): ");
        double res2 = sc.nextDouble();
        
        System.out.print("Digite o valor da resistência es3 (em ohms): ");
        double res3 = sc.nextDouble();
        
        System.out.print("Digite o valor da resistência es4 (em ohms): ");
        double res4 = sc.nextDouble();
        
        double resistenciaEquivalente = res1 + res2 + res3 + res4;
        double maiorResistencia = Math.max(Math.max(res1, res2), Math.max(res3, res4));
        double menorResistencia = Math.min(Math.min(res1, res2), Math.min(res3, res4));
        
        System.out.println("Resistência Equivalente: " + resistenciaEquivalente + " ohms");
        System.out.println("Maior Resistência: " + maiorResistencia + " ohms");
        System.out.println("Menor Resistência: " + menorResistencia + " ohms");
        
        sc.close();
    }
}

