import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int vel,lim;
        System.out.println("qual o limite da via: "); 
        lim=scan.nextInt();
        System.out.println("qual a velocidade do carro: "); 
        vel=scan.nextInt(); 
        if(vel<=lim){
            System.out.println("Sem multa");
        }else if (vel<=lim+(lim*0.20)) {
             System.out.println("multa leve");   
        }else{
            if (vel<=lim+(lim*0.50)){
                System.out.println("multa grave");
            }else{
                System.out.println("multa gravissima + suspensão");
            }
        }
    }
    
    
}
