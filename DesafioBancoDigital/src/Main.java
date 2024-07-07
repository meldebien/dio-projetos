public class Main {
    
    
    
    public static void main(String[] args) {
        Cliente mel =  new Cliente();
        mel.setNome("mel");
        
        ContaCorrente cc = new ContaCorrente(mel);
        ContaPoupanca poupanca = new ContaPoupanca(mel);
        
        cc.depositar(100);
       cc.transferir(100, poupanca);
   
       cc.imprimirExtrato();
        poupanca.imprimirExtrato();
}
}
    
   