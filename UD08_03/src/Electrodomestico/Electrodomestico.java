package Electrodomestico;

public class Electrodomestico {
	private double precioBase = 100;
	private String color = "Blanco";
	private char consumoElectrico = 'F';
	private double peso = 10;
	
	public Electrodomestico() {
		// TODO Auto-generated constructor stub
		
	}

	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumoElectrico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoElectrico = consumoElectrico;
		this.peso = peso;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @param precioBase the precioBase to set
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the consumoElectrico
	 */
	public char getConsumoElectrico() {
		return consumoElectrico;
	}

	/**
	 * @param consumoElectrico the consumoElectrico to set
	 */
	public void setConsumoElectrico(char consumoElectrico) {
		this.consumoElectrico = consumoElectrico;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

}
