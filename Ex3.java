import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
       double um,dois,tres,uns,media;
       System.out.println("digite nota : ");
       um=scan.nextDouble();
       System.out.println("digite nota : ");
       dois=scan.nextDouble();
       System.out.println("digite nota : ");
       tres=scan.nextDouble();
       System.out.println("digite nota : ");
       uns=scan.nextDouble();
       media=(um+dois+tres+uns)/4;
       String se =(media<5)?"Reprovado":(media<7)?"Recuperação":"aprovado";
       System.out.println(se);
    }
}
