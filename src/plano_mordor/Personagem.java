package plano_mordor;
import plano_mordor.comida.*;
import plano_mordor.humor.Feliz;
import plano_mordor.humor.Humor;
import plano_mordor.humor.Irritado;
import plano_mordor. humor.MuitoFeliz;
import plano_mordor.humor.Triste;

public class Personagem {

	public int pontosDeFelicidade;
	private int total;
	private String tipoHumor;
	private Humor humor;
	
	
	public String obterHumorAtual(int total) {
		if (total < -5) {
			humor = new Irritado();
			tipoHumor = humor.getClass().getName();
		}
		if (total >= -5 && total <=0 ) {
			humor =  new Triste();
			 tipoHumor = humor.getClass().getName();
		}
		if (total >= 1 && total <=15) {
			humor = new Feliz();
			tipoHumor = humor.getClass().getName();
		}
		if (total > 15) {
			humor =  new MuitoFeliz();
			 tipoHumor = humor.getClass().getName();
		}
		
		return tipoHumor.replace("humor.", "");
	}
	
	public void comer(Comida[] comidas) {
		for (Comida comida : comidas) {
			pontosDeFelicidade += comida.getPontosDeFelicidade();
			//obterHumorAtual(pontosDeFelicidade);
		}
	}
	@Override
	public String toString() {
		return pontosDeFelicidade + " - " + obterHumorAtual(pontosDeFelicidade);
	}
}
