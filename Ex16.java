import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int num;
        int mult=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero: ");
        num=scan.nextInt();
        if(num%3==0){
            mult+=1;
        }
        if(num%5==0){
            mult+=2;
        }
        switch (mult) {
            case 1:
                System.out.println("apenas multiplo de 3 ");
                break;
            case 2:
                System.out.println("apenas multiplo de 5");
                break;
            case 3:
                System.out.println("multiplo de 3 e 5");
                break;
            default:
                break;
        }
    }
}
