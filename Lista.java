import java.io.File;


public class Lista {

	public static void listaDirectorios (File directorio, String tabulador, String[] extensiones)
	{
		File[] archivos = directorio.listFiles();
		String extension_actual = "";
		for ( int x = 0; x < archivos.length; x++ )
		{
			//System.out.println(tabulador + archivos[x].getName());
			if(archivos[x].isDirectory())
			{
				String nuevo;
				nuevo = tabulador + " ";
				System.out.println(tabulador + archivos[x].getName());
				listaDirectorios(archivos[x], nuevo, extensiones);
			}
			else
			{
				for ( int y = 0; y < extensiones.length; y++ )
				{
					extension_actual = archivos[x].getName().toString();
//					System.out.println("Nombre archivo actual: " + extension_actual);
					for( int i = (extension_actual.length() - 1) ; i >= 0 ; i--)
					{
						if(extension_actual.charAt(i) == '.')
						{
							extension_actual = extension_actual.substring(i + 1, extension_actual.length());
							break;
						}
					}
					
//					System.out.println("Extension: " + extension_actual);
//					System.out.println("Se compara la extension " + extension_actual + " con " + extensiones[y]);
//					System.out.println("Longitud extension_actual: " + extension_actual.length());
//					System.out.println("Longitud extensiones[y]: " + extensiones[y].length());
					if(extension_actual.equalsIgnoreCase(extensiones[y]))
					{
						System.out.println("Se imprime: ");
						System.out.println(tabulador + archivos[x].getName());
					}
				}
			}
		}
	}
}
