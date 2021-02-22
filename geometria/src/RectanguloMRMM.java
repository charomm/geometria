
/**
 * @author Maria del Rosario Mart�nez Marco
 * @version 1.2
 *
 */
public class RectanguloMRMM extends FiguraGeometricaMRMM {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la clase
	 * @param tipoFigura nombre de la figura geom�trica que representa 
	 * @param lG longitud del lado m�s grande del rect�ngulo
	 * @param lP longitud del lado m�s peque�o del rect�ngulo
	 */
	public RectanguloMRMM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Devuelve el valor del area del rect�ngulo
	 * @return el valor del area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Devuelve el valor del per�metro del rect�ngulo
	 * @return el valor del per�metro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
