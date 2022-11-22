package cofre;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);

	}

	@Override
	String info() {
		return String.format("Real - %,.2f", this.valor);

	}

	@Override
	double converter() {
		return valor;

	}

}
