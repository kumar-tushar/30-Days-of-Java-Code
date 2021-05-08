package Solutions.Day_12;

import java.util.Scanner;

class Student extends Person{
    private int[] testScores;

    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);
        testScores = scores;
    }

    public char calculate() {

        int count = 0;

        for (int testScore : testScores) {
            count = count + testScore;
        }

        float avg = count / (testScores.length);
        char point;

        if (avg >= 90 && avg <= 100) {
            point = 'O';
        }
        else if (avg >= 80) {
            point = 'E';
        } else if (avg >= 70) {
            point = 'A';
        } else if (avg >= 55) {
            point = 'P';
        } else if (avg >= 40) {
            point = 'D';
        } else{
            point = 'T';
        }
        return point;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }

}
