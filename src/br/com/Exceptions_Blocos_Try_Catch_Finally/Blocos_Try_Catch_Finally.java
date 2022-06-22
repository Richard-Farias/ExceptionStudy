package br.com.Exceptions_Blocos_Try_Catch_Finally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Blocos_Try_Catch_Finally {

	public static void main(String[] args) {
		
		File file = new File("/home/siblion/DocTeste.txt");
		Scanner sc = null;
		
		//ínico bloco Try/Catch
		
		try {
			// O Scanner pode faz leitura do teclado e de arquivos também 
			sc = new Scanner(file);
			//Comando para leitura das linhas do arquivo
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch (FileNotFoundException e) {
			System.err.printf("%n Exception: %s%n",e);
			System.out.println("Error open File:" + e.getMessage());
		}
		finally {
			if(sc!= null)
				sc.close();
		}
	}
}
