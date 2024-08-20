import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            if (valorDoce>mesada)
                valorDoce = mesada;
            
            System.out.println("Valor do doce: " + valorDoce + "é no carrinho" + 1);
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Gastou toda mesada");
    }

    public static double valorAleatorio() {
        return  ThreadLocalRandom.current().nextDouble(2,8);
    }
}
