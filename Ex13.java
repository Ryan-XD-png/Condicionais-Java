import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int esc;
        System.out.println("escolha um mês de 1 a 12");
        esc=scan.nextInt();
        System.out.println("mes escolhido foi ");
        switch (esc) {
            case 1:
                System.out.println("Janeiro");
            break;
            case 2:
                System.out.println("Fevereiro");
            break;
            case 3:
                System.out.println("março");
            break;
            case 4:
                System.out.println("Abril");
            break;
            case 5:
                System.out.println("maio");
            break;
            case 6:
                System.out.println("junho");
            break;
            case 7:
                System.out.println("julho");
            break;
            case 8:
                System.out.println("agosto");
            break;
            case 9:
                System.out.println("setembro");
            break;
            case 10:
                System.out.println("outubro");
            break;
            case 11:
                System.out.println("novembro");
            break;
            case 12:
                System.out.println("dezembro");
            break;
            default:
                System.out.println("numero incorreto");
                break;
            }
    }
}
