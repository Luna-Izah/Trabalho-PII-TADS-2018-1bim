import java.util.Scanner;

public class Exer2 {
	
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
			
			int numContato;
			
			while (true) {
				System.out.println("Informe a quantidade de contatos que deseja armazenar");
				numContato = scan.nextInt();
				if(numContato > 0) {
					break;
				} else {
					System.out.println("\tNúmero inválido.\r\n\tDigite novamente\r\n");
				}
			}
			
			String[] nomeContato;
			String[] emailContato;
			nomeContato = new String[numContato];
			emailContato = new String[numContato];
			
			int contador = 0;
			
			while (true) {
				
				System.out.println("O que deseja fazer?");
				System.out.println("\t 2 para armazenar o contato");
				System.out.println("\t 3 para cancelar");
				int opcao1 = scan.nextInt();
			
				if (opcao1 == 2) {
					
					boolean opcao2 = true;
					boolean opcao3 = true;
			
					while(opcao2) {
						System.out.println("Informe o nome do cliente");
						String oNome = scan.next();
						if (oNome.length() >= 2){
							nomeContato[contador] = oNome;
							opcao2 = false;
						} else {
							System.out.println("\r\n\tNome inválido.\r\n\tDigite novamente.\r\n");
						}
					}
					
					while(opcao3) {
						System.out.println("Informe o e-mail do cliente");
						String oEmail = scan.next();
						if (oEmail.matches("^[a-zA-Z0-9\\-_\\.]+@[a-zA-Z0-9]+\\..+$")) {
							emailContato[contador] = oEmail;
							opcao3 = false;
						} else {
							System.out.println("\r\n\tE-mail inválido.\r\n\tDigite novamente.\r\n");
						}
					}
					contador++;
				}
				if (opcao1 == 3) {
					System.out.println("\r\nPrograma Finalizado!!!\r\n");
					break;
				}
				if (contador == numContato) {
					System.out.println("\r\nTodos os contatos registrados.\r\n");
					break;
				} else {
					System.out.printf("Há %d registrados.\r\n\r\n", contador);
				}
			}
			if (contador != 0) {
				for (int i = 0; i < contador; i++) {
					System.out.printf("Nome: %s\r\nE-mail: %s\r\n\r\n", nomeContato[i], emailContato[i]);
				}
			}
		} 
		if (opcao.equals("1")) {
			System.out.println("\r\nPrograma fechado!!!\r\n");	
		}
	}
}