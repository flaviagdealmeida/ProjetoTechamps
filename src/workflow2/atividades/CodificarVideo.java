package workflow2.atividades;
public class CodificarVideo implements Atividade {
	
	public CodificarVideo(){
		executar();
	}

	@Override
	public void executar() {
		System.out.println("codificando video");
	}

}
