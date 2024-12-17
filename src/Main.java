import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //class
        //constructor default and parameterized
        //getter setter
        //custom method void and with return overloading
        //access modifiers
        //condition loop array

//        int number = 18;
//        String name = "Abilmansur";
//
//        Person person = new Person("Rauan", 19);
//        person.setName(name);
//        System.out.println(person.getName());
//        System.out.println(name + " "+ number);
//        System.out.println(person.incrementAge()); //20
//        person.displayInfo(); //Rauan 19

//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        System.out.println(num1);
//        int num2 = scanner.nextInt();
//        System.out.println(num2);

//        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(10,8));
//        System.out.println(calculator.subtract(10,8));
//        System.out.println(calculator.multiply(10,8));
//        System.out.println(calculator.divide(10,8));
        double[] grades = {90.5,93.5,100};
        Student student1 = new Student("Aruzhan", 19, grades);
        Student student2 = new Student("Adil", 19, new double[]{70.5, 53.5, 100});
        Student student3 = new Student("Danik", 19, new double[]{90.5, 63.5, 100});
        Student student4 = new Student("Ali", 19, new double[]{60.5, 93.5, 100});
        Student student5 = new Student("Alish", 19, new double[]{22, 93.5, 55});

//        System.out.println(student1.toString());
//        System.out.println(student1.calculateAverageGrades());
//        System.out.println(student1.hasPassed());
        Student[] list1 = {student1,student2, student3, student4, student5};


        for(Student s: list1) {
            System.out.println(s.hasPassed());
        }
    }
}