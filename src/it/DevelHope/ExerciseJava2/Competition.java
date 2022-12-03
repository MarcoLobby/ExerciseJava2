package it.DevelHope.ExerciseJava2;

public class Competition {
    public static void main(String[] args) {
        CompetitionRules singletoneRules = CompetitionRules.getInstance();
        singletoneRules.printRules();

        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "TeamGang";
        teamB.teamName = "TeamDelBosco";

        teamA.p1.name = "Marco Lo Bello";
        teamA.p1.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 1;

        teamA.p2.name = "Pino Pigno";
        teamA.p2.programmingLanguage = "Java";
        teamA.p2.yearsOfExperience = 2;

        teamB.p1.name = "Mario Rossi";
        teamB.p1.programmingLanguage = "Kotlin";
        teamB.p1.yearsOfExperience = 1;

        teamB.p2.name = "Franco Filippo";
        teamB.p2.programmingLanguage = "C++";
        teamB.p2.yearsOfExperience = 2;

        teamA.printTeamDetails();
        teamB.printTeamDetails();
    }
}
