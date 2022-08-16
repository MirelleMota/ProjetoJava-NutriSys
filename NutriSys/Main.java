package NutriSys;

import java.util.Scanner;
import NutriSys.Inicio;
import NutriSys.Dieta;
import NutriSys.DietaHipertrofia;

//Este · a BASE do projeto, arquivo que roda com o PLAY
public class Main {

	public static void main(String[] args) {

		Inicio inicio = new Inicio(null, 0, null, 0, 0, 0);
		Dieta dieta1 = new DietaHipertrofia(null, 0, null, null, null, null, null);
		Dieta dieta2 = new DietaLowCarb(null, 0, null, null, null, null, null);

		inicio.boasvindas();
		inicio.setDados();
		while (true) {

			Scanner read = new Scanner(System.in);
			System.out.println("\n\n-----MENU DE USUAÅRIO-----");
			System.out.println("Digite o que gostaria de fazer: ");
			System.out.println("1 - Calcular IMC: ");
			System.out.println("2 - Visualizar Minha dieta");
			System.out.println("3 - Ver minha Ficha Cadastral");
			System.out.println("4 - Alterar minha Ficha Cadastral");
			System.out.println("5 - Sair");
			int x = read.nextInt();

			if (x == 1) {
				double IMC = inicio.getPeso() / Math.pow(inicio.getAltura(), 2);
				inicio.setIMC(IMC);

				if (IMC < 18.5) {
					System.out.printf("\nVocÍ est· Abaixo do peso! Seu IMC È: %.2f \n", IMC);
				}

				else if (IMC >= 18.5 && IMC < 24) {
					System.out.printf("\nSeu peso est· ideal  " + "\nSeu IMC È: %.2f \n", IMC);
				}

				else if (IMC >= 24 && IMC < 30) {
					System.out.printf("\nVocÍ esta Levemente acima do peso " + "\nSeu IMC È: %.2f \n", IMC);
				} else if (IMC >= 30 && IMC < 35) {
					System.out.printf("\nVocÍ est· com Obsidade grau I " + "\nSeu IMC È: %.2f \n", IMC);
				} else if (IMC >= 35 && IMC < 40) {
					System.out.printf("\nVocÍ est· com Obsidade grau II " + "\nSeu IMC È: %.2f \n", IMC);
				} else {
					System.out.printf("\nVocÍ est· com Obsidade grau III" + "\nSeu IMC È: %.2f \n", IMC);
				}

			}

			if (x == 2) {

				if (inicio.getIMC() <= 24) {
					System.out.println("\n-----SUA DIETA IDEAL-----");
					System.out.println("Nome da dieta: " + dieta1.getNome());
					System.out.println("DuraÁ„o em semanas: " + dieta1.getDuracao());
					System.out.println(dieta1.getRefeicao1());
					System.out.println(dieta1.getRefeicao2());
					System.out.println(dieta1.getRefeicao3());
					System.out.println(dieta1.getRefeicao4());
					System.out.println(dieta1.getDescricao());

				}

				else if (inicio.getIMC() > 25) {
					System.out.println("\n-----SUA DIETA IDEAL-----");
					System.out.println("Nome da dieta: " + dieta2.getNome());
					System.out.println("DuraÁ„o em semanas: " + dieta2.getDuracao());
					System.out.println(dieta2.getRefeicao1());
					System.out.println(dieta2.getRefeicao2());
					System.out.println(dieta2.getRefeicao3());
					System.out.println(dieta2.getRefeicao4());
					System.out.println(dieta2.getDescricao());
				}

			}

			if (x == 3) {
				inicio.visualizarDados();
			}

			if (x == 4) {
				inicio.alterarDados();
			}

			if (x == 5) {
				break;
			}
		}
		/*
		 * System.out.print(inicio.getNome()); System.out.print(inicio.getIdade());
		 * System.out.print(inicio.getSexo()); System.out.print(inicio.getAltura());
		 * System.out.print(inicio.getPeso());
		 */

	}

}
