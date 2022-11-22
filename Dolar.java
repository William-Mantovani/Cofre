package cofre;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
		
	}

	@Override
	String info() {
		return String.format("Dolar - %,.2f",this.valor);//format pra formatar o formato numerico brasileiro
	}

	@Override
	double converter() {
		double convert = (5.38 * valor);
		return convert;

	}

}
