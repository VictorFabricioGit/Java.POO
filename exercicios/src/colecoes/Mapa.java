package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Victor"); // diferente de outras colections em Map
		//  não tem o metodo .add , no entando, tem o metodo .put que 
		// além de adicionar também substitui caso já exista 
		usuarios.put(1, "Ricardo"); // 1 já existia agora foi substituido
		
		System.out.println(usuarios.size());// Map não aceita duplicação como os 
		// dois tem o mesmo valor so vai aparecer um usuário
		
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Rebeca");
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty()); // não está vazio
		
		System.out.println(usuarios.keySet()); // apresenta apenas as chaves
		System.out.println(usuarios.values()); // apresenta apenas os valores
		System.out.println(usuarios.entrySet()); // apresenta chaves e valores
		System.out.println(usuarios.containsKey(1)); // consuta chave
		System.out.println(usuarios.containsValue("Rebeca")); // consuta valor
		
		System.out.println(usuarios.get(2)); // obtém o valor a partir da chave
        System.out.println(usuarios.remove(null));// remove valores pela chave 
        System.out.println(usuarios.remove(3, "Gui"));// remove as chaves e os valores
        // mas os dois valores tems que bater caso contrario vai dar falso 
		
		for(int chave: usuarios.keySet()) { // percorre as chaves
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) { // percorre os valores
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro); // percorre chaves e valores
		}
		
		
	}

}
