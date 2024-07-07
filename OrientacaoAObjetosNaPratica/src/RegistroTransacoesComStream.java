import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();
       List<Transacao> transacoes = new ArrayList<>();
 
        for (int i = 1; i <= quantidadeTransacoes; i++) {
          char tipoTransacao = scanner.next().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // TODO: Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
           transacoes.add(transacao);
            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S' || transacao.getTipo() == 's') {
                saldo -= valorTransacao;
            }
        }
    scanner.close();

        System.out.println("Saldo : " + saldo);
        System.out.println("Transacoes:");
        transacoes.stream().forEach(n -> System.out.println(n.getTipo() + " de " + n.getValor()));

       
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return this.tipo;
    }

    public double getValor() {
        return this.valor;
    }
}