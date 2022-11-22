package cofre;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	private List<Moeda> listaMoeda = new ArrayList<>(); // A classe Cofrinho deve possuir como atributo uma coleção de
														// Moedas

	public void adicionar(Moeda moedinha) {// recebe o tipo de mueda da calsse abs
		listaMoeda.add(moedinha);
	}

	public void remover(Moeda moedinha) { 
		listaMoeda.remove(moedinha); // aqui usa o equals que esta na classe Moeda
	}

	public List<Moeda> listagemMoedas() {// retorna a lista de moeda
		return this.listaMoeda;
	}

	public double totalConvertido() {//converte da propria moeda, não precisa colocar as moedas
		double total = 0;
		for(Moeda moeda: this.listagemMoedas()) {
			total = total + moeda.converter();
		}
		return total ;
	}
	

}
