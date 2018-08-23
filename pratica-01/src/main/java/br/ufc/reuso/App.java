package br.ufc.reuso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

import br.ufc.reuso.model.Student;

public class App {
    
	public static void main( String[] args ) {
    	File lista = new File("/home/daniel/lista.json");
    	
    	if (lista.exists() && lista.isFile()) {
    		try {
				Reader fileReader = new FileReader(lista);	
				
				Gson gson = new Gson();
	    		Student[] students = gson.fromJson(fileReader, Student[].class);
	    		
	    		for (Student student : students) {
					System.out.println(student);
				}
	    		
	    		fileReader.close();
	    		
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}    		
    	} else {
    		System.out.println("Arquivo não existe!");
    	}
    	
    }
    
}
