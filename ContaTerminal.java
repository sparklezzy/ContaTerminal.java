import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler o número da conta
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        // Solicitar e ler o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next(); // next() para ler texto até o próximo espaço

        // Solicitar e ler o nome do cliente
        System.out.print("Por favor, digite o seu nome: ");
        scanner.nextLine(); // Consumir a linha pendente
        String nomeCliente = scanner.nextLine();

        // Solicitar e ler o saldo da conta
        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final com os dados fornecidos
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                          nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}
