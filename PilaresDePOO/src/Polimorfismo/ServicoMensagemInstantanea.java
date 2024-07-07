package Polimorfismo;

public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//mais um método que todos os filhos deverão implementar
	public abstract void salvarHistoricoMensagem();
	
	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}
//Mas fica a reflexão do que já aprendemos sobre visibilidade de recursos: Com o modificador 
//**private**somente a classe conhece a implementação, quanto que o modificador **public**todos passarão a conhecer.
//Mas gostariamos que, somente as classes filhas soubessem. Bem, é ai que entra o modificador protected
