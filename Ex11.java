import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int esc;
        System.out.println("digite sua idade: ");
        esc=scan.nextInt();
        String resp=(esc>0&&esc<=12)?"R$ 10,00":(esc>12&&esc<60)?"R$ 20,00":"R$ 10,00";
        System.out.println("O valor do ingresso é "+resp);
    }
}
