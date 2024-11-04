import java.util.Scanner;

public class Main {
    static void Zadanie1(){
        System.out.print("Podaj liczbe:");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        sc.close();
        int numberInt = (int) number;
        System.out.println("Wynik to: " + numberInt);
    }
    static void Zadanie2(){
        System.out.print("Podaj liczbe:");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        sc.close();
        double numberDouble = Double.parseDouble(number);
        double number2 = numberDouble * numberDouble;
        System.out.println("Wynik to: " + number2);
    }
    static void Zadanie3(){
        double iloczyn = 12*5;
        double roznica = 12-5;
        double iloraz = 12/5;
        double reszta = 12%5;
        System.out.println("Iloczyn to "+ iloczyn);
        System.out.println("Roznica to "+ roznica);
        System.out.println("Iloraz to "+ iloraz);
        System.out.println("Reszta to "+ reszta);
    }
    static void Zadanie4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe:");
        double number = sc.nextDouble();
        System.out.print("Podaj druga liczbe:");
        double number2 =sc.nextDouble();
        sc.close();
        double wynik = number%number2;
        System.out.println("Wynik to: " + wynik);
    }
    public static void main(String[] args) {
        //Zadanie1();
        //Zadanie2();
        //Zadanie3();
        //Zadanie4();
    }
}