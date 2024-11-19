import java.util.Scanner;

public class SecondAssignment {
    private String car;
    private String brand;
    private int make;
    private double price;

public SecondAssignment(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your car");
    this.car = scanner.nextLine();
    System.out.println("Enter your brand car");
    this.brand = scanner.nextLine();
    System.out.println("Enter manufacturing year ");
    this.make = scanner.nextInt();
    System.out.println("Enter price ");
    this.price = scanner.nextDouble();
}

public void displayDetails(){
    System.out.println("******************************");
    System.out.println("Car :"+ car);
    System.out.println("Brand Model : "+ brand);
    System.out.println("Manufacturing year : "+ make);
    System.out.println("The price of the car : "+ price);
}

public static void main(String[] args) {
    SecondAssignment car = new SecondAssignment();
    SecondAssignment car2 = new SecondAssignment();
    SecondAssignment car3 = new SecondAssignment();
    car.displayDetails();
    car2.displayDetails();
    car3.displayDetails();

    System.out.println("Average price is "  +  (car.price + car2.price + car3.price) / 3);

    }
}
