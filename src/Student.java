import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private double[] grades;

    public Student(String name, int age, double[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    private double calculateAverageGrades() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        System.out.println(sum);
        return sum / grades.length;
    }

    public boolean hasPassed(){
        return calculateAverageGrades() >= 70;
    }
}
