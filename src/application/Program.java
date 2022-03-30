package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudantes;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		Estudantes[] vetor = new Estudantes[10];

		System.out.print("Quantos quartos deseja alugar? ");
		int n = in.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.println("Estudante #" + i);
			in.nextLine();
			System.out.print("Nome: ");
			String name = in.nextLine();
			System.out.print("Email: ");
			String email = in.nextLine();
			System.out.print("Quarto: ");
			int numeroQuarto = in.nextInt();
			vetor[numeroQuarto] = new Estudantes(name, email);
			System.out.println();
		}

		System.out.println();
		System.out.println("Relatórios de quartos alugados: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {

				System.out.println(i + ": " + vetor[i]);
			}
		}

		in.close();

	}
}