import java.io.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
		
		  
		    Scanner Amministratore = new Scanner(System.in);

		    System.out.println("Buongiorno, inserisci il tuo nome, cognome, mail e password:");

		    String k = Amministratore.nextLine();
		    int x = Amministratore.nextInt();
		    double y = Amministratore.nextDouble();
		    
		//stampare solo il: NOME, COGOME, MAIL E PASSWORD dei dati presi da tastiera(lo Scanner)    
		    
		    
		    
		    
		    
		    
	
		    
			 
				Amministratore vet=new Amministratore();
				Amministratore a=new Amministratore("", "", "", "");
				vet.addAmministratore();
				vet.addAmministratore();
				vet.addAmministratore();
		
		    
		    
		    
   
		    
	//per file di testo	    
		    Textfile out = new Textfile("file.txt", 'W');
			try{
				out.toFile(a.getNome());//scrive nel file questa stringa
				out.toFile(a.getCognome());
				out.toFile(a.getMail());
				out.toFile(a.getPassword());
			}
			catch (FileException exception){
				System.out.println(exception.getMatter());
			}
			out.closeFile();
			
			Textfile in = new Textfile("file.txt",'R');
			String line;
			try{
				//ciclo infinito
				while (true)
				{
					line = in.fromFile();
					System.out.println(line);
				}
			}
			catch (FileException exception) {
				System.out.println(exception.getMatter());
			}
			out.closeFile();
		    

	 
			 
		}


	}
