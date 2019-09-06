package br.edu.unifcv.exercicio2;

public class Televisao extends Controle_Remoto {
	public static void main(String[] args) {
		Controle_Remoto controle = new Controle_Remoto();
		// troca para o canal 15
		controle.trocarCanal(15);
		controle.getVolume();
		// aumenta o volume em 1
		controle.aumentaVolume();
		// aumenta de novo
		controle.aumentaVolume();
		// diminui o volume
		controle.diminuiVolume();
		// aumenta um canal
		controle.aumentaCanal();
		// diminui um canal
		controle.diminuiCanal();
		System.out.println("Canal: " + controle.getCanal());
		System.out.println("Volume: " + controle.getVolume());
	}
}
