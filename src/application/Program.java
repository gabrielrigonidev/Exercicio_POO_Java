package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Your name: ");
        aluno.nome = sc.nextLine();

        System.out.print("First Note: ");
        aluno.nota_1 = sc.nextDouble();
        System.out.print("Second Note: ");
        aluno.nota_2 = sc.nextDouble();
        System.out.print("Third Note: ");
        aluno.nota_3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + aluno.totalPoints());

        if(aluno.totalPoints() > 60.0) {
            System.out.println("PASS");
        } else if (aluno.totalPoints() < 60.0){
            System.out.println("FAILED");
            System.out.println("MISSING = " + aluno.missingPoints());
        }

    }
}