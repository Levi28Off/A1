import Modelo.Colaborador;
import Modelo.ColaboradorComissionado;
import Modelo.ColaboradorPadrao;
import Modelo.ColaboradorProducao;
import Servico.GerarRelatorio;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        var lista = new ArrayList<Colaborador>();

        Scanner sc = new Scanner(System.in);
        int menu = 0;

        GerarRelatorio relatorio = new GerarRelatorio();

        do {
            System.out.println("==Menu do Sistema==");
            System.out.println("1 - Cadastrar Novo Funcionario");
            System.out.println("2 - Gerar a Folha de Pagamento");
            System.out.println("3 - Exibir um resumo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (sc.hasNextInt()) {
                menu = sc.nextInt();
            } else {
                System.out.print("Erro: Digite apenas numeros!!\n");
                sc.next();
                continue;
            }

            switch (menu) {
                case 1 -> {
                    System.out.println("Selecione o tipo de colaborador: ");
                    System.out.println("1 - Cadastrar Colaborador Padrao");
                    System.out.println("2 - Cadastrar Colaborador Comissionado");
                    System.out.println("3 - Cadastrar Colaborador Producao");
                    System.out.print("Selecione o tipo de Colaborador: ");
                    int opcao;

                    if (sc.hasNextInt()) {
                        opcao = sc.nextInt();
                        sc.nextLine();
                    } else {
                        System.out.print("Erro: Digite apenas numeros!!\n");
                        sc.next();
                        break;
                    }

                    if (opcao < 1 || opcao > 3) {
                        System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
                        break; }

                    System.out.print("Digite o numero da matricula: ");
                    int matricula;

                    if (sc.hasNextInt()) {
                        matricula = sc.nextInt();
                        sc.nextLine();
                    } else {
                        System.out.print("Erro: Digite apenas números!!\n");
                        sc.next();
                        break;
                    }

                    if (opcao < 1 || opcao > 3) {
                        System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
                        break;
                        }

                    System.out.println();

                    System.out.print("Digite seu nome: ");
                    String nome = sc.nextLine();

                    switch (opcao) {
                        case 1 -> {
                            ColaboradorPadrao colaborador = new ColaboradorPadrao(matricula, nome);
                            lista.add(colaborador);
                            System.out.println("Colaborador cadastrado com sucesso!");
                        }

                        case 2 -> {
                            System.out.print("Digite o Valor das vendas: ");
                            double valorVendas;

                            if (sc.hasNextDouble()) {
                                valorVendas = sc.nextDouble();
                            } else {
                                System.out.print("Erro: Digite apenas numeros!!\n");
                                sc.next();
                                continue;
                            }

                            System.out.println();

                            System.out.print("Digite o percentual de comissao: ");
                            int percentualComissao;

                            if (sc.hasNextInt()) {
                                percentualComissao = sc.nextInt();
                            } else {
                                System.out.print("Erro: Digite apenas numeros!!\n");
                                sc.next();
                                continue;
                            }

                            ColaboradorComissionado colaboradorComissao = new ColaboradorComissionado(matricula, nome, valorVendas, percentualComissao);
                            lista.add(colaboradorComissao);
                            System.out.println("Colaborador cadastrado com sucesso!");
                        }
                        case 3 -> {
                            System.out.print("Digite a quantidade de peças: ");
                            int quantPecas;

                            if (sc.hasNextInt()) {
                                quantPecas = sc.nextInt();
                            } else {
                                System.out.print("Erro: Digite apenas numeros!!\n");
                                sc.next();
                                continue;
                            }

                            System.out.println();

                            System.out.print("Digite o valor por peca: ");
                            var valorPorPeca = sc.nextDouble();

                            ColaboradorProducao colaboradorProduto = new ColaboradorProducao(matricula, nome, quantPecas, valorPorPeca);
                            lista.add(colaboradorProduto);
                            System.out.println("Colaborador cadastrado com sucesso!");
                        }
                    }
                }
                case 2 -> {
                    relatorio.gerarFolhaPagamento(lista);
                }
                case 3 -> {
                    relatorio.exibirResumoFolha(lista);
                }
                case 0 -> {
                    System.out.println("Encerrando o sistema...");
                }
                default -> {
                    System.out.println("Opção inválida! Escolha 1, 2, 3 ou 0.");
                }
            }
        }
            while (menu != 0); {
            sc.close();
            System.out.println("Saindo...");

        }
    }
}