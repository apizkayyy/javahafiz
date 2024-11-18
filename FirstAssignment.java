public class FirstAssignment {
    private String car;
    private String brand;
    private int make;
    private double price;

public FirstAssignment(String car, String brand, int make, double price){
    this.car = car;
    this.brand = brand;
    this.make = make;
    this.price = price;
}

public void displayDetails(){
    System.out.println("Car :"+ car);
    System.out.println("Brand Model :"+ brand);
    System.out.println("Manufacturing year :"+ make);
    System.out.println("The price of the car :"+ price);
}

public static void main(String[] args) {
    FirstAssignment Kereta = new FirstAssignment("Aruz","Produa",2020,50000);
    Kereta.displayDetails();
}
}