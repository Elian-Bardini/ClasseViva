
public class Assenze {
	private int numero_assenze;
	private int giorno;
	private String mese;
	//get and set
	public int getNumero_assenze() {
		return numero_assenze;
	}
	public void setNumero_assenze(int numero_assenze) {
		this.numero_assenze = numero_assenze;
	}
	public int getGiorno() {
		return giorno;
	}
	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}
	public String getMese() {
		return mese;
	}
	public void setMese(String mese) {
		this.mese = mese;
	}
	//costruttore
	public Assenze(int numero_assenze, int giorno, String mese){
		this.numero_assenze=numero_assenze;
		this.giorno=giorno;
		this.mese=mese;
	}
	
	public String toString() {
		return "Assenze [numero_assenze=" + numero_assenze + ", giorno="
				+ giorno + ", mese=" + mese + "]";
	}
	
}
