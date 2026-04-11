package app;

import entities.Alunos;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int qtd = sc.nextInt();
        sc.nextLine();
        System.out.print("Quantas notas serão lançadas? ");
        int qtdNotas = sc.nextInt();
        sc.nextLine();

        ArrayList<Alunos> alunos = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Digite o nome do %dº aluno: ", i + 1);
            String nome = sc.nextLine();

            Alunos aluno = new Alunos(nome);

            for (int j = 0; j < qtdNotas; j++) {
                System.out.printf("Digite a %dª nota: ", j + 1);
                double nota = sc.nextDouble();
                aluno.adicionarNota(nota);
            }
            sc.nextLine();
            alunos.add(aluno);
        }

        for (Alunos aluno : alunos) {
            System.out.println(aluno);
            System.out.println("---------------------------------");
        }
    }


}
