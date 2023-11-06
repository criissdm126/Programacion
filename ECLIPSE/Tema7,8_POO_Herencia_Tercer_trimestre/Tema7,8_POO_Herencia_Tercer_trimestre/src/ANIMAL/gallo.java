package ANIMAL;

public class gallo extends ave {

private String tipoPico;
	
	public gallo (String tipoPico) {
		this.tipoPico = tipoPico;
	}
	
	public String gettipoPico() {
		return tipoPico;
	}
	
	public void settipoPico (String tipoPico) {
		this.tipoPico = tipoPico;
	}
	public void vuela () {
		System.out.println("Vuela hasta el cielo");
	}

}


