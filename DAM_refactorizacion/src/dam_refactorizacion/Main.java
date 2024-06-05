/**
 * 
 */
package dam_refactorizacion;

/**
 * Clase que almcena la funcionalidad principal de CCuenta
 * @author ClaseDAM
 * @since 3-9-2023
 * @version 1.18
 */
public class Main {

	/**
	 * metodo principal
	 * @param args: parametros predefinidos del main
	 */
	public static void main(String[] args) {
			/*variable que almacena los parametros de la cuenta*/
		    CCuenta miCuenta;
		    /*variable que almacena el saldo de la cuenta*/
	        double saldoActual;
	        /*variable que almacena la cantidad que se le pasa como parametro*/
	        float cantidad = 0.0f;

	        miCuenta = new CCuenta("Beatriz Perez","1000-2365-85-1230456789",200,0);
	        saldoActual = miCuenta.estado();
	        System.out.println("El saldo actual es"+ saldoActual );
	        
	        operaciones(miCuenta, cantidad);
	    }

	/**
	 * Metodo privado statico para controlar la funcionalidad de clase cuenta
	 * @param miCuenta: variable que almacena los valores del objeto cuenta
	 * @param cantidad: variable numerica que guarda la cantidad a extraer
	 */
	private static void operaciones(CCuenta miCuenta, float cantidad) {
		try {
		    miCuenta.retirar(2300);
		} catch (Exception e) {
		    System.out.print("Fallo al retirar");
		}
		try {
		    System.out.println("Ingreso en cuenta");
		    miCuenta.ingresar(695);
		} catch (Exception e) {
		    System.out.print("Fallo al ingresar");
		}
	}

	}


