public class FourthAssignment {

    
public static void main(String[] args) {

    String[][] carModel = {
                            {"Toyota", "Supra","Nissan"}, 
                            {"Saga", "Vios", "Axia"}, 
                            {"GTR", "Aruz", "Myvi"}
    };

    double[][] carPrice = {
        {10000, 80000, 100000},
        {15000, 25000, 35000},
        {200000, 30000, 50000}
    };

    for (int row=0; row<carPrice.length; row++) {
        for (int col=0; col<carPrice[row].length; col++) {
    if(carPrice[row][col]<50000){
        //System.out.println("");
    } else {
        System.out.println(carModel[row][col] + " RM " + carPrice[row][col]);
    }
        }
    
}
}
}
