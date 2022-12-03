package it.DevelHope.ExerciseJava2;

public class CompetitionRules {
    private static CompetitionRules competitionRules = new CompetitionRules();
    private CompetitionRules(){}

    private static String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private static String competitionRule2 = "Learn every day!";
    private static String competitionRule3 = "Be the best team!";

    public void printRules(){
        System.out.println(competitionRule1 + " - " + competitionRule2 + " - " + competitionRule3);
    }


    public static CompetitionRules getInstance(){
        return competitionRules;
    }
}
