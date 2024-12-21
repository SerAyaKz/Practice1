import java.sql.SQLOutput;
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

        Calculator calculator = new Calculator();
        calculator.setNum1(8);
        calculator.setNum2(0);
        System.out.println(calculator.add());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());
//        double[] grades = {90.5,93.5,100};
//        Student student1 = new Student("Aruzhan", 19, grades);
//        Student student2 = new Student("Adil", 19, new double[]{70.5, 53.5, 100});
//        Student student3 = new Student("Danik", 19, new double[]{90.5, 63.5, 100});
//        Student student4 = new Student("Ali", 19, new double[]{60.5, 93.5, 100});
//        Student student5 = new Student("Alish", 19, new double[]{22, 93.5, 55});

//        System.out.println(student1.toString());
//        System.out.println(student1.calculateAverageGrades());
//        System.out.println(student1.hasPassed());
//        Student[] list1 = {student1,student2, student3, student4, student5};
//
//
//        for(Student s: list1) {
//            System.out.println(s.hasPassed());
//        }

//        int myInt = 9;
//        double myDouble = myInt; // Automatic casting: int to double
//
//        System.out.println(myInt);// Outputs 9
//        System.out.println((double) myInt);
//        System.out.println(myDouble);   // Outputs 9.0
//
//        int a = 9;
//        --a;
//        int b = 4;
//        System.out.println(a);// Outputs 8
//        ++a;
//        System.out.println(a);// Outputs 9
//        System.out.println(a%b); // remainder
//
//        String text ="Hello class";
//        System.out.println(text.length()+ " "+ text.charAt(0)+ " "+ text.charAt(text.length()-1)
//                + " "+ text.toUpperCase()+ " "+ text.toLowerCase());
//
//        String text2 = "Hello";
//        System.out.println(text+text2+" "+text.concat(text2));
//        String x = "10";
//        String y = "20";
//
//        String z = x + y;
//        System.out.println(z+" ");
//
//        System.out.println(Math.max(5, 10)+" "+Math.min(5, 10)+" "+Math.sqrt(100)+" "+Math.pow(100, 2)+" "+  Math.PI);
//
//        System.out.println(10 == 10 || 10>15); //false
//        int time = 22;
//        if (time > a) {
//            System.out.println("Good morning.");
//        } else{
//            System.out.println("Good day.");
//        }
//
//        int day = 4;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }
////        int i = 0;
////        while (i < 5) {
////            System.out.println(i);
////            i++;
////        }
//        for (int i = 0; i < 10; i++) {
//            if (i == 4) {
//                break;//continue
//            }
//            System.out.println(i);
//        }
////        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        System.out.println(num1);
//        int num2 = scanner.nextInt();
//        System.out.println(num2);
    }
}