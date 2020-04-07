import java.io.*; 
import java.util.Scanner;

public class Amministratore {
	private String nome;
	private String cognome;
	private String mail;
	private String password;
	
	private static int id = 1;
	
	public Amministratore(String nome, String cognome, String mail, String password) {
		this.nome = nome;
		this.cognome = cognome;
		this.mail = mail;
		this.password = password;
	}
	public Amministratore() {
		nome = "";
		cognome = "";
		mail = "";
		password = "";
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}





public void accesso(String mail, String password) {
	if(mail == this.mail && password == this.password)
		System.out.println("Loggato correttamente");
	else
		System.out.println("Mail o password errati");
}

public void addUtente() throws IOException {
	String nome;
	String cognome;
	String mail;
	String password;


	Scanner x = new Scanner(System.in);
	BufferedWriter out = new BufferedWriter( new FileWriter("utenti.txt", true) );

	System.out.print("Inserisci il nome: ");
	nome = x.nextLine();
	System.out.print("Inserisci il cognome: ");
	cognome = x.nextLine();
	System.out.print("Inserisci la mail: ");
	mail = x.nextLine();
	System.out.print("Inserisci la password: ");
	password = x.nextLine();

	
	x.nextLine();
	
	try{
		out.write(id + "" + nome + "" + cognome + "" + mail + "" + password + "" + "1");
		out.newLine();
		id++;
	}catch (Exception e){
		System.out.println("ERRORE ");
	}
	
	out.close();
}

public void addAmministratore() throws IOException {
	String nome;
	String cognome;
	String mail;
	String password;
	
	Scanner x = new Scanner(System.in);
	BufferedWriter out = new BufferedWriter( new FileWriter("utenti", true) );

	System.out.print("Inserisci il nome: ");
	nome = x.nextLine();
	System.out.print("Inserisci il cognome: ");
	cognome = x.nextLine();
	System.out.print("Inserisci la mail: ");
	mail = x.nextLine();
	System.out.print("Inserisci la password: ");
	password = x.nextLine();
	
	try{
		out.write(id + "" + nome + "" + cognome + "" + mail + "" + password + "2");
		out.newLine();
		id++;
	} catch (Exception e) {
		System.out.println("ERRORE");
	}
	
	out.close();
}






@Override
public String toString() {
	return "Genitore nome=" + nome + ", cognome=" + cognome + ", mail=" + mail + ", password=" + password + "";
}

}


