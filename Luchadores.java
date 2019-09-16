package Luchadores;

public class Luchador {

	private int id;
	private int peso;
	private int altura;
	private int[] vencidos;
	
	public Luchador(int id, int peso, int altura, int cantLuchadores) {
		this.id = id;
		this.peso = peso;
		this.altura = altura;
		this.vencidos = new int[cantLuchadores];
	}

	public void luchar(Luchador[] luchador) {
		//Recorro todo el array de luchadores pero solo lucho contra los que no soy yo y los que no luche todavia
		for (int i = 0 ; i < this.vencidos.length ; i++) {
			if (this.id != i || this.vencidos[i] == 0) {
				// si el peso y la altura es mayor le gano
				if (this.peso >= luchador[i].peso && this.altura >= luchador[i].altura) {
					this.vencidos[i] = 1;
					luchador[i].vencidos[id] = -1;
					//Si le gano recorro todo el array del derrotado para saber a quienes le gano y darlos por ganados
					for (int j = 0 ; j < this.vencidos.length ; j++) {
						if (luchador[i].vencidos[j] == 1) {
							this.vencidos[j] = 1;
						}
					}
				}
				else
					this.vencidos[i] = -1;
					luchador[i].vencidos[id] = 1;
			
			}
		
		}
			
		
	}

}
