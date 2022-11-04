import java.util.Scanner;
import java.util.Random;

public class Ex3 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double Media=0.0, Maior=.0, Menor=41.0;
        int dias=0;

        while(dias<120) {
                dias++;
                double temp = 0.0;
                Random temperatura = new Random();
                temp = temperatura.nextDouble();
                temp*=100;
                if(temp>=15 & temp<=40) {

                    Media+=temp;

                    if(temp>Maior){
                        Maior=temp;
                    }
                    if(temp<Menor) {
                        Menor = temp;
                    }
                }
                else{
                    dias--;
                }

        }
            Media/=dias;
            System.out.println("A maior temperatura foi de: "+Maior+"°\n");
            System.out.println("A menor temperatura foi de: "+Menor+"°\n");
            System.out.println("A media das temperaturas foi de: "+Media+"°\n");
    }

}
