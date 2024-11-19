import java.util.Scanner;

public class ThirdAssignment {
    private String carModel;
    private double price;
    
     public ThirdAssignment(String carModel, double price) {
        this.carModel = carModel;
        this.price = price;
     }
        
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your car model");
        String carModel = scanner.nextLine();
        System.out.println("Enter the price of the car");
        double price = scanner.nextDouble();
    
        System.out.println("The car is " + carModel);
        System.out.println("The price of the car is " + price);

        ThirdAssignment carPrice = new ThirdAssignment(carModel, price);

        switch(carModel){
            case "Ferrari":
            if(price > 100000 || price==100000){
                System.out.println("You are VIP");
            } else {
                System.out.println("You are not VIP");
            } default:
            if(price > 100000 || price==100000){
                System.out.println("You are VIP");
            } else {
                System.out.println("You are not VIP");
        }
       
    }
}

}

    
       

