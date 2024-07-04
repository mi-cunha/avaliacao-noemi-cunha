package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControledeEntrada {
    private static List<Especie> especies = new ArrayList<>();
    private static List<Alienigena> alienigenas = new ArrayList<>();
    private static int contador = 1;

    public static void registroEspecie(Scanner scanner) {
        System.out.print("Nome da espécie: ");
        String nome = scanner.nextLine();
        System.out.print("Planeta: ");
        String planeta = scanner.nextLine();
        System.out.print("Nível de periculosidade base: ");
        int nivelPericulosidadeBase = scanner.nextInt();
        scanner.nextLine();

        Especie especie = new Especie(nome, planeta, nivelPericulosidadeBase);
        especies.add(especie);
        System.out.println("Espécie registrada: " + especie.getNomeEspecie());
    }

    public static void registrarAlien(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Espécie: ");
        String nomeEspecie = scanner.nextLine();

        Especie especie = especies.stream()
                .filter(e -> e.getNomeEspecie().equalsIgnoreCase(nomeEspecie))
                .findFirst()
                .orElse(null);

        if (especie == null) {
            System.out.println("Espécie não encontrada. Por favor, registre a espécie primeiro.");
            return;
        }

        System.out.print("Nível de periculosidade: ");
        int nivelPericulosidade = scanner.nextInt();
        scanner.nextLine();

        Alienigena alienigena = new Alienigena(contador++, nome, especie, nivelPericulosidade);
        alienigenas.add(alienigena);
        System.out.println("Alien registrado com sucesso.");
        System.out.println(alienigena);
    }

    public static void gerarRelatorio() {
        if (alienigenas.isEmpty()) {
            System.out.println("Nenhum alienígena cadastrado.");
        } else {
            System.out.println("Relatório de Alienígenas:");
            alienigenas.forEach(System.out::println);
        }
    }

    public static void exibirRankingDePericulosidade() {
        alienigenas.sort((p1, p2) -> Integer.compare(p2.getNivelPericulosidade(), p1.getNivelPericulosidade()));
        System.out.println("Ranking de Periculosidade:");
        for (Alienigena alienigena : alienigenas) {
            System.out.println(alienigena);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nControle de Entrada de Alienígenas:");
            System.out.print("Escolha uma opção: ");
            System.out.println("\n1. Registrar espécie");
            System.out.println("2. Registrar alienígena");
            System.out.println("3. Gerar Relatório");
            System.out.println("4. Exibir ranking de periculosidade");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    registroEspecie(scanner);
                    break;
                case 2:
                    registrarAlien(scanner);
                    break;
                case 3:
                    gerarRelatorio();
                    break;
                case 4:
                    exibirRankingDePericulosidade();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

}
