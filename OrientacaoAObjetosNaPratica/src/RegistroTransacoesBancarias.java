import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();
        scanner.nextLine();

     List<String> tiposTransacoes = new ArrayList<>();
     List<Double> valoresTransacoes = new ArrayList<>();


        for (int i = 0; i < quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();
            scanner.nextLine();

            if (tipoTransacao == 'D' || tipoTransacao == 'd') {
                saldo += valorTransacao;
                tiposTransacoes.add("Deposito de ");
                valoresTransacoes.add(valorTransacao);
                
            } else if (tipoTransacao == 'S' || tipoTransacao == 's') {
                saldo -= valorTransacao;
                tiposTransacoes.add("Saque de ");
                valoresTransacoes.add(valorTransacao);
            } 
        } 
        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes: ");

     
        for (int i = 0; i < tiposTransacoes.size(); ++i){
             System.out.println((i + 1) + ". " + tiposTransacoes.get(i) + "de " + valoresTransacoes.get(i));
        }

        // TODO: Exibir o saldo final e a lista de transações conforme a tabela de Exemplos.

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}