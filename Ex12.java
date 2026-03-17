import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double esc;
        System.out.println("digite uma nota de 0 a 10: ");
        esc=scan.nextDouble();
        String resp=(esc>=9&&esc<=10)?"A":(esc<9&&esc>=7)?"B":(esc<7&&esc>=5)?"C":"D";
        System.out.println("a nota foi "+resp);
    }
}
