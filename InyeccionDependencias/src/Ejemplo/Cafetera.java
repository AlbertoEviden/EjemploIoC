package Ejemplo;

public class Cafetera {
	
	private FiltroDeAgua filtro;
	
	public Cafetera(FiltroDeAgua filtro) {
		this.filtro = filtro;
	}
	
	public void filtrar() {
		filtro.filtrarAgua();
		System.out.println("Preparando café para Alberto...");
	}

	public static void main(String[] args) {
		
		// hacemos el llamamiento a nuestra clase
		FiltroDeAgua haciendoCafe = new FiltroDeAgua();
		
		//Creamos una instancia en nuestra clase main con el filtro de agua
		Cafetera cafe = new Cafetera(haciendoCafe);
		
		//Mostramos el resultado
		cafe.filtrar();
	}
}
