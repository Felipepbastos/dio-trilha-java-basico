public class ExemploFor {
    // public static void main(String[] args) {
    //     for ( int carneirinho = 1; carneirinho <= 20; carneirinho ++ ){
    //         System.out.println("Contando " + carneirinho);
    //     };
        
    // };
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS","JULIA","MARCOS"};

        // for (int x=0; x <= alunos.length; x++){
        //     System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        // };
        for(String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }


}
