package Formativa;

public class PrincipalUsuario {

	public static void main(String[] args) {
		
		Usuario login1 = new Usuario (1,"Kaiky morelli", 1233, "Adm", "Morelli");
		
	     login1.getId();
	     login1.getNome();
	     login1.getPassword();
	     login1.getPermissao();
	     login1.getUsuario();
	     
	     
	     System.out.println( login1.getId());
	     System.out.println( login1.getNome());
	     System.out.println( login1.getPassword());
	     System.out.println( login1.getPermissao());
	     System.out.println( login1.getUsuario());
	     }
}
