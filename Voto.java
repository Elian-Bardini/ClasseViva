
public class Voto {
	private int n_voto;
	private String materia;
	
	
	//costruttore
	public Voto(int n_voto, String materia) {
		this.n_voto = n_voto;
		this.materia = materia;
	}



	
	//get and set
	public int getN_voto() {
		return n_voto;
	}


	public void setN_voto(int n_voto) {
		this.n_voto = n_voto;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}

	}
