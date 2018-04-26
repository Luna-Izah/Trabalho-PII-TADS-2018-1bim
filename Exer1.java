import java.util.Scanner;

public class Exer1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		String opcao;
		
		while (true) {
			System.out.println("O que deseja fazer?");
			System.out.println("\t 1 para continuar");
			System.out.println("\t 0 para sair");
			opcao = scan.next();
			if((opcao.equals("1")) || (opcao.equals("0"))) {
				break;
			} else {
				System.out.println("\r\nDigite novamente!!!\r\n");
			}
		}
		
		if (opcao.equals("1")) {
			
			int numCliente;
		
			while (true) {
				System.out.println("Informe a quantidade de clientes que deseja armazenar");
				numCliente = scan.nextInt();
				if (numCliente > 0) {
					break;
				} else {
					System.out.println("\tNúmero inválido.\r\n\tDigite novamente\r\n");
				}
			}
			
			String[] nomeCliente;
			nomeCliente = new String[numCliente];
			
			int contador = 0;
			
			while (true) {
				System.out.println("O que deseja fazer?");
				System.out.println("\t 2 para armazenar o nome do cliente");
				System.out.println("\t 3 para cancelar");
				int opcao1 = scan.nextInt();
			
				if (opcao1 == 2) {
					
					boolean opcao2 = true;
					
					while (opcao2) {
						System.out.println("Informe o nome do cliente");
						String oNome = scan.next();
						if (oNome.length() >= 2) {
							nomeCliente[contador] = oNome;
							opcao2 = false;
						} else {
							System.out.println("\r\n\tNome inválido.\r\n\tDigite novamente.\r\n");
						}
					}
					contador++;
				}
				
				if (opcao1 == 3) {
					System.out.println("\r\nPrograma finalizado!!!\r\n");
					break;
				}
				if (contador == numCliente) {
					System.out.println("\r\nTodos os clientes registrados.\r\n");
					break;
				} else {
					System.out.printf("\r\nHá %d registrados.\r\n\r\n", contador);
				}
			}
			if (contador != 0) {
				for (int i = 0; i < contador; i++) {
					System.out.printf("Nome: %s\r\n",nomeCliente[i]);
				} 
			}
		}
		if (opcao.equals("1")) {
			System.out.println("\r\nPrograma fechado!!!\r\n");
		}			
	}	
}