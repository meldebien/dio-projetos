package Polimorfismo;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
    @Override
    public void salvarHistoricoMensagem() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salvarHistoricoMensagem'");
    }
}