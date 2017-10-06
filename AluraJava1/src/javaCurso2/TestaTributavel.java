package javaCurso2;

import javaCurso2.ContaCorrente;
import javaCurso2.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.CalculaTributaveis());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.CalculaTributaveis());
        
        
	}
}
