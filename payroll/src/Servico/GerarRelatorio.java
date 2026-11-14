package Servico;

import Modelo.Colaborador;
import java.util.ArrayList;

public class GerarRelatorio {

    public void gerarFolhaPagamento(ArrayList<Colaborador> lista) {
        System.out.println("\n=== Folha de pagamento ===");

        if (lista.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
            return;
        }

        for (Colaborador c : lista) {
            System.out.println("--------------------------------");
            c.exibirDados();
        }
        System.out.println("--------------------------------");
    }

    public double calcularTotalFolha(ArrayList<Colaborador> lista) {
        double soma = 0;
        for (Colaborador c : lista) {
            soma += c.calcularSalarioFinal();
        }
        return soma;
    }

    public void exibirResumoFolha(ArrayList<Colaborador> lista) {
        System.out.println("\n=== Resumo da Folha ===");

        if (lista.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
            return;
        }

        int totalColaboradores = lista.size();
        double somaTotal = calcularTotalFolha(lista);
        double mediaSalarial = somaTotal / totalColaboradores;

        System.out.println("Quantidade total de colaboradores: " + totalColaboradores);
        System.out.printf("Soma total da folha de pagamento: R$ %,.2f%n", somaTotal);
        System.out.printf("Média salarial dos colaboradores: R$ %,.2f%n", mediaSalarial);
    }
}