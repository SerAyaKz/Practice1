public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculator() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }
    public int subtract() {
        return num1 - num2;
    }
    public int multiply() {
        return num1 * num2;
    }
    //it just divides
    public double divide() {
        if (num2 == 0) {
            System.out.println("Cant divide by zero");
//            throw new ArithmeticException("Can't divide by zero!!!");
        }
        return (double) num1 / num2;
    }
}
