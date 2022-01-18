package com.company;

public class Main {

    public static void main(String[] args) {
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

    	calculateScore(true, 800, levelCompleted, bonus); // Posso fazer dos 3 jeitos, Tudo valor, Tudo nome ou Mesclado Nome e Valor.

		calculateScore(true, 1000, 8, 200);

		/* Se eu utilizar essa forma de escrever, posso deletar as atribuições do inicio do método main.
		Vou retirar o boolean para dar o exemplo, e manter os outros 3!
		// Importancia poder chamar para o nome, pois as vezes a variavel pode ter seus valores modificados e o programa ainda ira resolver o problema.
		* */

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		}

	}


}
