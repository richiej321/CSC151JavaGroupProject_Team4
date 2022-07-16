/* Part I: Car class
Define a new class, Car that meets the following specification:
Attributes:
•	id -  uniquely identifies each car.  An example ID might be "1985 Ferrari 308GT", but any string is a valid identifier
•	mileage -  represents the number of miles the car has been driven. You can assume this value does not change 
•	mpg -  represents the car's fuel efficiency in miles per gallon
•	cost -  represents the amount the Car Lot paid for the car when it was acquired
•	askingPrice -  represents the amount that the Car Lot is asking from potential buyer
•	salePrice -  represents the amount that the Car actually sold for
•	isSold -  represents whether is sold or not. It’s a Boolean value.
Constructors:
•	A default Constructor.
•	A Constructor that is used to add a new Car to the CarLot's inventory. The constructor should take the following arguments: 
  -String id
  -int mileage
  -int mpg
  -double cost
  -double askingPrice
Accessors and Mutators for all attributes
*/

public class Car {
    private String id;
    private int mileage;
    private int mpg;
    private double cost;
    private double askingPrice;
    private double salePrice;
    private boolean isSold;
    private double profit = 0.0;


    public Car() {
    }


    public Car(String id, int mileage, int mpg, double cost, double askingPrice) {
        super();
        this.id = id;
        this.mileage = mileage;
        this.mpg = mpg;
        this.cost = cost;
        this.askingPrice = askingPrice;
        this.salePrice = 0;
        this.isSold = false;
    }

    public String getId() {
        return this.id;
    }

    public int getMileage() {
        return this.mileage;
    }

    public int getMpg() {
        return this.mpg;
    }

    public double getCost() {
        return this.cost;
    }

    public double getAskingPrice() {
        return this.askingPrice;
    }

    public double getSalePrice() {
        return this.salePrice;
    }

    public double getProfit(){
        return this.profit;
    }
    public void sellCar(double salePrice){
        this.salePrice = 0;
        this.isSold = true;
        this.profit = this.salePrice - this.cost;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" "+this.id);
        sb.append(" "+this.mileage);
        sb.append(" "+this.mpg);
        sb.append(" "+this.cost);
        sb.append(" "+this.askingPrice);

        return sb.toString();
    }
}

/**
public class Car {
    private String id;
    private int mileage;
    private int mpg;
    private double cost;
    private double askingPrice;
    private double salePrice;
    private boolean isSold;

    public Car() {
        this.id = "";
        this.mileage = 0;
        this.mpg = 0;
        this.cost = 0.0;
        this.askingPrice = 0.0;
        this.salePrice = 0.0;
        this.isSold = false;
    }

    public Car(String id, int mileage, int mpg, double cost, double askingPrice) {
        super();
        this.id = id;
        this.mileage = mileage;
        this.mpg = mpg;
        this.cost = cost;
        this.askingPrice = askingPrice;
        this.salePrice = 0;
        this.isSold = false;
    }

    public String getId() {
        return id;
    }

    public int getMileage() {
        return mileage;
    }

    public int getMpg() {
        return mpg;
    }

    public double getCost() {
        return cost;
    }

    public double getAskingPrice() {
        return askingPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void getSold(boolean sold) {
        isSold = sold;
    }
**/


