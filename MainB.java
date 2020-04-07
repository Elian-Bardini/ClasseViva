
public class MainB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Studente s1=new Studente("Elian", "Bardini");
		System.out.println(s1.toString());
		
		Voto v1=new Voto(4, "Matematica");
		System.out.println(v1.toString());
		
		Note n1=new Note("L'alunno non è attento alla lezione");
		System.out.println(n1.toString());
		
		Assenze a1=new Assenze(6, 7, "Aprile");
		System.out.println(a1.toString());
		
		
	}

}
