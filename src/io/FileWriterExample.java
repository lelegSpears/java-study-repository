package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		String[] lines = new String[] { "Hellonyan", "How are you?", "Im fine thankyou"};
		String StPt = "C:\\Users\\leleg\\OneDrive\\Documents\\mpr.txt";
		String ptdir = "C:\\Users\\leleg\\OneDrive\\Documents";
		
		// Escrevendo pastas com Streams abertas no try-with-resources
		try(BufferedWriter fw = new BufferedWriter(new FileWriter(StPt))){
			for(String line : lines) {
				fw.write(line);
				fw.newLine();
			}
			
			// Listagem de pastas
			File path = new File(ptdir);
			File[] folders = path.listFiles(File::isDirectory);
			System.out.println("Pastas:");
			if(folders != null) {
			for(File folder: folders) {
				System.out.println(folder.getPath());
			}}
			
			// Listagem de arquivos
			File[] files = path.listFiles(File::isFile);
			System.out.println("\nArquivos:");
			if(files != null) {
			for(File file: files) {
				System.out.println(file.getName());
			}}
			// Criação de subpasta
			File sub = new File(ptdir, "subpasta");
			if (sub.mkdir()) {
			    System.out.println("Subpasta criada");
			} 
			else {
			    System.out.println("Já existe/erro");
			}

		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			System.out.println("Programa Finalizado.");
		}
		
	}

}
