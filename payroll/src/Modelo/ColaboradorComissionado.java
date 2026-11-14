package Modelo;

public class ColaboradorComissionado extends Colaborador {
    private double valorVendas;
    private int percentualComissao;

    public ColaboradorComissionado(int matricula, String nome, double valorVendas, int percentualComissao) {
        super(matricula, nome, SalarioPadrao);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public int getPercentualComissao() {
        return percentualComissao;
    }

    public double calcularComissao() {
        return (this.valorVendas * this.percentualComissao) / 100.0;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + calcularComissao();
    }

    @Override
    public void exibirDados() {
        System.out.println("Tipo: Comissionado");
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.printf("Salário Base: R$ %,.2f%n", getSalarioBase());
        System.out.printf("Comissâo: R$ %,.2f%n", calcularComissao());
        System.out.printf("Salário Final: R$ %,.2f%n", calcularSalarioFinal());
    }

}

