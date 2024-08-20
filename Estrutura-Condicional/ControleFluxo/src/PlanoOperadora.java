public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B";

        switch(plano){
            case "T": {
                System.out.println("5GB youtube");
            }
            case "M": {
                System.out.println("Whatsapp e instagram");
            }
            case "B": {
                System.out.println("100 min de ligação");
            }
        }
    }
}
