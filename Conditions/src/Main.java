
public class Main {

	public static void main(String[] args) {
		double preco = 34.5;
		double desconto;
		
		desconto = (preco < 30.0) ? 
				preco * 0.1 : 
				preco * 0.2;
		
		System.out.println(desconto);
		

	}

}
