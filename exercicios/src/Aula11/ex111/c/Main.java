package Aula11.ex111.c;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ficheiro a ler: ");
		Scanner sc = new Scanner(System.in);
		String ficheiro = sc.next();
		sc.close();
		FileWords fw = new FileWords(new File(ficheiro));
		
		System.out.println(fw.listOccurrences());
	}

}
