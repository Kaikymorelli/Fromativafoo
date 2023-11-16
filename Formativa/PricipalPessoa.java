package Formativa;

public class PricipalPessoa {
	
	public static void main(String[] args) {
		
		Fisica pessoa1 = new Fisica ("Kaiky Morelli", "46252763561", "653725271");
		
		pessoa1.getNome();
		pessoa1.getCpf();
		pessoa1.getRg();
		
		 System.out.println( pessoa1.getNome());
		 System.out.println( pessoa1.getCpf());
	     System.out.println( pessoa1.getRg());
		
	}

}
