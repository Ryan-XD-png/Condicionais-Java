import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
       int um,dois;
       System.out.println("digite um numero: ");
       um=scan.nextInt();
       System.out.println("digite um numero: ");
       dois=scan.nextInt();
       String resp = (um>dois)?"primeiro numero maior":(dois>um)?"segundo numero maior":"todos iguais";
        System.out.println(resp);
    }
}
