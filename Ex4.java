import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double esc;
        System.out.println("uma temperatura: ");
        esc=scan.nextDouble();
        String resp=(esc<15)?"Frio":(esc<25)?"Agradavel":"Quente";
        System.out.println("a temperatura esta "+resp);
    }
}
