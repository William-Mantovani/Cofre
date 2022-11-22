package cofre;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Cofrinho cofre = new Cofrinho();

		Scanner scan = new Scanner(System.in);
		int opcaoMenuMain = 0;//
		while (opcaoMenuMain != -1) {//repetir os tipo de entrada
			try { //try pra se caso o usuario colocar alguma letra, ou outro erro, erro generico
				System.out.println(
						"COFRINHO:\n1-Adicionar Moeda\n2-Remover Moeda\n3-Listar Moedas\n4-Caucular total convertido para Real\n0-Encerrar");
				opcaoMenuMain = scan.nextInt();
				if (opcaoMenuMain == 1 || opcaoMenuMain == 2) {//if para as opções para escolher as moedas
					System.out.println("Escolher Moeda:\n1-Real\n2-Euro\n3-Dolar");
					int opcaoMoeda = 0;
					while (opcaoMoeda == 0) {//se a opção for diferente das opções das moedas
						opcaoMoeda = scan.nextInt();
						if (opcaoMoeda != 1 && opcaoMoeda != 2 && opcaoMoeda != 3) {
							System.out.println("Opção Invalida\n");
							opcaoMoeda = 0;
							continue;
						}
					}
					System.out.println("Digite o Valor:");// valor que sera adicionado ao cofrinho
					double valor = scan.nextDouble();
					Moeda moedaSelecionada = null;
					if (opcaoMoeda == 1) {
						moedaSelecionada = new Real(valor);
					} else if (opcaoMoeda == 2) {
						moedaSelecionada = new Euro(valor);
					} else if (opcaoMoeda == 3) {
						moedaSelecionada = new Dolar(valor);
					}
					if (opcaoMenuMain == 1) {
						cofre.adicionar(moedaSelecionada);
					} else {
						cofre.remover(moedaSelecionada);
					}
				} else if (opcaoMenuMain == 3) { // listagem das moedas
					for (Moeda moeda : cofre.listagemMoedas()) {
						System.out.println(moeda.info());
					}
				} else if (opcaoMenuMain == 4) {
					System.out.println(String.format("O total convertida para Real:%,.2f", cofre.totalConvertido()));
				} else if (opcaoMenuMain == 0) {
					System.out.println("Encerrado, até logo!!");
					break;
				}
			} catch (Exception e) {
				System.out.println("Opção invalida encerrando");
				System.exit(0); // encerra o programa com sucesso
			}
		}
		scan.close();
	}

}
