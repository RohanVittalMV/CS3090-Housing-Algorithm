import java.util.Scanner;

public class HousingPointsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPoints = 0;

        System.out.println("Welcome to the Housing Points Calculator");
        System.out.println("Please answer the following questions to calculate your housing priority score.");

        // Income Assessment (0-30 points) 
 
        System.out.println("\nWhat is your annual family income in dollars?");
        int income = scanner.nextInt();
        if (income > 90000)
            totalPoints += 30;
        else if (income > 60000)
            totalPoints += 20;
        else if (income > 30000)
            totalPoints += 10;

        // Class Standing (0-25 points)
        System.out.println("\nWhat is your class standing?");
        System.out.println("1: Freshman");
        System.out.println("2: Sophomore");
        System.out.println("3: Junior");
        System.out.println("4: Senior");
        int classStanding = scanner.nextInt();
        switch (classStanding) {
            case 1:
                totalPoints += 25;
                break;
            case 2:
                totalPoints += 20;
                break;
            case 3:
                totalPoints += 15;
                break;
            case 4:
                totalPoints += 10;
                break;
        }

        // Age Assessment (0-15 points)
        System.out.println("\nWhat is your age?");
        int age = scanner.nextInt();
        if (age <= 18)
            totalPoints += 15;
        else if (age <= 20)
            totalPoints += 10;
        else if (age <= 22)
            totalPoints += 5;

        // Scholarship Status (0-20 points)
        System.out.println("\nDo you have any scholarships? (yes/no)");
        scanner.nextLine(); 
        String hasScholarship = scanner.nextLine().toLowerCase();
        if (hasScholarship.equals("yes"))
            totalPoints += 20;

        // Discipline Status (-20-0 points)
        System.out.println("\nAre you currently on disciplinary probation? (yes/no)");
        String onProbation = scanner.nextLine().toLowerCase();
        if (onProbation.equals("yes"))
            totalPoints -= 20;

        // Final Score (max possible: 90 points)
        System.out.println("\nYour housing priority score is: " + totalPoints + " out of 90 possible points");
        System.out.println("Higher scores indicate higher priority for on-campus housing.");

        scanner.close();
    }
}