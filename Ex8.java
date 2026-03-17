import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double alt,kg,imc;
        System.out.println("digite digite o seu peso: ");
        kg=scan.nextDouble();
        System.out.println("digite digite o sua altura: ");
        alt=scan.nextDouble();
        imc=kg/alt;
        
        String resp=(imc<18.5)?"Abaixo do peso":(imc<25)?"peso normal":(imc<30)?"Sobrepeso":"obesidade";
        System.out.println("voce esta "+resp);
    }
}
