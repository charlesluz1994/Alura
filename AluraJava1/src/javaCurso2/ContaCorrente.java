package javaCurso2;
 class ContaCorrente extends Conta implements Tributavel{

	   public void atualiza(double taxa) {
	        this.saldo += this.saldo * taxa * 2;
	    }
	   
	public double CalculaTributaveis() {
		   return this.getSaldo() * 0.01;
	}
}
