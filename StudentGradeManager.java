import java.util.Scanner;

class StudentGradeManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int number = input.nextInt();
        input.nextLine(); 

        String[] names = new String[number];
        int[] grades = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            names[i] = input.nextLine();

            System.out.println("Enter the grade for " + names[i] + ":");
            grades[i] = input.nextInt();
            input.nextLine(); 
        }
        int sum = 0;
        int max = grades[0];
        int min = grades[0];
        for (int i = 0; i < number; i++) {
            sum += grades[i];
            if (grades[i] > max) {
                max = grades[i];
            }
            if (grades[i] < min) {
                min = grades[i];
            }
        }

        double average = (double) sum / number;
        System.out.println("\n--- Student Grades ---");
        for (int i = 0; i < number; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }
        System.out.println("\n--- Grade Summary Report ---");
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Highest Grade: " + max);
        System.out.println("Lowest Grade: " + min);

        input.close();
    }
}
