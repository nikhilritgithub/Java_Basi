import java.util.*;
public class Car{
    
    int noOFWheels;
    String color;
    float maxSpeed;          //instance variable
    float CurrentFuel;
    int noOfSeats;


    public void Drive(){
        if(CurrentFuel == 0){
            System.out.println("Fuel Empty....");
        }
        else if(CurrentFuel < 5){
            System.out.println("Car is in reserved mode, Please refil");
            CurrentFuel--;
        }
        else{
        System.out.println("Car is driving");
        CurrentFuel--;
        }
    }

    public void addFuel(float fuel){
        CurrentFuel += fuel;
    }

    public void addColor(String color){
         this.color= color;
    }

    public String getColor(){
        return this.color; 
    }

    public float getCurrentFuel(){
        return CurrentFuel;
    }

    public void wheels(int noOFWheelsheels){
        this.noOFWheels = noOFWheels;
    }
    public int getWheels(){
        return this.noOFWheels;
    }

    public static void main(String args[]){
        Car swift = new Car();  //reference of class
        Car nano = new Car();
        swift.addFuel(6);
    //    swift.Drive();
    //    swift.Drive();
    //    swift.Drive();
       nano.addFuel(5);
       nano.wheels(4);
       nano.Drive();
       nano.Drive();
       nano.addColor("red");
     // System.out.println(swift.getCurrentFuel());
      System.out.println(nano.getCurrentFuel());
      System.out.println( "Car color is "+nano.getColor());
      System.out.println("Car has"+nano.getWheels());

      
    
}
}