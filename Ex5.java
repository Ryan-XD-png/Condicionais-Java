import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double esc,num,resp;
        String tipo;
        System.out.println("digite um numero: ");
        esc=scan.nextDouble();
        System.out.println("digite um numero: ");
        num=scan.nextDouble();
        scan.nextLine();
        System.out.println("digite um operador: ");
        tipo=scan.nextLine();
        System.out.println("resultado é");
        switch (tipo) {
            case "-":
                System.out.println(esc-num);
                break;
            case "+":
                System.out.println(esc+num);
                break;
            case "*":
                System.out.println(esc*num);
                break;
            case "/":
                System.out.println(esc/num);
                break;
            case "%":
                System.out.println(esc%num);
                break;
            default:
                break;
        }

    }
}
