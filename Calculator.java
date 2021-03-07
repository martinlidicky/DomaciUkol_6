public class Calculator {

    enum Operation{
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        Operation operation = Operation.ADDITION;

	    int result = calculate(x, y, operation);
	    System.out.println("Result: "+result);

    }

    public static int calculate (int x, int y, Operation operation){

        int result = 0;
        if (operation == Operation.ADDITION) {
            result = x + y;
        } else if (operation == Operation.SUBTRACTION) {
            result = x - y;
        } else if (operation == Operation.MULTIPLICATION) {
            result = x * y;
        } else if (operation == Operation.DIVISION) {
            result = x / y;
        }
        return result;

    }

}
