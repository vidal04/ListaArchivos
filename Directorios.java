
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class Directorios {

	public static void main(String[] args) {
		String ruta = "";
		String user_extensiones = "";
		String extensiones [];
		File directorio = new File("C:\\");
		InputStreamReader isr;// = new InputStreamReader(System.in);
        BufferedReader br;// = new BufferedReader (isr);
        boolean flag = true;
        
        	while(flag == true)
        	{
        	System.out.println("Introduzca la ruta: ");
        	isr = new InputStreamReader(System.in);
            br = new BufferedReader (isr);
	        try {
				ruta = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
	        //System.out.println(ruta);
	        directorio = new File(ruta);
	        
        	if(directorio.exists())
	        {
	        	System.out.println("Se listarán archivos del directorio: " + directorio);
	        	flag = false;
	        }else
	        {
	        	System.out.println("El directorio introducido no existe!!.");
	        	System.out.println("Introduzca un directorio válido.");
	        	flag = true;
	        }
        	}
        System.out.println("Introduzca las extensiones de los archivos que desea buscar separados con comas: ");
        
    	isr = new InputStreamReader(System.in);
        br = new BufferedReader (isr);
        try {
        	user_extensiones = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
        user_extensiones = user_extensiones.trim();
        user_extensiones = user_extensiones.replace(" ", "");
        
        System.out.println("Las extensiones a buscar son: " + user_extensiones);
        extensiones = SeleccionaExtensiones.introduceExtensiones(user_extensiones);
        Lista.listaDirectorios(directorio, "", extensiones);
	}

}
