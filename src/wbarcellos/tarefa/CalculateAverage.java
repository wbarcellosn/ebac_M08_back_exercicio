/**
 * @author winic
 */
package wbarcellos.tarefa;

import java.util.Scanner;

public class CalculateAverage {

    Scanner scanner = new Scanner(System.in);

    String name;
    double note1;
    double note2;
    double note3;
    double note4;
    double average;

    public static void main (String[] args) {
        CalculateAverage calculator = new CalculateAverage();
        System.out.println("********************************");
        System.out.println("Iniciando o sistema\n");
        calculator.calculateAverage();
        calculator.printData();
        calculator.verifyIsAprovaded();
        System.out.println("\nEncerrando o sistema");
        System.out.println("********************************");
    }


    public String getName() {
        return name;
    }

    public void setName() {
        String name;

        System.out.println("Digite o nome do aluno:");
        name = scanner.nextLine();
        this.name = name;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1() {
        double note1;

        System.out.println("Digite a primeira nota do aluno:");
        note1 = scanner.nextDouble();
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2() {
        double note2;

        System.out.println("Digite a segunda nota do aluno:");
        note2 = scanner.nextDouble();
        this.note2 = note2;
    }

    public double getNote3() {
        return note3;
    }

    public void setNote3() {
        double note3;

        System.out.println("Digite a terceira nota do aluno:");
        note3 = scanner.nextDouble();
        this.note3 = note3;
    }

    public double getNote4() {
        return note4;
    }

    public void setNote4() {
        double note4;

        System.out.println("Digite a quarta nota do aluno:");
        note4 = scanner.nextDouble();
        this.note4 = note4;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage() {
        this.average = (this.note1 + this.note2 + this.note3 + this.note4) / 4;
    }

    public void calculateAverage() {
        setName();
        setNote1();
        setNote2();
        setNote3();
        setNote4();
        setAverage();
    }

    public void printData() {
        System.out.println("\nAbaixo estão as notas do aluno " + getName() + ":\n");
        System.out.println("Primeira nota: " + getNote1());
        System.out.println("Segunda nota: " + getNote2());
        System.out.println("Terceira nota: " + getNote3());
        System.out.println("Quarta nota: " + getNote4());
        System.out.println("A média das notas é: " + getAverage());
    }

    public void verifyIsAprovaded() {
        String message;

        if(this.average >= 6){
            message = "\nO aluno está APROVADO!";
        }
        else{
            message = "\nO aluno está REPROVADO!";
        }

        System.out.println(message);
    }

}
