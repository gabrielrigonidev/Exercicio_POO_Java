package entities;

public class Aluno {
    public String nome;
    public double nota_1;
    public double nota_2;
    public double nota_3;
    public double totalPoints(){
        return nota_1 + nota_2 + nota_3;
    }
    public double missingPoints(){
        if(totalPoints() < 60.0){
            return 60.0 - totalPoints();
        } else {
            return 0.0;
        }
    }
}
