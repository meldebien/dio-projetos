import java.util.Scanner;

public class SimulacaoBancaria{

public static void main(String[] args){
Scanner scan = new Scanner(System.in);
double saldo = 0;
boolean continuar = true;
while(continuar){
    int opcao = scan.nextInt();
    switch(opcao){
        case(1):
        double valorDesposito = scan.nextDouble();
        saldo = depositar(valorDesposito, saldo);
        System.out.println("Saldo atual: " + saldo);
        break;
        
        case(2):
        double valorSaque = scan.nextDouble();
        saldo = sacar(valorSaque, saldo);
        break;
        case(3):
        consultarSaldo(saldo);
        System.out.println("Saldo atual: " + saldo);
        break;
        case(0):
        System.out.println("Programa encerrado.");
        continuar = false;
        break;
        default:
        System.out.println("Opcao inválida.Tente novamente.");
    
}
}
}
public static double depositar(double valor, double saldo){
saldo += valor;
return saldo;
}
public static double sacar(double valor, double saldo){
if(saldo < valor){
    System.out.println("Saldo insuficiente.");
    return saldo;
} else{
saldo -= valor;
System.out.println("Salto atual: " + saldo);
}
return saldo;
}
public static void consultarSaldo(double saldo){
}
}
