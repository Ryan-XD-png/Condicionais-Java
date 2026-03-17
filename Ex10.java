import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int esc;
        System.out.println("digite um numero: ");
        esc=scan.nextInt();
        String resp=(esc>0)?"positivo":(esc<0)?"negativo":"é zero (0)";
        System.out.println("O numero é "+resp);
    }
}
