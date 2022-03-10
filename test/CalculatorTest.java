public class CalculatorTest {
    public void sum_calculateCorrectSum(){
        int expected = 15;
        int actual = Calculator.sum(1,2,3,4,5);
        if(actual == expected) System.out.println("SUCCESS");
        else System.out.println("FAILURE");

    }

    public void sum_calculateStringCorrectSum(){
        int expected = 15;
        int actual = Calculator.sum("1","2","3","4","5");
        if(actual == expected) System.out.println("SUCCESS");
        else System.out.println("FAILURE");

    }
}
