
public class Studente {
	private String nome;
	private int id;
	private String password;
	
	
	//costruttore
	public Studente(String nome, int id, String password) {
		this.nome=nome;
		this.id=id;
		this.password=password;
	}

	//costruttore di default
	public Studente() {
		nome=null;
		id=0;
		password=null;
		}
	
	//metodi get e set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Studente nome=" + nome + ", id=" + id + ", password=" + password + "";
	}



}


