
import java.util.ArrayList;


/** Part II: CarLot class

         * Define a new class, CarLot that meets the following specification:
        * Attribute:
        * •	inventory – represents all the cars in the CarLot. It should be of type ArrayList<Car>.
        *
        * Accessor and Mutator for the inventory attribute
        *
        * Additional methods:
        * •	Car findCarByIdentifier(String identifier) -  Find the car with the specified identifer in the inventory.
        *      	Return null if the Car is not found (input is a String, output is a Car type object or null)
        * •	ArrayList<Car> getAllCars() - Return an ArrayList of all Cars in the inventory. This method should return a
        * 		copy of the inventory, not the inventory itself. (No input, output is an ArrayList of Car objects)
        * •	Car getCarWithBestMPG() - Return the Car in the inventory with the highest MPG. (No input, output is a Car type object or null if the inventory is empty.)
        * •	Car getCarWithHighestMileage() - Return the Car in the inventory with the highest mileage. (No input, output is a Cartype object or null if
        the inventory is empty.)
        * •	double getAverageMpg() - Return the average MPG of all Cars in the inventory. (No input, output is a double value.)
        * •	double getTotalProfit() - Return the total profit of all cars in the inventory that have been sold (No input, output is a double value.)
        * •	void addCar(String id, int mileage, int mpg, double cost, double askingPrice) - Add a new Car with the specified id,
        * 		mileage, mpg, cost, and askingPrice to the inventory (Input: a String, two int, two double values. No output.)
        * •	void sellCar(String identifier, double salePrice ) throws IllegalArgumentException - Sell the Car identified by identifier for the salePrice.
        *      If the Car does not exist by the given identifier, throw an IllegalArgument Exception with an appropriate error
        *      message. (Input: a string and a double value. No output. Remember to mark the attribute isSold to be true if this method executes successfully.)
        */


public class CarLot extends Car {
    //private ArrayList<Car> inventory;
    // Via 11.11 The ArrayList Class in text book.

    private static ArrayList<Car> inventory = new ArrayList<>();
    // no need to use concrete type thanks to type interface

    // accessor and mutator methods for inventory, aka getters and setters
    public ArrayList<Car> getInventory() {
        return this.inventory;
    }

    //public void setInventory(ArrayList<Car> inventory) {
        //this.inventory = inventory;
    //}

    //
    public static Car findCarByIdentifier(String identifier) {
        for (Car car : inventory) {
            if (car.getId().equals(identifier)) {  // this assumes getID was used in part 1
                return car;
            }
        }
        return null;
    }

    public void addCar(String id, int mileage, int mpg, double cost, double askingPrice) {
        inventory.add(new Car(id, mileage, mpg, cost, askingPrice));
    }
    //this is making a shallow copy, which is what I'm assuming is being asked.
    public static ArrayList<Car> getAllCars() {
        ArrayList<Car> newInventory = new ArrayList<Car>(inventory);
        return newInventory;
    }

    /**
     * public static String getAllCars() {
     *         ArrayList<Car> newInventory = new ArrayList<Car>(inventory);
     *         //return String.format("%-15s \n ", newInventory);
     *         return newInventory;
     *     }
     */

    //public ArrayList<Car> getAllCars() {
        //return (ArrayList<Car>) inventory.clone();
    //}

    public static Car getCarWithBestMPG() {
        int bestMpg = -1; // end of list of mpgs
        Car carWithBestMpg = new Car();
        if (inventory.size() != 0) {
            for (Car car : inventory) {
                if (car.getMpg() > bestMpg) {
                    bestMpg = car.getMpg();
                    carWithBestMpg = car;
                }
            }
            return carWithBestMpg;
        } else {
            return null;
        }
    }


    public static Car getCarWithHighestMileage() {
        int bestMileage = -1; // end of list of mileage
        Car carWithHighestMileage = new Car();
        if (inventory.size() != 0) {
            for (Car car : inventory) {
                if (car.getMileage() > bestMileage) {
                    bestMileage = car.getMileage();
                    carWithHighestMileage = car;
                }
            }
            return carWithHighestMileage;
        } else {
            return null;
        }
    }

    public static double getAverageMpg() {
        double averageMpg = 0; double totalMpg = 0;
        for (Car car : inventory) {
            totalMpg += car.getMpg();
        }
        averageMpg=totalMpg/(inventory.size());
        return averageMpg;
    }

    public double getTotalProfit() {
        double profit = 0;
        for(Car car : inventory) {
            profit += car.getSalePrice();
        }
        return profit;
    }


    public void sellCar(String identifier, double priceSold) throws IllegalArgumentException {

        Car sold = findCarByIdentifier(identifier);
        if(sold != null){
            sold.sellCar(priceSold);
        }
        else{
            throw new IllegalArgumentException("Couldn't find the car " + identifier);
        }
    }
}


