package Modelo;

public class ColaboradorPadrao extends Colaborador {
    public ColaboradorPadrao(int matricula, String nome) {
        super(matricula, nome, SalarioPadrao);
    }


    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase();
    }

    @Override
    public void exibirDados() {
        System.out.println("Tipo: Padrão");
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.printf("Salário Base: R$ %,.2f%n", getSalarioBase());
        System.out.println("Beneficio adicional: R$ 0,00");
        System.out.printf("Salário Final: R$ %,.2f%n", calcularSalarioFinal());
    }


}


