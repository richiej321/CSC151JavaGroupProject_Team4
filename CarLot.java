public class CarLot {
    private ArrayList<Car> inventory = new ArrayList<>; 
    
public Car findCarByIdentifier(String identifier) {
    // for every car in the inventory
    for (Car car : inventory) {
        // if -call getter car.getID()- equals the identifier (ID)
        if (car.getId().equals(identifier)) {
        // return the car id called
	        return car;
        }
    }
    // otherwise return null
    return null;
}
