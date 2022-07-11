public class CarLotTest {
  
  public static void main(String[] args){
  
    CarLot myLot = new CarLot(); 
    
    // print out all the cars in the lot
    
    System.out.println("Cars for Sale: " + CarLot.getAllCars());
    
    // get the car with the highest MPG 
    
    System.out.println("The car with the highest MPG is " + CarLot.getCarWithBestMPG());
    
    // get the car with the highest mileage 
    
    System.out.print("The car with the highest mileage is " + CarLot.getCarWithHighestMileage()); 
    
    // get the average MPG 
    
    System.out.print("The average MPG of all the cars is " + CarLot.getAverageMPG()); 
    
    // sell 2 of the cars and get the profit from cars sold 
    
    System.out.print("The total profits from the cars sold are " + CarLot.getTotalProfit()); 
  }
}
