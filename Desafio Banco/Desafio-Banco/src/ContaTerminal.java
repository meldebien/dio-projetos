import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      //TODO:conhecer e importar a classe Scanner  

      //Exibir as mensagens para o nosso usuário

      //Obter pela Scanner os valores digitados no terminal

      //Exibir a mensagem conta criada
    
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

System.out.println("Digite a sua agência");
String numeroAgencia = scanner.next();

System.out.println("Digite o número da conta");
String conta = scanner.next();

System.out.println("Digite o seu nome completo");
scanner.nextLine();
String nomeCompleto = scanner.nextLine();

System.out.println("Informe seu saldo inicial");
double valorSaldo = scanner.nextDouble();


scanner.close();

System.out.println(" Olá " + nomeCompleto + ", obrigada por criar uma conta em nosso banco. S98767890ua agência é " + numeroAgencia + ", conta " + conta + " e seu saldo " + valorSaldo + " já está disponível para saque " );
    }


}
