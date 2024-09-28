import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FicheroSecuencial<T>{
	


	private File file;
	 private String separador; 
	 private Scanner scanner;
	 
	 public interface interfaceNegga {
			void ReadData (String[] datos);
		}
	 
	 public void SecuencialFile(String fileName,String separador,Scanner scanner) throws FileNotFoundException  {
		 this.file = new File(fileName);
		 this.separador = separador;
		 this.scanner = new Scanner(file);
	 }
	 
	 public void LeerDatos(T t) {
		 String line = scanner.nextLine();
         String[] datos = line.split(separador);
		  ((FicheroSecuencial.interfaceNegga) t).ReadData(datos);
	 }

	
	 
	 public void saltar() {
		 scanner.nextLine();
	 }
	  
	 public void close() {
	     scanner.close();   
	 }
	 
	 
}
 

	
	 
	 


