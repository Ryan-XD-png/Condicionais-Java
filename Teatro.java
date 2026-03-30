import java.util.Scanner;

public class Teatro {
    public static void main(String[] args){
        char[]alf="ABCDEFGHIJKL".toCharArray();
        Scanner scan = new Scanner(System.in);
        Room[] room = new Room[20];
        System.out.println("BEM VINDO AO TEATRO DEVISATE\n============================\n");
        System.out.println("informe o valor do teatro");
        double valor= scan.nextDouble();
        scan.nextLine();
        do{
            askCreate(room,valor,scan);
            menu(room,scan,alf);
            break;
        } while (true);

    }

    public static void askCreate(Room[] room,double valor,Scanner scan){

        while (true){

            System.out.println("Digite 1 para criar sala");
            System.out.println("Digite 2 para ir as compras");
            int  ch = scan.nextInt();
            scan.nextLine();
            if(room[0]==null && ch == 2){
                System.out.println("ainda não existe nenhuma sala");
            }else if(ch==1){
                int pos = 0;
                while (pos < room.length && room[pos] != null) {
                    pos++;
                }
                System.out.println("informe o nome da sala");
                String name = scan.nextLine();
                System.out.println("qual o  nome do espetáculo");
                String esp = scan.nextLine();
                room[pos]= new Room(name,esp,valor);
                room[pos].showFor();
                System.out.println("\nCriada com sucesso\n");
                pos+=1;
            } else if (ch==2) {
                break;
            }else {
                System.out.println("numero invalido");
        }
        }
    }
    public static void menu(Room[] room, Scanner scan,char[] alf){

        int j=0;
        while (true) {
            System.out.println("Escolha uma sala:");
            for (int i = 0; i < room.length; i++) {
                if (room[i]==null){
                    break;
                }
                System.out.printf("[%d] ", i + 1);
                room[i].showFor();
                System.out.println();
                j = i;
            }
            System.out.printf("[%d] Criar nova sala\n", j + 2);
            System.out.printf("[%d] Sair\n",j+3);

            System.out.print("informe sua escolha: ");
            int ch = scan.nextInt();
            scan.nextLine();
            if (ch >= 1 && ch <= j + 1) {
                int e = ch-1;
                optionsRoom(room,alf,e,scan);
            }else if (ch==j+2){
                askCreate(room,room[0].price[0],scan);
            } else if (ch==j+3) {
                System.out.println("até a proxima...");
                break;

            } else {
                System.out.println("numero invalido");
            }
        }

    }

    private static void optionsRoom(Room[] room,char[] alf,int e,Scanner scan) {
        boolean fun = true;
        while (fun){
            System.out.println();
            room[e].showFor();
            System.out.println("\n[1] Comprar");
            System.out.println("[2] Reservar");
            System.out.println("[3] Cancelar reseva");
            System.out.println("[4] Mapa");
            System.out.println("[5] Relatório financeiro da sala");
            System.out.println("[6] Voltar");
            System.out.print("informe sua escolha: ");
            int ch = scan.nextInt();
            scan.nextLine();
            int p=0;
            switch (ch){
                case 1:
                    System.out.println("Comprar lugar:\n");
                    System.out.println("informe a linha (A-L)");
                    char[] l= scan.nextLine().toCharArray();
                    l[0] = Character.toUpperCase(l[0]);
                    for(int u:alf){
                        if (u==l[0]){
                            p=1;
                        }
                    }
                    if (p==0){
                        System.out.println("Linha não existe \nSaindo...");
                        break;
                    }
                    System.out.println("informe a coluna (1-12)");
                    int c = scan.nextInt();
                    scan.nextLine();
                    if (c<1||c>12){
                        System.out.println("Coluna não existe \nSaindo...");
                        break;
                    }
                    room[e].buy(room[e].convert(l[0],alf),c);
                    break;
                case 2:
                    System.out.println("Reservar lugar:\n");
                    System.out.println("informe a linha (A-L)");
                    char[] h= scan.nextLine().toCharArray();
                    h[0] = Character.toUpperCase(h[0]);
                    for(int u:alf){
                        if (u==h[0]){
                            p=1;
                        }
                    }
                    if (p==0){
                        System.out.println("Linha não existe \nSaindo...");
                        break;
                    }
                    System.out.println("informe a coluna (1-12)");
                    int j = scan.nextInt();
                    scan.nextLine();
                    if (j<1||j>12){
                        System.out.println("Coluna não existe \nSaindo...");
                        break;
                    }
                    room[e].reservation(room[e].convert(h[0],alf),j);
                    break;
                case 3:

                    System.out.println("Cancelar reserva :\n");
                    System.out.println("informe a linha (A-L)");
                    char[] w= scan.nextLine().toCharArray();
                    w[0] = Character.toUpperCase(w[0]);
                    for(int u:alf){
                        if (u==w[0]){
                            p=1;
                        }
                    }
                    if (p==0){
                        System.out.println("Linha não existe \nSaindo...");
                        break;
                    }
                    System.out.println("informe a coluna (1-12)");
                    int q = scan.nextInt();
                    scan.nextLine();
                    if (q<1||q>12){
                        System.out.println("Coluna não existe \nSaindo...");
                        break;
                    }
                    room[e].cancel(room[e].convert(w[0],alf),q);
                    break;
                case 4:
                    System.out.println("Mapa da Sala:\n");
                    room[e].showPlay();
                    room[e].showChairs(alf);
                    break;
                case 5:
                    System.out.println("Relatório financeiro da sala:\n");
                    System.out.printf("Numero de cadeiras livres: %d\n", room[e].countFree());
                    System.out.printf("Numero de cadeiras reservadas: %d\n", room[e].countRes());
                    System.out.printf("Numero de cadeiras ocupadas: %d\n", room[e].countBuy());
                    System.out.printf("Total arrecadado: %.2f\n",room[e].countBuyPri(1));
                    System.out.printf("Total reservas: %.2f\n",room[e].countResPri());
                    System.out.printf("Receita potencial se todas as reservas forem confirmadas: %.2f\n",room[e].countBuyPri(2));
                    System.out.printf("Receita potencial máxima se todas as cadeiras livres forem vendidas: %.2f\n",room[e].countAllPri());

                    break;
                case 6:
                    System.out.println("Saindo da sala\n");
                    fun=false;
                    break;
                default:
                    System.out.println("numero incorreto");
                    break;
            }
        }
    }
}
