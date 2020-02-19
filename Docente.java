
public class Docente {
	private String nome;
	private String cognome;
	private  String materia;

	public Docente (String nome, String cognome,String materia) {
		this.cognome=nome;
		this.cognome=cognome;
		this.materia=materia;
}

public Docente() {
	nome=null;
	cognome=null;
	materia=null;
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

public String getMateria() {
	return materia;
}

public void setMateria(String materia) {
	this.materia = materia;
}

}
