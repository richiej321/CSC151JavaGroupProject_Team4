import java.util.Scanner;

public class CarLotTest extends CarLot {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        CarLot myLot = new CarLot();

        // add 5 cars
        myLot.addCar("01234567", 277200, 18, 3000.00, 4500.00);
        myLot.addCar("12345678", 50000, 30, 5000.00, 7500.00);
        myLot.addCar("23456789", 100000, 25, 10000.00, 12500.00);
        myLot.addCar("34567890", 150000, 21, 7000.00, 9000.00);
        myLot.addCar("45678901", 20000, 35, 12500.00, 18500.00);



        // print out all the cars in the lot in a tabular form

        System.out.print("Cars for Sale: ");

        System.out.println("--------------------");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "ID", "Mileage", "MPG", "Cost", "Asking Price");

        getAllCars().forEach(
                (car) -> System.out.printf("%-15s %-15s %-15s %-15s %-15s%n",
                        car.getId(), car.getMileage(), car.getMpg(),
                        car.getCost(), car.getAskingPrice()));



        // get the car with the highest MPG
        System.out.printf("\n");
        System.out.println("The car with the highest MPG is: " + (getCarWithBestMPG().getId()));

        // get the car with the highest mileage

        System.out.println("The car with the highest mileage is " + getCarWithHighestMileage().getId());

        // get the average MPG

        System.out.println("The average MPG of all the cars is " + getAverageMpg());


        System.out.println("Please enter an Identifier for the car: ");
        String identifier = input.nextLine();
        System.out.println("Please enter the price the car sold for: ");
        double salePrice = input.nextDouble();

        try {
            myLot.sellCar(identifier, salePrice);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("The total profits from the cars sold are " + myLot.getTotalProfit());
    }
}
