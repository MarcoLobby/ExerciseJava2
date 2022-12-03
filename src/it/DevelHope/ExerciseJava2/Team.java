package it.DevelHope.ExerciseJava2;

public class Team {

    public String teamName;
    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();

    public void printTeamDetails(){
        System.out.println(p1.printProgrammerDetails());
        System.out.println(p2.printProgrammerDetails());
    }
}
