package cofre;

import java.util.Objects;

public abstract class Moeda {
	double valor;

	abstract String info();

	abstract double converter();

	public Moeda(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) { //usa esse metodo equals para verificar na lista se a entrada é a mesma para poder remover da lista
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj; //aqui ele da true pq ele verifica se o valor são os mesmos 
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	

}
