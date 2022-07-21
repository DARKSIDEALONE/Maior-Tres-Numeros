import java.util.Locale;
import java.util.Scanner;

public class Exercicio {


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Entre com o primeiro numero: ");
        int a = sc.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int b = sc.nextInt();
        System.out.println("entre co o terceiro numero ");
        int c = sc.nextInt();


        if (a >= b && a>=c){
            System.out.println("O numero maior foi " + a);
        }
        if (b >= c && b>=a) {

            System.out.println("O numero maior foi: " + b);
        }
        if (c >= a && c >= b){
            System.out.println(" o numero maior foi " + c);
        }
    }
}

