
public class Classe {
	private static final int MAX_NUM_STUDENTI=10;
	private Studente lista_Studenti[];
	private int i=0;
	private int n_classe;
	private char sezione;
	
	
	//costruttore
	public Classe(int n_classe, char sezione) {
		this.n_classe = n_classe;
		this.sezione = sezione;
	}
	//get and set
	
	public int getN_classe() {
		return n_classe;
	}


	public void setN_classe(int n_classe) {
		this.n_classe = n_classe;
	}


	public char getSezione() {
		return sezione;
	}


	public void setSezione(char sezione) {
		this.sezione = sezione;
	}
	//costruttore
	public Classe()
	{
		lista_Studenti=new Studente[MAX_NUM_STUDENTI];
	}
	


	//aggiungi studenti
	public void aggiungi_studente(String Nome,String Cognome)
	{	
		lista_Studenti[i]=new Studente(Nome, Cognome);
		i++;
	}
	//stampa studenti
	public void stampaStudenti()
	{
		for(int i=0;i<MAX_NUM_STUDENTI;i++)
		{
			System.out.println(lista_Studenti[i]);
		}
	}
	
}
