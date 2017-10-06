package javaCurso2;

class GerenciadorDeImpostoDeRenda {
    private double total;

    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);

        this.total +=  t.CalculaTributaveis();
    }

    public double getTotal() {
        return this.total;
    }
}
