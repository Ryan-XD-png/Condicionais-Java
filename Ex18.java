import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int esc;
        System.out.println("digite um numero de 1 a 10");
        esc=scan.nextInt();
        System.out.println("mesmo numero em romano");
        switch (esc) {
            case 1:
                System.out.println("I");
            break;
            case 2:
                System.out.println("II");
            break;
            case 3:
                System.out.println("III");
            break;
            case 4:
                System.out.println("IV");
            break;
            case 5:
                System.out.println("V");
            break;
            case 6:
                System.out.println("VI");
            break;
            case 7:
                System.out.println("VII");
            break;
            case 8:
                System.out.println("VIII");
            break;
            case 9:
                System.out.println("IX");
            break;
            case 10:
                System.out.println("X");
            break;
    
            default:
                System.out.println("numero incorreto");
                break;
            }
    }
}
