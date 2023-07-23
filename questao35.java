public class questao35 {

	public static void main(String[] args) {
		
		int maiorIntDois = maior.maior2(12, 5);
		int maiorIntTres = maior.maior3(5, 6, 7);
		int maiorIntQuatro = maior.maior4(900, 2, 3, 4);
		int maiorIntCinco = maior.maior5(1, 10, 20, 30, 40);
		
		System.out.println("Maior entre 2 inteiros: "+maiorIntDois);
		System.out.println("Maior entre 3 inteiros: "+maiorIntTres);
		System.out.println("Maior entre 4 inteiros: "+maiorIntQuatro);
		System.out.println("Maior entre 5 inteiros: "+maiorIntCinco);

		double maiorDoubleDois = maior.maior2(5.5, 8.7);
		// e por ai vai
		
		System.out.println("Maior entre 2 doubles: "+maiorDoubleDois);
	}

}

class maior <T extends Number & Comparable>{
	
	
	
	public static <T extends Number & Comparable<T>> T maior2(T a, T b) {
		return a.compareTo(b) >= 0 ? a : b;
	}
	
	public static <T extends Number & Comparable<T>> T maior3(T a, T b, T c) {
		T maiorAB = maior2(a, b); // aqui ta usando o metodo anterior pra comparar os 2 primeiros
		return maior2(maiorAB, c); // aqui ta comparando o resultado anterior com o C, tudo usando o metodo maior2
	}
	
	public static <T extends Number & Comparable<T>> T maior4(T a, T b, T c, T d) {
		T maiorABC = maior3(a, b, c);
		return maior2(maiorABC, d);
	}
	
	public static <T extends Number & Comparable<T>> T maior5(T a, T b, T c, T d, T e) {
		T maiorABCD = maior4(a, b, c, d);
		return maior2(maiorABCD, e);
	}

}
