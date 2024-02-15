import java.util.Scanner;
public class ContaTerminal{

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo; 

        try {

        System.out.print("Digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Digite sua Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Digite o número de sua Conta: ");
        numeroConta = scanner.nextInt();

        System.out.print("Informe o seu Saldo: ");
        saldo = scanner.nextDouble();

            } catch (Exception e) {
             System.out.println("Erro ao ler dados. Certifique-se de inserir valores válidos.");
             return;
            } finally {
            scanner.close();
             }

             System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso Banco. Sua agência é " +
             agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo +
             " já está disponível para saque.");

    }
 }