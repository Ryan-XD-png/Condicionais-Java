import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int paginaAtual = 0;
        int itensPorPagina = 7;
        int totalExercicios = 20;
         do {
        int totalPaginas = (int) Math.ceil((double) totalExercicios / itensPorPagina);
        int inicio = paginaAtual * itensPorPagina;
        int fim = Math.min(inicio + itensPorPagina, totalExercicios);
        String[] titulos = {
                "Exercício 1 - Par ou Ímpar",
                "Exercício 2 - Maior de Dois Números",
                "Exercício 3 - Aprovação Escolar",
                "Exercício 4 - Classificação de Temperatura",
                "Exercício 5 - Calculadora com Switch",
                "Exercício 6 - Ano Bissexto",
                "Exercício 7 - Triângulo Válido",
                "Exercício 8 - IMC",
                "Exercício 9 - Dia da Semana",
                "Exercício 10 - Positivo, Negativo ou Zero",
                "Exercício 11 - Ingresso de Cinema",
                "Exercício 12 - Nota por Conceito",
                "Exercício 13 - Estação do Ano",
                "Exercício 14 - Maior de Três Números",
                "Exercício 15 - Verificador de Login",
                "Exercício 16 - Múltiplo de 3 e 5",
                "Exercício 17 - Desconto em Compra",
                "Exercício 18 - Número Romano",
                "Exercício 19 - Velocidade e Multa",
                "Exercício 20 - Pedra, Papel e Tesoura" 
            };

       
            System.out.println((paginaAtual > 0) ? "A - Anterior" : "");
            System.out.println((paginaAtual < totalPaginas - 1) ? "P - Próxima" : "");
            System.out.println("V - Voltar - Teatro\n");
            for(int i=inicio;i<fim;i++){
                System.out.println((i + 1) + " - " + titulos[i]);
            }
            System.out.print("informe sua escolha: ");
            String p = scan.nextLine();
            p=p.toUpperCase();
            try {
                int num = Integer.parseInt(p);
                if (inicio==0) {
                    switch (num) {
                    case 1:
                        Ex1.main(args);
                        break;
                    case 2:
                        Ex2.main(args);
                        break;
                    case 3:
                        Ex3.main(args);
                        break;
                    case 4:
                        Ex4.main(args);
                        break;
                    case 5:
                        Ex5.main(args);
                        break;
                    case 6:
                        Ex6.main(args);
                        break;
                    case 7:
                        Ex7.main(args);
                        break;
                    default:
                        break;
                }
                }
                if (inicio==7) {
                    switch (num) {
                    case 8:
                        Ex8.main(args);
                        break;
                    case 9:
                        Ex9.main(args);
                        break;
                    case 10:
                        Ex10.main(args);
                        break;
                    case 11:
                        Ex11.main(args);
                        break;
                    case 12:
                        Ex12.main(args);
                        break;
                    case 13:
                        Ex13.main(args);
                        break;
                    case 14:
                        Ex14.main(args);
                        break;
                    default:
                        break;
                }
                }
                if (inicio==14) {
                    switch (num) {
                    case 15:
                        Ex15.main(args);
                        break;
                    case 16:
                        Ex16.main(args);
                        break;
                    case 17:
                        Ex17.main(args);
                        break;
                    case 18:
                        Ex18.main(args);
                        break;
                    case 19:
                        Ex19.main(args);
                        break;
                    case 20:
                        Ex20.main(args);
                        break;
                    default:
                        break;
                }
                }
                

            } catch (NumberFormatException e) {
                switch (p) {
                case "P":
                    if (paginaAtual < totalPaginas - 1){
                        paginaAtual++;
                    }
                    break;
                case "A":
                    if (paginaAtual > 0) {
                        paginaAtual--;
                    }
                    break;
                case "V":
                    System.out.println("ao teatro");
                    Teatro.main(args);
                    break;
                default:
                    System.out.println("opcão não existe!!");
                    break;
            }
            }
           

        } while (true);
    }
}
