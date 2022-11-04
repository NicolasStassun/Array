import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex4 {
    static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            int TamanhoVetor=0, EscreverNomes=0, id=100;
            System.out.println("Informe o tamanho do vetor: ");
            TamanhoVetor = sc.nextInt();

            String[] nomes = new String[TamanhoVetor];
            for(int opcao=4; opcao!=0;opcao=opcao) {
                System.out.println(" ======== MENU ======== \n" +
                        "1) Cadastrar nome \n" +
                        "2) Pesquisar nome \n" +
                        "3) Listar todos os nome \n" +
                        "0) Sair do programa \n" +
                        "—————————————————————————————— \n");
                opcao = sc.nextInt();

                switch (opcao) {

                    case 1:
                        System.out.println("Informe o nome: ");
                        nomes[EscreverNomes] = sc.next();
                        sc.nextLine();
                        EscreverNomes++;
                        break;
                    case 2:
                        System.out.println("Informe o ID do nome: ");
                        id = sc.nextInt();
                        if(id>TamanhoVetor){
                            System.out.println("Tamanho inválido.");
                        }
                        else {
                            System.out.printf("\n" + nomes[id]+"\n");
                        }
                        break;
                    case 3:
                        for(int escrever=0; escrever<TamanhoVetor;escrever++){
                            System.out.printf("\n"+nomes[escrever]+"\n");
                        }
                        break;


                }
            }
        }
}
