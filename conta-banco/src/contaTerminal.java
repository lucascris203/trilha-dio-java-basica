import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor,digite o numero da conta!");
    int numero = scanner.nextInt();

    System.out.println("Por favor,digite o numero da agencia!");
    String agencia = scanner.next();

    System.out.println("Por favor,digite o nome do cliente!");
    String cliente = scanner.next();

    String saldo = "0";
 
        System.out.println("olá , " + cliente + " obrigado por criar uma conta em nosso banco,sua agencia é " + agencia + " seu saldo " +   saldo + " conta " +  numero + " já está disponivel.");
    }
}
