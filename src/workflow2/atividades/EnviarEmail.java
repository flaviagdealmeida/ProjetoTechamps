package workflow2.atividades;
public class EnviarEmail implements Atividade {

	public EnviarEmail() {
		executar();
	}
	
	
	@Override
	public void executar() {
	System.out.println("enviando email com video");
		
	}

}
