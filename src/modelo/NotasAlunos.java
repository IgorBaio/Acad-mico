package modelo;

public class NotasAlunos {
	private double valorNota;
	private double pesoNota;
	
	public double getValorNota() {
		return valorNota;
	}

	public void setValorNota(double valorNota) {
		this.valorNota = valorNota;
	}

	public double getPesoNota() {
		return pesoNota;
	}

	public void setPesoNota(double pesoNota) {
		this.pesoNota = pesoNota;
	}

	NotasAlunos(double valorNota, double pesoNota) throws ExceptionNotas {
		if(valorNota < 0 || valorNota>10) {
			throw new ExceptionNotas("Nota Inválida");
		}else {
			this.valorNota = valorNota;
			this.pesoNota = pesoNota;
		}

	}
	
	
	
}
