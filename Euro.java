package cofre;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
		
	}

	@Override
	String info() { // retorna valor sem ser convertido
		return String.format("Euro - %,.2f",this.valor);

	}

	@Override
	double converter() {
		double convert = (5.57 * valor);
		return convert;

	}

}
