package Cafetera;

public class Cafetera {

	private double capacidadMaxima;
	private double cantidadActual;
	
	
	Cafetera(){
		this.setCapacidadMaxima(capacidadMaxima);
		this.setCantidadActual(cantidadActual);
	}
	
	Cafetera(double capacidadMaxima){
		this.setCapacidadMaxima(capacidadMaxima);
		this.setCantidadActual(0);
	}
	
	Cafetera(double capacidadMaxima, double cantidadActual){
	    if(cantidadActual > capacidadMaxima){
	        this.setCantidadActual(capacidadMaxima);
	    } else {
	        this.setCantidadActual(cantidadActual);
	    }
	    this.setCapacidadMaxima(capacidadMaxima);
	}

	public void setCapacidadMaxima(double capacidadMaxima) {
		if (capacidadMaxima < 250) {
			capacidadMaxima = 250;
		}
		this.capacidadMaxima = capacidadMaxima;
	}

	public void setCantidadActual(double cantidadActual) {
		if(cantidadActual > 0 && cantidadActual < this.capacidadMaxima) {
			this.cantidadActual = cantidadActual;
		}
	}

	private double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	private double getCantidadActual() {
		return cantidadActual;
	}
	
	public void llenar() {
		this.cantidadActual = this.capacidadMaxima;
	}
	
	public void servirTaza(int montoTaza) {
		if(cantidadActual <= montoTaza) {
			this.setCantidadActual(0);
		} else {
			this.setCantidadActual(cantidadActual - montoTaza);
		}
	}
	
	public void vaciar() {
		this.cantidadActual = 0;
	}
	
	public int agregarCafe(int cafeAgregado) {
		
		double sobrante = 0;
		
		if(this.getCantidadActual() + cafeAgregado > this.getCapacidadMaxima()) {
			sobrante = (this.getCantidadActual() + cafeAgregado) - this.getCapacidadMaxima();
			this.setCantidadActual(this.getCapacidadMaxima());
			
		} else {
			this.setCantidadActual(this.getCantidadActual() + cafeAgregado);
		}
		return (int) sobrante;
	}

	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual
				+ ", getCapacidadMaxima()=" + getCapacidadMaxima() + ", getCantidadActual()=" + getCantidadActual()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
