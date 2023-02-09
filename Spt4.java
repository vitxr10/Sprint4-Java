import java.util.Scanner;

public class Spt4 {

	public static void main(String[] args) {
		// ENTRADA
		Scanner entrada = new Scanner(System.in);

		// VARIAVEIS
		int QtdEquipes = 0, auxiliarP = 0, auxiliarE = 0;

		// INICIO
		// CARREGANDO VETOR DAS EQUIPES
		System.out.println(
				"-------------------------------------QUANTIDADE DE EQUIPES---------------------------------------");
		System.out.println("");

		System.out.println("Digite a quantidade de equipes na competi��o: ");
		QtdEquipes = entrada.nextInt();

		// DECLARA��O DE VETORES
		int[] arrayNumEquipes = new int[QtdEquipes];
		int[] vitorias = new int[QtdEquipes];
		int[] notas = new int[QtdEquipes];

		// CARREGANDO NUMEROS DAS EQUIPES
		System.out.println("");
		System.out.println(
				"-------------------------------------N�MEROS DAS EQUIPES---------------------------------------");
		System.out.println("");

		for (int i = 0; i < QtdEquipes; i++) {
			System.out.println("Digite o n�mero da equipe " + (i + 1) + ": ");
			arrayNumEquipes[i] = entrada.nextInt();
		}
		
		// NOTAS
		System.out.println("");
		System.out.println("-------------------------------------NOTAS DE DESIGN---------------------------------------");
		System.out.println("");
		
		for (int i=0;i<QtdEquipes;i++) {
			System.out.println("Digite a nota de design da equipe "+(i+1)+": ");
			notas[i] = entrada.nextInt();
		}
		

		// COMBATES
		System.out.println("");
		System.out.println("-------------------------------------COMBATES---------------------------------------");
		System.out.println("");

		for (int i = 0; i < QtdEquipes - 1; i++) {
			for (int j = QtdEquipes - 1; j > i; j--) {
				if (arrayNumEquipes[i] != arrayNumEquipes[j]) {
					System.out.println("--- Combate entre a equipe " + arrayNumEquipes[i] + " contra a equipe "
							+ arrayNumEquipes[j] + ":");
				}

				// GERADOR DE PONTUA��ES DE COMBATE
				int pontos = (int) (Math.random() * 10);
				System.out.println("Pontua��o da equipe " + arrayNumEquipes[i] + ": " + pontos + "");

				int pontosj = (int) (Math.random() * 10);
				System.out.println("Pontua��o da equipe " + arrayNumEquipes[j] + ": " + pontosj + "");
				
				// PRINT DAS NOTAS
				System.out.println("Nota de design da equipe " + arrayNumEquipes[i] + ":" +notas[i]);
				System.out.println("Nota de design da equipe " + arrayNumEquipes[j] + ":" +notas[j]);

				if (pontos == pontosj && notas[i] > notas[j]) {
					System.out.println("Equipe " + arrayNumEquipes[i] + " venceu!!!");
					vitorias[i] += 1;
				} else {
					if (pontos == pontosj && notas[j] > notas[i]) {
						System.out.println("Equipe " + arrayNumEquipes[j] + " venceu!!!");
						vitorias[j] += 1;
					} else {
						if (pontos > pontosj) {
							System.out.println("Equipe " + arrayNumEquipes[i] + " venceu!!!");
							vitorias[i] += 1;
						} else {
							System.out.println("Equipe " + arrayNumEquipes[j] + " venceu!!!");
							vitorias[j] += 1;
						}
					}
				}
				
				System.out.println("");
			}
		}

		/*
		 * for (int i=0;i<QtdEquipes;i++) { System.out.println(vitorias[i]); }
		 */

		// 3 MELHORES
		System.out.println("");
		System.out.println(
				"-------------------------------------3 MELHORES EQUIPES---------------------------------------");
		System.out.println("");

		for (int i = 0; i < QtdEquipes; i++) {
			for (int j = 0; j < QtdEquipes; j++) {

				if (vitorias[i] > vitorias[j]) {
					// ORDENA��O PONTOS
					auxiliarP = vitorias[i];
					vitorias[i] = vitorias[j];
					vitorias[j] = auxiliarP;

					// ORDENA��O EQUIPES
					auxiliarE = arrayNumEquipes[i];
					arrayNumEquipes[i] = arrayNumEquipes[j];
					arrayNumEquipes[j] = auxiliarE;
				}
			}

		}
		
		int[] TresMelhores = new int [3];
		
		for (int i = 0; i < 3; i++) {
			TresMelhores[i] = arrayNumEquipes[i];
			System.out.println(""+(i+1)+"o lugar \t Equipe "+arrayNumEquipes[i]+" \t Vit�rias: "+vitorias[i]+" ");
		}
		
		
		// COMBATES ENTRE OS TRES MELHORES
				System.out.println("");
				System.out.println("-------------------------------------COMBATES ENTRE OS TR�S MELHORES---------------------------------------");
				System.out.println("");
				
				int[] vitorias3 = new int [3];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 2; j > i; j--) {
				if (arrayNumEquipes[i] != arrayNumEquipes[j]) {
					System.out.println("--- Combate entre a equipe " + arrayNumEquipes[i] + " contra a equipe "
							+ arrayNumEquipes[j] + ":");
				}

				// GERADOR DE PONTUA��ES DE COMBATE
				int pontos = (int) (Math.random() * 10);
				System.out.println("Pontua��o da equipe " + arrayNumEquipes[i] + ": " + pontos + "");

				int pontosj = (int) (Math.random() * 10);
				System.out.println("Pontua��o da equipe " + arrayNumEquipes[j] + ": " + pontosj + "");
				
				// PRINT DAS NOTAS
				System.out.println("Nota de design da equipe " + arrayNumEquipes[i] + ":" +notas[i]);
				System.out.println("Nota de design da equipe " + arrayNumEquipes[j] + ":" +notas[j]);

				if (pontos == pontosj && notas[i] > notas[j]) {
					System.out.println("Equipe " + arrayNumEquipes[i] + " venceu!!!");
					vitorias3[i] += 1;
				} else {
					if (pontos == pontosj && notas[j] > notas[i]) {
						System.out.println("Equipe " + arrayNumEquipes[j] + " venceu!!!");
						vitorias3[j] += 1;
					} else {
						if (pontos > pontosj) {
							System.out.println("Equipe " + arrayNumEquipes[i] + " venceu!!!");
							vitorias3[i] += 2;
						} else {
							System.out.println("Equipe " + arrayNumEquipes[j] + " venceu!!!");
							vitorias3[j] += 2;
						}
					}
				}
				System.out.println("");
			}
		}
		
		// EQUIPE VENCEDORA
		System.out.println("");
		System.out.println("-------------------------------------------EQUIPE VENCEDORA---------------------------------------------");
		System.out.println("");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (vitorias3[i] > vitorias3[j]) {
					// ORDENA��O PONTOS
					auxiliarP = vitorias3[i];
					vitorias3[i] = vitorias3[j];
					vitorias3[j] = auxiliarP;

					// ORDENA��O EQUIPES
					auxiliarE = TresMelhores[i];
					TresMelhores[i] = TresMelhores[j];
					TresMelhores[j] = auxiliarE;

				} else if (vitorias3[i] == vitorias3[j]) {
					// DESEMPATE
					if (notas[j] > notas[i]) {
						// ORDENA��O PONTOS
						auxiliarP = vitorias3[j];
						vitorias3[j] = vitorias3[i];
						vitorias3[i] = auxiliarP;

						// ORDENA��O EQUIPES
						auxiliarE = TresMelhores[j];
						TresMelhores[j] = TresMelhores[i];
						TresMelhores[i] = auxiliarE;

					}
				}
			}

		}
		
		for (int i = 0; i < 1; i++) {
			System.out.println("Equipe "+TresMelhores[i]+" Campe� !!! ");
		}

	}

}
