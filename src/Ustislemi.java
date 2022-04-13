import java.util.Scanner;

public class Ustislemi {
    public static void main(String[] args) {

        int x,y;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        x=inp.nextInt();

        for (int i=1; i<=x; i*=4  ){
            System.out.println(i);
        }
        System.out.println("----------------------------------------");
        for (int i=1; i<=x; i*=5  ){
            System.out.println(i);
        }





    }
}
