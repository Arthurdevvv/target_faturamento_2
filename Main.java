import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
        Double total= 0.0;
        HashMap<String, Double> valores = new HashMap<>();

        valores.put("SP", 67836.43);
        valores.put("RJ", 36678.66);
        valores.put("MG", 29229.88);
        valores.put("ES", 36678.66);
        valores.put("Outros", 29229.88);

        for (Double valor : valores.values()) {
            total += valor;
        }

        for (String estado : valores.keySet()) {
            double vEstado = valores.get(estado);
            double porcentagem = (vEstado/total)*100;
            System.out.println("Estado: " + estado + ". Porcentagem: " + porcentagem+ "%");
        }
            
    }
}