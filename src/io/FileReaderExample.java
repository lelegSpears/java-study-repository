package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderExample {

	public static void main(String[] args) {
		String path = "C:\\Users\\leleg\\Downloads\\ativ.txt";
		String pathSub = "C:\\Users\\leleg\\Downloads";
		List<String> textos = new ArrayList<>();
		File out = new File(pathSub, "out");
		File sum = new File(out, "summary.txt");
		
		
		try(BufferedReader fr = new BufferedReader(new FileReader(path)))
		{
			File caminho = new File(path);
			System.out.print(caminho.getAbsolutePath());
			
			String line;
			while((line = fr.readLine()) != null) {
				System.out.println(line);
				textos.add(line);
			}
			for(String Texto : textos) {
				System.out.println(Texto);
			}
		}
		catch(IOException e) {
			System.out.println("Erro:" + e.getMessage());
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(sum))){
			
			out.mkdirs();
			sum.createNewFile();
			
			for(String texto : textos) {
				bw.write(texto);
				bw.newLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("Erro:" + e.getMessage());
		}

	}

}