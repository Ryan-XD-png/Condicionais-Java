import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int esc;
        System.out.println("digite um numero: ");
        esc=scan.nextInt();
        String resp=(esc%2==0)?"Par":"Impar";
        System.out.println("O numero é "+resp);
    }
}
