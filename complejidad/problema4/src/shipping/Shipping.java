package shipping;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Shipping {
	HashMap<String, Integer> costoBase = new HashMap<String, Integer>();
	HashMap<String, Integer> costoPeso = new HashMap<String, Integer>();

	public Shipping() {
		costoBase.put("argentina", 100);
		costoPeso.put("argentina", 10);

		costoBase.put("brasil", 200);
		costoPeso.put("brasil", 20);

		costoBase.put("chile", 300);
		costoPeso.put("chile", 30);

		costoBase.put("uruguay", 400);
		costoPeso.put("uruguay", 40);
	}
	
	public int calcularCostoEnvio(String pais, int peso) {
		pais = pais.toLowerCase();

		int costo = costoBase.getOrDefault(pais, -1);

		if (peso > 5) {
			costo += (peso - 5) * costoPeso.getOrDefault(pais, 0);
		}
		
		return costo;
	}
	
	public static void costoEnvio(int peso, String pais) {
		Shipping ship = new Shipping();
		int costo = ship.calcularCostoEnvio(pais, peso);

		if(costo == -1) {
			System.out.println("El pais ingresado no es valido");
			return;
		}

		System.out.println("El costo del envio es: " + costo);
	}

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			int peso = Integer.parseInt(in.readLine());
			String pais = in.readLine();

			costoEnvio(peso, pais);
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
