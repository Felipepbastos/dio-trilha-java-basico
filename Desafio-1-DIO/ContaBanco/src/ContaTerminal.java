import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        int contaCliente = scanner.nextInt();

        System.out.println("Por favor, digite o valor depositado");
        Double saldo = scanner.nextDouble();
        
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + contaCliente + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}

// TODO:
// Importar Scanner
// Exibir mensagens para o usuario
// Obter os dados pelo Scanner pelo terminal
// Exibir a mensagem conta criada