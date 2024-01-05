package Local.Oxception.ExeptionTeste;

import java.io.File;
import java.io.IOException;

public class ExeptionTeste03 {
	
	public static void main(String[] args) {
		Local();
	}
	
	private static void Local(){
		File file = new File("arquivo\\texro.txt");
		
		try{
		boolean bol = file.createNewFile();
		System.out.println("Arquivo " + bol);
			
			if(bol == true){
				System.out.println("o arquivo foi criado");
			}else{
				if(bol == false){
				
				System.out.println("Aruivo nao fou ctiado");
					}
			}
			}catch(IOException e){
			e.printStackTrace();
		}
	}
}