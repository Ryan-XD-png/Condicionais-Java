import java.util.Random;
import java.util.Scanner;


public class Ex20 {
    public static void main(String[] args){
        Random r= new Random();
        Scanner scan = new Scanner(System.in);
        int esc1;
        int esc2=r.nextInt(3)+1;
        System.out.println("digite 1 para tesoura/ 2 para pedra/ 3 para papel");
        esc1=scan.nextInt();
        String certo = (esc1<=3 && esc1>0)?"Boa jogada":"Numero incorreto";
        System.out.println(certo);
        if (esc1==esc2){
            System.out.println("O jogo empatou");
        }else{
            switch(esc2){
            case 1:
                if(esc1==2){
                    System.out.println("jogador 1 ganhou");
                }else{
                    System.out.println("jogador 2 (bot) ganhou");
                }
                break;
            case 2:
                if(esc1==3){
                    System.out.println("jogador 1 ganhou");
                }else{
                    System.out.println("jogador 2 (bot) ganhou");
                }
                break;
            case 3:
                if(esc1==1){
                    System.out.println("jogador 1 ganhou");
                }else{
                    System.out.println("jogador 2 (bot) ganhou");
                }
                break;
        }
        }
        System.out.println("jogador 2 jogou "+esc2);
    }
}