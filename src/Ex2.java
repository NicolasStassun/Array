import javax.management.DescriptorRead;
import java.util.Scanner;

public class Ex2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args) {

        int[] numeros = new int[6], numerosPares = new int[6],numerosImpares = new int[6];
        int QuantidadePares=0, QuantidadeImpares=0;

        for(int cont=0; cont<6;cont++){

            System.out.printf("Escreva o número: ");
            numeros[cont] = sc.nextInt();
            if (numeros[cont]==0){
                System.out.println("Zero é um valor nulo, logo não é par nem impar, sendo assim inválido.");
                main(args);
            }

            if(numeros[cont]%2==0){
                numerosPares[cont]=numeros[cont];
                QuantidadePares++;
            }
            else{
                numerosImpares[cont]=numeros[cont];
                QuantidadeImpares++;
            }

        }
        System.out.printf("Quantidade de numeros pares: "+QuantidadePares+"\n");
        for (int escrever=0;escrever<6;escrever++){
            if(numerosPares[escrever]!=0) {
                System.out.printf(numerosPares[escrever]+"\n");
            }
        }
        System.out.printf("Quantidade de numeros impares: "+QuantidadeImpares+"\n");
        for (int escrever1=0;escrever1<6;escrever1++){
            if(numerosImpares[escrever1]!=0) {
                System.out.printf(numerosImpares[escrever1]+"\n");
            }

        }

    }
}
