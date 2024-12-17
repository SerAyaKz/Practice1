public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        System.out.println("Change detected:" +name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public int incrementAge(){
        this.age = this.age+1;
        return age;
    }
}
