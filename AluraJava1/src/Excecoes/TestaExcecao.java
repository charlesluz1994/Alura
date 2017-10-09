package Excecoes;

public class TestaExcecao {

	public static void main(String[] args) {
		System.out.println("Início Main");
		m1();
		System.out.println("Fim Main");

	}

	private static void m1() {
		System.out.println("inicio m1");
		m2();
		System.out.println("fim m1");

	}

	private static void m2() {
		System.out.println("inicio m2");

		int[] nums = new int[5];
		for (int i = 0; i < 5; i++) {
			nums[i] = i * 2;
			System.out.println(nums[i]);
		}
		System.out.println("fim m2");
	}

}
