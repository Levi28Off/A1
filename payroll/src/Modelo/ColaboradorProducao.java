package Modelo;

public class ColaboradorProducao extends Colaborador {
    private int quantpecas;
    private double valorporpeca;

    public ColaboradorProducao(int matricula, String nome, int quantpecas, double valorporpeca) {
        super(matricula, nome, SalarioPadrao);
        this.quantpecas = quantpecas;
        this.valorporpeca = valorporpeca;
    }

    public double calcularProdutividade() {
        return this.quantpecas * this.valorporpeca;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + calcularProdutividade();
    }

    @Override
    public void exibirDados() {
        System.out.println("Tipo: Produção");
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.printf("Salário Base: R$ %,.2f%n", getSalarioBase());
        System.out.printf("Produtividade: R$ %,.2f%n", calcularProdutividade());
        System.out.printf("Salário Final: R$ %,.2f%n", calcularSalarioFinal());
    }

}
