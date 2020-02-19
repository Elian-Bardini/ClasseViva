public class Amministratore {
private String nome;
private int id;
private String password;


//costruttore
public Amministratore(String nome, int id, String password) {
	this.nome=nome;
	this.id=id;
	this.password=password;
}

//costruttore di default
public Amministratore() {
	nome=null;
	id=0;
	password=null;
	//pgA92

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

//to string
@Override
public String toString() {
	return "Amministratore nome= " + nome + ", id= " + id + ", password= " + password + "";
}

//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Amministratore a=new Amministratore("federico",314,"8439");
		 System.out.println(a.toString());
		 
		 Amministratore a1=new Amministratore("gabriel",315,"8181");;
		 System.out.println(a1.toString());
		 
		 Amministratore a11=new Amministratore("alex",316,"1425");
		 System.out.println(a11.toString());
		 
		 Amministratore a111=new Amministratore("saimon",317,"7128");
		 System.out.println(a111.toString());
	}

}


