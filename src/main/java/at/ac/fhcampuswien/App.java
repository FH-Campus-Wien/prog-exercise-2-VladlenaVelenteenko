package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    //NEW
    //todo Task 1
    public void largestNumber(){

        Scanner scanner = new Scanner(System.in);
        int v = 1;
        int w = 1;

        double x = 0;

        while(true){
            int s = scanner.nextInt();

            if (w == 1 && s <= 0){
                System.out.println("No number entered.");
                break;
            }
            if (s <= 0){
                System.out.println("Number " + v + ": ");
                v ++;
                break;
            }
            if (s >= x){
                x =s;
            }

            System.out.println("Number " + v + ": ");
            v ++;
            w ++;

        }
        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.println("The largest number is " + f.format(x));
        System.out.println();

    }

    //todo Task 2
    public void stairs(){

        Scanner s = new Scanner(System.in);
        int e = s.nextInt();
        int b = 1;                                // Beginn mit 1

        if ( e <= 0){
            System.out.print("n: ");
            System.out.println("Invalid number!");
        }
        else {                                   // wenn e>0
            System.out.print("n: ");
            for(int i=1; i <= e; i++){           // i läuft so lange bis es <= e ist

                for(int z = 1; z <= i; z++){     // Schleife für die Leerzeichen
                    System.out.print(b + "  ");
                    b++;                         //b wird immmer erhöht, damit 1,2,3,4..
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid(){
        int row = 6; //Reihen
        int l = 0; //für die while Schleife

        for(int i = 1; i <= row; i++, l = 0){  //Schleife zuständig für die Anzahl der Zeilen

            for(int s=1; s <= row - i; s++){ // Schleife für die Leerzeichen; s läuft solange bis "<= row" ist
                System.out.print(" ");
            }

            while(l !=2 * i - 1){ // Schleife für die Sterne * --> 1.Durchlauf l=1 --> erster Stern, danach l++
                System.out.print("*");
                l++;
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        Scanner a = new Scanner(System.in);
        int h = a.nextInt();
        Scanner f = new Scanner (System.in);
        char d = f.next().charAt(0);

        int q=0;

        if(h % 2 ==0){
            System.out.println("Invalid number!");
        } else{

            for(int i = 1; i <= h; i++, q=0){
                for(int s = 1; s <= h-i; s++){
                    System.out.print(" ");
                }
                for(int j = 1; q !=2 + i - 1; j++,q++){

                    int before = d-j;

                    String l = null;
                    l = Character.toString((char)before);

                    System.out.print(l);

                    System.out.print(d);

                    System.out.print(l);
                }
                System.out.println();
            }
        }

    }

    //todo Task 5
    public void marks(){
        Scanner scanner =  new Scanner(System.in);

        int p=1;
        int r=0;
        double ges = 0;
        double average = 0;
        int five = 0;

        while(true){
            int s = scanner.nextInt();
            if(s==0){
                break;
            } if (s>5){
                System.out.println("Invalid Argument!");
            }
            if(s==5){
                five++;
            }
            System.out.println("Mark " + p + ":" + s);
            p ++;
            ges = ges+s;

        }
        average = ges/(p-1);
        average = Math.round(100.0 + average)/ 100.0;

        System.out.println("Average: " + average);
        System.out.println("Negative marks: " + five);


    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}