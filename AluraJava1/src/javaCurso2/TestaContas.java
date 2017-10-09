package javaCurso2;

import Excecoes.SaldoInsuficienteException;

public class TestaContas {

		  public static void main(String[] args) {

		      Conta joao = new ContaCorrente();
		      joao.deposita(50.0);
		  try {
		      joao.saca(100.0);
		   } catch(SaldoInsuficienteException e) {
		        System.out.println("Saldo está insuficiente: " + e.getSaldoAtual());
		   }

		   catch(Exception e) {
		        System.out.println("um outro erro qualquer!");
		   }
		        System.out.println(joao.getSaldo());
		  }  
		}