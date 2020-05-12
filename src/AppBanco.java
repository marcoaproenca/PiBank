import model.Conta;
import model.ContaEspecial;

public class AppBanco {
	public static void main(String args[]) {
		Conta c1, c2, c3, c4;
		c1 = new Conta("Titular 1", "CPF1", 10011,1000);
		c2 = new ContaEspecial("TitularE 2", "CPF2", 10022, 1000, 1000);
		c3 = new Conta("Titular 3", "CPF3", 10033, 1300);
		c4 = new ContaEspecial("TitularE 4", "CPF4", 10044, 2000, 1000);
		
		System.out.println(c2);
		System.out.println("--------------------------------------------------------------------------------------");

		if(c2.debitar(1950.0f)) {
			System.out.println("******************");	
			System.out.println("*DEBITO REALIZADO*");
			System.out.println("******************");
			System.out.println(c2);	
		}
		else {
			System.out.println("DEBITO NÃO REALIZADO, SALDO INSUFICIENTE.");
		}
		
	}
}
