package Cadena;

public class Cadena {


		public int longitud(String cadena) {
			return cadena.length();
		}
		
		public int vocales(String cadena) {
			int num = 0;
			String vocales = "aeiou";
			for (char i : cadena.toCharArray()) {
				if (vocales.indexOf(i) != -1) {
					num+=1;
				}
			}
			return num;
		}
		
		public String invertir(String cadena) {
			String result = "";
			for (int i = cadena.length() - 1; i >= 0; i--) {
				result+=cadena.charAt(i);
			}
			return result;
		}
		
		public int contarLetra(String cadena, char caracter) {
			int num = 0;
			for (int i = 0 ; i<cadena.length(); i++) {
				if (cadena.toCharArray()[i] == caracter) {
					num+=1;
				}
			}
			return num;
		}
		
	}

	
	

