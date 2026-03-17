import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
       int um,dois,tres;
       System.out.println("digite um numero: ");
       um=scan.nextInt();
       System.out.println("digite um numero: ");
       dois=scan.nextInt();
       System.out.println("digite um numero: ");
       tres=scan.nextInt();
       if(um>dois &&um>tres){
        System.out.println("primeiro numero maior: "+um);
       }
       if(dois>um &&dois>tres){
        System.out.println("segundo numero maior: "+dois);
       }
       if(tres>um &&dois<tres){
        System.out.println("terceiro numero maior: "+tres);
       }
       if(tres==um && dois==um){
        System.out.println("todos iguais");
       }
    }
}
