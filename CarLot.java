/**Part II: CarLot class
 *
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
	 
import java.util.ArrayList;
import java.util.*;  
import java.util.stream.*;
import java.util.Collections;

public class CarLot {
    
    // Via 11.11 The ArrayList Class in text book.
    private ArrayList<Car> inventory = new ArrayList<>();
    // no need to use concrete type thanks to type interface
    
    // accessor and mutator methods for inventory, aka getters and setters
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Car> inventory) {
        this.inventory = inventory;
    }

    // 
    public Car findCarByIdentifier(String identifier) {
        for (Car car : inventory) {
            if (car.getId().equals(identifier)) {  // this assumes getID was used in part 1
                return car;
            }
        }
        return null;
    }

    // this is making a shallow copy, which is what I'm assuming is being asked.
    public ArrayList<Car> getAllCars() {
        ArrayList<Car> inventory2 = new ArrayList<>(inventory); 
        return inventory2;
    }
    // if not, try:
    // public ArrayList<Car> getAllCars() {
        //return (ArrayList<Car>) inventory.clone();
    //}
    
    public Car getCarWithBestMPG() {
    //  sort the array:https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
    	ArrayList<Car> mpg = new ArrayList<>(inventory);
	Collections.sort(mpg);
    // first check if array is empty
	if (mpg.isEmpty()) {
	    return null;
    // then return best mpg
	} else {
	    return mpg.get(mpg.size() - 1);
        }
	
    }
}
