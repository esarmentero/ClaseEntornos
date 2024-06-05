/**
 * 
 */
package dam_refactorizacion;

/**
 * Clase que almacena los parametros y funcionalidad de la cuenta
 * @author DAM
 * @version 1.0
 */
public class CCuenta {
	/*Variabale para almacenar el nombre del titular de la cuenta*/
    private String nombre;
    /*Variable para indicar el numero de cuenta*/
    private String cuenta;
    /*Variable para almacenar el saldo disponible*/
    private double saldo;
    /*Variable que almacena el tipo de interes de la cuenta*/
    private double tipoInteres;

    /**
     * Constructor vacio de la clase cuenta
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor de la clase cuenta
     * @param nom: nombre del titular
     * @param cue: numero de cuenta
     * @param sal: saldo disponible
     * @param tipo: tipo interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Metodo publico que informa del saldo 
     * @return saldo diponible
     */
    public double estado()
    {
        return saldo;
    }
    
    /**
     * Metodo publico que me aumenta el saldo la cantidad indicada
     * @param cantidad: valor que quiero sumar
     * @throws Exception: excepcion para controlar cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Metodo publico para disminuir el saldo de la cuenta
     * @param cantidad: valor que quiero sacar
     * @throws Exception: excpcion para controlar cantidades y/o saldo negativo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
