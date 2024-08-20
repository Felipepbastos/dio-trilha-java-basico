import java.util.Scanner;

public class CalculadoraSimples {
    
    // função para somar
    public static double somar(double a, double b){
        return a + b;
    }
    
    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não permitida.");
            return 0;
        }
        return a / b; 
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Qual operação deseja realizar? +, -, *, /   ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = somar(num1, num2);                
                break;

            case '-':
                resultado = subtrair(num1, num2);
                break;
            
            case '*': 
                resultado = multiplicar(num1, num2);
                break;

            case '/': 
                resultado = dividir(num1, num2);
                break;
        
            default:
                System.out.println("Operação invalida.");
                break;
        }
        scanner.close();
        System.out.println("O resultado é " + resultado);
    }

    
}
