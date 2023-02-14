import java.io.Console;
import java.util.Scanner;





public class Test {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Basamak Sayısı:");
        int sayi= input.nextInt();
        for(int i=1;i<=sayi;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int yildiz=1;yildiz<=(2*(sayi-i))-1;yildiz++){
                System.out.print("*");
            }
            System.out.println();


        }

    }
}














