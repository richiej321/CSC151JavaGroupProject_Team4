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


public Car() {}
public Car(String id, int mileage, int mpg, double cost, double askingPrice) {
this.id=id;
this.mileage=mileage;
this.mpg=mpg;
this.cost=cost;
this.askingPrice=askingPrice;
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
public boolean isSold() {
return this.isSold;
}

public void setId(String id) {
this.id=id;
}
public void setMileage(int mileage) {
this.mileage=mileage;
}
public void setMpg(int mpg) {
this.mpg=mpg;
}
public void setCost(double cost) {
this.cost=cost;
}
public void setAskingPrice(double askingPrice) {
this.askingPrice=askingPrice;
}
public void setSalePrice(double salePrice) {
this.salePrice=salePrice;
}
public void setIsSold(boolean isSold) {
this.isSold=isSold;
}
}
