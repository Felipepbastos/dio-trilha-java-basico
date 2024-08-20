import java.util.Scanner;

public class CalculadoraTernaria {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            System.out.println("Escolha a operação: +, -, *, /");
            char operacao = scanner.next().charAt(0);
            
            // Usando operador ternário para cada operação
            double resultado = (operacao == '+') ? num1 + num2
                             : (operacao == '-') ? num1 - num2
                             : (operacao == '*') ? num1 * num2
                             : (operacao == '/') ? (num2 != 0 ? num1 / num2 : Double.NaN)
                             : Double.NaN; // Valor padrão caso a operação seja inválida
            
            // Exibir o resultado ou mensagem de erro
            String mensagem = (operacao == '/' && num2 == 0) ? "Erro: Divisão por zero."
                           : (Double.isNaN(resultado)) ? "Operação inválida."
                           : "O resultado é: " + resultado;
                           
            System.out.println(mensagem);
        }
    }
}
