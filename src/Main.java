import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Gabriel de Almeida";
        String conta = "Corrente";
        double saldo = 2500.00;


        int escolha;
        do {
            System.out.println("***************************************");
            System.out.println("Dados iniciais do Cliente");
            System.out.println();  //exbir os valores da conta
            System.out.println("Nome:            " + nome);
            System.out.println("Tipo conta:      " + conta);
            System.out.println("Saldo incial:    " + saldo);
            System.out.println("***************************************");
            System.out.println("""
                                            
                    """);
            System.out.println("Operações");
            System.out.println();
            System.out.println("1-Consultar saldos");
            System.out.println("2-Receber valor");
            System.out.println("3-Transferir valor");
            System.out.println("4-Sair");
            System.out.println();
            System.out.println("Digite a opção desejada:");

            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Valor que deseja receber:");
                    double adicao = sc.nextDouble();
                    saldo = saldo + adicao;
                    System.out.println("Seu saldo atual é: "+ saldo);
                    break;
                case 3:
                    System.out.println("Valor que desja Transferir:");
                    double transferir = sc.nextDouble();
                    if (transferir > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldo = saldo - transferir;
                        System.out.println("Seu saldo atual é: "+ saldo);
                    }
                    break;
                case 4:
                    System.out.println("Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }


        } while (escolha != 4);

    }
}
