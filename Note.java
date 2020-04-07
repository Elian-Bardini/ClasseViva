
public class Note {
	private String descrizione;

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Note(String descrizione) {
		super();
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "Note descrizione=" + descrizione + "";
	}
	
	
}
