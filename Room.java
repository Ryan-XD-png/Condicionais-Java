public class Room {
    public String name;
    public String playName;
    private int[][] chairs = new int[12][12];
    public double[] price = new double[2];

    public Room(String name, String play, double price) {
        this.name = name;
        this.playName = play;
        this.price[0] = price;
        this.price[1] = price / 2;
    }

    public int convert(char c, char[] alf) {
        for (int i = 0; i < alf.length; i++) {
            if (c == alf[i]) {
                return i;
            }
        }
        return -1;
    }

    public void buy(int li, int co) {

        co -= 1;
        switch (chairs[li][co]) {
            case 1:
                System.out.println("lugar ja esta ocupado");
                break;
            case 2:
                this.chairs[li][co] = 1;
                System.out.println("Compra concluida");
                System.out.println("valor cobrado foi R$" + this.price[1]);
                break;
            case 0:
                this.chairs[li][co] = 1;
                System.out.println("Compra concluida");
                System.out.println("valor cobrado foi R$" + this.price[0]);
                break;
        }
    }

    public void reservation(int li, int co) {
        co -= 1;

        switch (chairs[li][co]) {
            case 1:
                System.out.println("lugar ja esta ocupado");
                break;
            case 2:
                System.out.println("lugar ja esta reservado");
                break;
            case 0:
                this.chairs[li][co] = 2;
                System.out.println("Reserva feita");
                System.out.println("valor cobrado foi R$" + this.price[1]);
                break;
        }
    }

    public void cancel(int li, int co) {
        co -= 1;

        switch (chairs[li][co]) {
            case 1:
                System.out.println("Compra ja finalizada");
                break;
            case 2:
                this.chairs[li][co] = 0;
                System.out.println("Reserva Cancelada");
                System.out.println("Reembolso de R$" + this.price[1]);
                break;
            case 0:
                System.out.println("Lugar ja esta vazio");
                break;
        }
    }

    public void showPlay() {
        System.out.println("============================================");
        System.out.printf("\n Sala: %s\n", this.name);
        System.out.printf("\n Espetáculo: %s\n\n", this.playName);
        System.out.println("============================================\n");
    }

    public void showFor() {
        System.out.printf("Sala: %s Espetáculo: %s ", this.name, this.playName);
    }

    public void showChairs(char[] alf) {
        for (int n = 1; n <= 12; n++) {
            System.out.printf("  %d ", n);
        }
        System.out.println();
        for (int i = 0; i < this.chairs.length; i++) {
            System.out.print(alf[i] + " ");
            for (int j = 0; j < this.chairs.length; j++) {
                char state = (this.chairs[i][j] == 0) ? ' ' : (this.chairs[i][j] == 1) ? 'X' : 'R';
                System.out.printf("[%c] ", state);
            }
            System.out.println(alf[i]);
        }
    }

    public int countFree() {
        int num = 0;
        for (int i = 0; i < this.chairs.length; i++) {
            for (int j = 0; j < this.chairs.length; j++) {
                if (this.chairs[i][j] == 0){
                num+=1;}
            }
        }
        return num;
    }
    public int countBuy() {
        int num = 0;
        for (int i = 0; i < this.chairs.length; i++) {
            for (int j = 0; j < this.chairs.length; j++) {
                if (this.chairs[i][j] == 1){
                num+=1;}
            }
        }
        return num;
    }
    public int countRes() {
        int num = 0;
        for (int i = 0; i < this.chairs.length; i++) {
            for (int j = 0; j < this.chairs.length; j++) {
                if (this.chairs[i][j] == 2){
                num+=1;}
            }
        }
        return num;
    }

    public double countBuyPri(int o) {
        double num = 0;
        for (int i = 0; i < this.chairs.length; i++) {
            for (int j = 0; j < this.chairs.length; j++) {
                if (this.chairs[i][j] == o){
                num+=this.price[0];}
            }
        }
        return num;
    }

    public double countResPri() {
        double num = 0;
        for (int i = 0; i < this.chairs.length; i++) {
            for (int j = 0; j < this.chairs.length; j++) {
                if (this.chairs[i][j] == 2){
                num+=this.price[1];}
            }
        }
        return num;
    }
    public double countAllPri() {
        double num = 0;
        for (int i = 0; i < this.chairs.length; i++) {
            for (int j = 0; j < this.chairs.length; j++) {
                if (this.chairs[i][j] == 0) {
                    num += this.price[0];
                }
            }
        }
        return num;
    }

}