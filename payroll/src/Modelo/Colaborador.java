package Modelo;

public class Colaborador {

    private int matricula;
    private String nome;
    private double salarioBase;
    protected static final double SalarioPadrao = 2000.00;

    public int getMatricula() {
        return this.matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public Colaborador(int matricula, String nome, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = SalarioPadrao;
    }

    public double calcularSalarioFinal() {
        return SalarioPadrao;
    }

    public void exibirDados() {
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.printf("Salário Base: R$ %,.2f%n", salarioBase);
    }
}





