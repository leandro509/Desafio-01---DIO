import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da conta: ");
        int numeroConta = scan.nextInt();
        System.out.println("Por favor, digite o numero da Agencia: ");
        scan.nextLine();
        String numeroAgencia = scan.nextLine();
        System.out.println("Por favor, digite seu nome: ");
        
        String nomeCliente = scan.nextLine();
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldoConta = scan.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia eh " + numeroAgencia + ", conta " + 
        numeroConta + " e seu saldo " + saldoConta + " ja esta disponivel para saque.");
        scan.close();
    }
}
