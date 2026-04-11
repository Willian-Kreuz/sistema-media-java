package entities;

import java.util.ArrayList;

public class Alunos {

    private String name;
    private ArrayList<Double> notas = new ArrayList<>();

    public Alunos() {
    }

    public Alunos(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void adicionarNota(double notasAdicionadas) {
        notas.add(notasAdicionadas);
    }

    public double calcularMedia() {
        double soma = 0;

        for (double media : notas) {
            soma += media;
        }

        if (notas.size() > 0) {
            return soma / notas.size();
        } else {
            return 0;
        }
    }


    public String verificarSituacao() {
        if (notas.size() == 0) {
            return "Sem notas";
        } else {
            double media = calcularMedia();
            if (media >= 7) {
                return "Media do aluno: " + media + "\nSituação: Aprovado";
            } else if (media >= 5) {
                return "Media do aluno: " + media + "\nSituação: Em Exame";
            } else {
                return "Media do aluno: " + media + "\nSituação: Reprovado";
            }
        }
    }

    public String toString() {
        return "Aluno: " + name
                + "\nMédia: " + String.format("%.2f", calcularMedia())
                + "\n" + verificarSituacao();
    }
}

