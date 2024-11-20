public class Calculation {
    int BroAge = 16;
    double BroHeight = 5.6;
    double BMI = (BroAge + BroHeight) / 2;
    public static void main(String[] args) {
        Calculation myCalculation = new Calculation();
        System.out.println("Bro's age is " + myCalculation.BroAge);
        System.out.println("Bro's height is " + myCalculation.BroHeight);
        System.out.println("Bro's BMI is " + myCalculation.BMI);
    }
}