import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
       int um,dois,tres;
       System.out.println("digite primeiro lado: ");
       um=scan.nextInt();
       System.out.println("digite segundo lado: ");
       dois=scan.nextInt();
       System.out.println("digite terceiro lado: ");
       tres=scan.nextInt();
       if(um+dois>tres){
        System.out.print("é um triangulo ");
        if(um==dois&&um==tres){
            System.out.print("equilatero");
        }else if(um==dois|| um==tres||dois==tres){
            System.out.print("isoceles");
        }else{
            System.out.print("escaleno");
        }
       }
    }
}
