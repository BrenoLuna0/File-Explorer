import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Date;

public class Funcoes {
	
	public static void delete(File file) {
		try {
			file.delete();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void status(File file) {
		try {
			if(file.isFile()) {
				Date d = new Date(file.lastModified());
				System.out.println("Essas são as informações do seu arquivo:");
				System.out.println("~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Local: "+ file.getName());
				System.out.println("Tamanho utilizado: "+ (file.length())/1024+"KB");
				System.out.println("Última modificação em: "+ d);
				if(file.isHidden()) {
					System.out.println("É um arquivo oculto");
				}else {
					System.out.println("Não é um arquivo oculto");
				}
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void listarRoot() {
		   try {
			   File[] roots;
			   roots = File.listRoots();
		       for(File path:roots) {
		       System.out.println(path);
		   }  		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void listarDir(File diretorio) {
		   try { 
		        File[] pastas;
		        
		        pastas = diretorio.listFiles();
		         
		        for(File path:pastas) {
		        	 System.out.println(path);
		         }
		         
		      } catch(Exception e) {
		         e.printStackTrace();
		      }
	}
	
	public static void copiarArquivo(File in) {
		byte[] buffer = null;
		
		File out = new File(in.getParent()+"\\copia.txt");
		
		//buffer.
		
		
		
		try {
			
			InputStream is = new FileInputStream(in);
			//DataInputStream dis = new DataInputStream(is);
			
			is.read(buffer);
			
			//dis.close();
			is.close();
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		try {
			
			OutputStream os = new FileOutputStream(out);
			//DataOutputStream dos = new DataOutputStream(os);
			//dos.write(buffer);
			
			//dos.close();
			os.write(buffer);
			os.close();
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
