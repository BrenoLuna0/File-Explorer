import java.io.File;
import java.sql.Date;
import java.util.Scanner;

public class Main {
	
	private static Scanner s;

	public static void main(String[] args) {
		
		File file;
		String path;
		boolean parada = false;
		int dado;
		
		
		try {
			s = new Scanner(System.in);
			
			System.out.println("Bem vindo ao seu explorador de arquivos orientado a gambiarras");
			
			
			while(parada == false) {
				System.out.println("O que você deseja fazer?");
				System.out.println();
				System.out.println("1 - Listar raizes");
				System.out.println("4 - Listar diretorio");
				System.out.println("5 - Deletar algum arquivo");
				System.out.println("6 - Listar atributos de um arquivo");
				System.out.println("7 - Copiar um arquivo");
				System.out.println("0 - sair");
				System.out.println();
				
				dado = s.nextInt();
				switch(dado) {
				case 1:
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
					Funcoes.listarRoot();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
					break;
				case 4:
					System.out.println("Copie e cole o caminho do diretorio que deseja exibir");
					path = s.next();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
					file = new File(path);
					Funcoes.listarDir(file);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
					break;
				case 5:
					System.out.println("Copie e cole o caminho do arquivo que deseja excluir");
					path = s.next();
					file = new File(path);
					Funcoes.delete(file);
					break;
				case 6:
					System.out.println("Copie e cole o caminho do arquivo que deseja ver os dados");
					path = s.next();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
					file = new File(path);
					Funcoes.status(file);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
					break;
				case 7:
					System.out.println("Copie e cole o caminho do arquivo que deseja copiar");
					path = s.next();
					file = new File(path);
					Funcoes.copiarArquivo(file);
					break;
				case 0:
					parada = true;
					break;
				}
				//dado = -5;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	

}
