import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int esc;
        System.out.println("digite um numero de 1 a 7");
        esc=scan.nextInt();
        System.out.println("dia da semana equivalente");
        switch (esc) {
            case 1:
                System.out.println("Domingo");
            break;
            case 2:
                System.out.println("segunda-feira");
            break;
            case 3:
                System.out.println("terça-feira");
            break;
            case 4:
                System.out.println("quarta-feira");
            break;
            case 5:
                System.out.println("quinta-feira");
            break;
            case 6:
                System.out.println("sexta-feira");
            break;
            case 7:
                System.out.println("sabado");
            break;
    
            default:
                System.out.println("dia incorreto");
                break;
            }
    }
}
