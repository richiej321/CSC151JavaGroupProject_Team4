public class CarLotTest {
  
  public static void main(String[] args){
  
    CarLot myLot = new CarLot(); 
    
    // add 5 cars
            myLot.addCar("01234567", 277200, 18, 3000.00, 4500.00);
            myLot.addCar("12345678", 50000, 30, 5000.00, 7500.00);
            myLot.addCar("23456789", 100000, 25, 10000.00, 12500.00);
            myLot.addCar("34567890", 150000, 21, 7000.00, 9000.00);
            myLot.addCar("45678901", 20000, 35, 12500.00, 18500.00);



        // print out all the cars in the lot in a tabular form
    
        System.out.println("Cars for Sale: ");
        System.out.print("--------------------");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s ", "ID", "Mileage", "MPG", "Cost", "Asking Price");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s ", "01234567", 277200, 18, 3000.00, 4500.00);
        System.out.printf("%-15s %-15s %-15s %-15s %-15s ", "12345678", 50000, 30, 5000.00, 7500.00);
        System.out.printf("%-15s %-15s %-15s %-15s %-15s ", "23456789", 100000, 25, 10000.00, 12500.00);
        System.out.printf("%-15s %-15s %-15s %-15s %-15s ", "34567890", 150000, 21, 7000.00, 9000.00);
        System.out.printf("%-15s %-15s %-15s %-15s %-15s ", "45678901", 20000, 35, 12500.00, 18500.00);

       

        // get the car with the highest MPG

        System.out.println("The car with the highest MPG is " + myLot.getCarWithBestMPG());

        // get the car with the highest mileage

        System.out.print("The car with the highest mileage is " + myLot.getCarWithHighestMileage());

        // get the average MPG

        System.out.print("The average MPG of all the cars is " + myLot.getAverageMpg());

        // sell 2 of the cars and get the profit from cars sold
        // sell- asks for String id and askingPrice
        myLot.sellCar("45678901", 18500.00);
        myLot.sellCar("01234567", 4500.00);

       System.out.print("The total profits from the cars sold are " + myLot.getTotalProfit());
    }
}
