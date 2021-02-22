
/**
 * @author Maria del Rosario Martínez Marco
 * @version 1.2
 *
 */
public class RectanguloMRMM extends FiguraGeometricaMRMM {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la clase
	 * @param tipoFigura nombre de la figura geométrica que representa 
	 * @param lG longitud del lado más grande del rectángulo
	 * @param lP longitud del lado más pequeño del rectángulo
	 */
	public RectanguloMRMM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Devuelve el valor del area del rectángulo
	 * @return el valor del area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Devuelve el valor del perímetro del rectángulo
	 * @return el valor del perímetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
