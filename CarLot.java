import java.util.ArrayList;

public class CarLot {
    // Via 11.11 The ArrayList Class in text book.
    ArrayList<Car> inventory = new ArrayList<>();
    // no need to use concrete type thanks to type interface
    
	 public Car findCarByIdentifier(String identifier) {
		for (Car car : inventory) {
		    if (car.getId().equals(identifier)) {  // accessor aka getter from part I
			return car;
		    }
		}
		return null;
	    }
	
	public ArrayList<Car> getCarsInOrderOfEntry() {
        return new ArrayList<>(this.inventory);
	}
    }

