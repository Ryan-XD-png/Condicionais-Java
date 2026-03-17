import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int esc;
        System.out.println("digite um ano: ");
        esc=scan.nextInt();;
        String resp=(esc%4==0)?"bissexto":"não bissexto";
        System.out.println("O ano é "+resp);
    }
}
