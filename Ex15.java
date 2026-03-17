import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String usP="funcionario";
        String senP="EMPRESA";
        String  us,sen,rep;
        int ver=0;

        System.out.println("digite seu usuario: ");
        us=scan.nextLine();
        System.out.println("digite sua senha: ");
        sen=scan.nextLine();
        ver+=(us.equals(usP))? 1:0;
        ver+=(sen.equals(senP))? 2:0;
        rep=(ver==1)?"senha incorreta":(ver==2)?"usuario incorreto":(ver==0)?"tudo errado":"bem vindo";
        System.out.println(rep);

    }  
}
