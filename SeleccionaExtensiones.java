
public class SeleccionaExtensiones {
	public static String[] introduceExtensiones (String user_extensions)
	{
		String entrada = user_extensions;
		String subs = "";
		int tamano_arreglo = 0;
		int posicion_array = 0;
		int coma = 0;
		int cero = 0;
		System.out.println("El tamaño del String de entrada es: " + entrada.length());
		for (int x = 0; x < entrada.length(); x++)
		{
			if(entrada.charAt(x) == ',')
			{
				tamano_arreglo++;
			}
		}
		tamano_arreglo = tamano_arreglo + 1;
		String [] extensiones_separadas = new String[tamano_arreglo];
		System.out.println("El tamaño del arreglo será: " + extensiones_separadas.length);
		
		/*Prueba arreglo
		for (int x = 0; x < extensiones_separadas.length; x++)
		{
			extensiones_separadas[x] = "Puesto " + x;
		}
		
		for (int x = 0; x < extensiones_separadas.length; x++)
		{
			System.out.println(extensiones_separadas[x]);
		}*/
		for (int x = 0; x < entrada.length(); x++)
		{
			if((x + 1) == entrada.length())
			{
				subs = entrada.substring(cero, entrada.length());
				System.out.println("Se pasa al array el ultimo valor: " + subs);
				extensiones_separadas[posicion_array] = subs;
			}
			if (entrada.charAt(x) == ',')
			{
				subs = entrada.substring(cero, coma);
				System.out.println("Se pasa al array: " + subs);
				System.out.println("En la posición: " + posicion_array);
				extensiones_separadas[posicion_array] = subs;
				posicion_array++;
				System.out.println("Nueva posición array: " + posicion_array);
				cero = coma + 1;
				coma = cero;
				System.out.println("Coma: " + coma);
				System.out.println("Cero: " + cero);
			}
			else
			{
				coma++;
			}
		}
		
		for (int x = 0; x < extensiones_separadas.length; x++)
		{
			System.out.println(extensiones_separadas[x]);
		}
		
		return extensiones_separadas;
	}
}
