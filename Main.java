import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the limit of Fibonacci Series:");

        int a = scan.nextInt();

        int artifac = 1;

        int Debrifac = -1;

        int sum =0;

        int delta = 0;

        boolean Truth = true;

        while (Truth == true) {
            delta++;

            

            sum = artifac+ Debrifac;
            System.out.print(sum+ " ");
            Debrifac = artifac;
            artifac = sum;


            if( delta == a){
                Truth = false;
            }



        }

    }
}