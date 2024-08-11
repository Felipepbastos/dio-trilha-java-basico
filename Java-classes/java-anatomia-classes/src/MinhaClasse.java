public class MinhaClasse {
    // public static void main(String[] args) {
    //     System.out.print("Olá Mundo");
    // }

    // public static void main (String[] args){
    //     String meuNome = "Felipe";

    //     int anoFabricacao = 2022;

    //     boolean verdadeira = true;
    // //    tipo nome definido =  atribuição
    //     anoFabricacao = 2028;
    // }
    public static void main(String[] args) {
        String primeiroNome = "Felipe";
        String segundoNome = "Paixao";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
