import java.util.Scanner;

public class Ex1 {
    static Scanner sc = new Scanner(System.in);
     public static void main(String[]args) {
         double maiorValorReceber = 0.0, menorValorReceber = 10000000.0, totalDeVendas = 0;
         double[] vendas = new double[10], percentual = new double[10], receber = new double[10],lucroVendas = new double[10];
         String[] vendedores = new String[10];
         String vendedorReceberMaior = "", vendedorReceberMenor = "";


         for (int cont = 0; cont < 10; cont++) {
             System.out.println("Informe o nome do Vendedor: ");
             vendedores[cont] = sc.next();
             sc.nextLine();

             System.out.println("Informe o número de vendas: ");
             vendas[cont] = sc.nextDouble();

             System.out.println("Informe o lucro total das Vendas: ");
             lucroVendas[cont] = sc.nextDouble();

             System.out.println("Informe o percentual de cada vendedor: ");
             percentual[cont] = sc.nextDouble();
             percentual[cont] /= 100;
             receber[cont] = lucroVendas[cont] * percentual[cont];

             if (receber[cont] > maiorValorReceber) {
                 maiorValorReceber = receber[cont];
                 vendedorReceberMaior = vendedores[cont];

             }
             if (receber[cont] < menorValorReceber) {
                 menorValorReceber = receber[cont];
                 vendedorReceberMenor = vendedores[cont];
             }
             totalDeVendas += vendas[cont];
         }
         for (int escrever = 0; escrever < 10; escrever++){
             if(vendedores[escrever]!=null || vendedores[escrever]!="") {
                 System.out.printf("O vendedor " + vendedores[escrever] + " tem a receber R$" + receber[escrever] + "\n");
             }
             if(receber[escrever]!=0.0) {
                 System.out.printf("O vendedor " + vendedores[escrever] + " tem a receber R$" + receber[escrever] + "\n");
             }
         }

         System.out.printf("O total de vendas foi de "+totalDeVendas+" vendas.\n");
         System.out.printf("O vendedor que mais vai receber é o "+vendedorReceberMaior+" e ele irá receber R$"+maiorValorReceber+"\n");
         System.out.printf("O vendedor que menos vai receber é o "+vendedorReceberMenor+" e ele irá receber R$"+menorValorReceber+"\n");




     }



}
