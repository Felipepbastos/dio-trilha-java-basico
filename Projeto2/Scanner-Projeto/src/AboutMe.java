import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args){
        // Coletando os dados 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua Altura");
        double altura = scanner.nextDouble();
        
        System.out.println("Digite seu Nome");
        String nome = scanner.next();
        
        System.out.println("Digite sua Idade");
        int idade = scanner.nextInt();

        // Imprimindo os dados

        System.out.println("Ola meu nome é " + nome);
        System.out.println("Tenho " + idade + "     canos de idade.");
        System.out.println("Tenho " + altura + " CM de altura");     
        scanner.close();                                                            
    }
}
