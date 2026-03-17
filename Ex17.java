import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double val;
        System.out.println("qual o valor da compra");
        val=scan.nextDouble();
        if(val>=500){
            System.out.printf("o valor final com desconto de 20 porcento foi : %.2f ",val-(val*0.20));
        }else if(val>=200){
            System.out.printf("o valor final com desconto de 10 porcento foi : %.2f ",val-(val*0.10));
        }else{
            System.out.println("voce não recebeu desconto");
        }
    }
}