package javaCurso2;
import Excecoes.SaldoInsuficienteException;

public abstract class  Conta {
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
	
		 if (valor < 0) {
	            throw new IllegalArgumentException("Você tentou depositar" + 
	                                                " um valor negativo");
	        } else {
	            this.saldo += valor  - 0.10;        
	        }     
	}

	public void saca(double valor) {
		if(saldo >= valor) {
	        this.saldo -= valor;
	    }
	    else {
	        throw new SaldoInsuficienteException(saldo);
	    }
	}
	
	public abstract void atualiza(double taxa);{
	}

}
