package br.edu.unifcv.exercicio2;

public class Controle_Remoto {

	public int volume = 0;
	public int canal = 0;

	public void aumentaVolume() {
		if (volume < 20) {
			volume = volume + 1;
		} else {
			System.out.println("Volume j� est� no m�ximo");
		}
	}

	public void diminuiVolume() {
		if (volume > 0) {
			volume = volume - 1;
		} else {
			System.out.println("Volume j� est� no m�nimo");
		}
	}

	public void aumentaCanal() {
		if (canal < 30) {
			canal = canal + 1;
		} else {
			System.out.println("Canal j� est� no m�ximo");
		}
	}

	public void diminuiCanal() {
		if (canal > 0) {
			canal = canal - 1;
		} else {
			System.out.println("Canal j� est� no m�nimo");
		}
	}

	public void trocarCanal(int valor) {
		canal = valor;
	}

	public int getCanal() {
		return canal;
	}

	public int getVolume() {
		return volume;
	}
}
