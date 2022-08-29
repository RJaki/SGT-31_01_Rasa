package homeWork.MaximumDistance;

public class Vehicle {
    //Fields
    private float fuel;
    private float fuelUsage;
    private int passengers;

    //Custom constructor
    public Vehicle (float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public Vehicle(){}


    //Method
    public void maxDistance (){
    //(float fuel, float fuelUsage, int passengers, float maxDistance){
        float maxDistance;
        float fuelUsageIndex;
        if (passengers >0){
            fuelUsageIndex = (5f* passengers/100f + 1f)*fuelUsage;
            maxDistance = (fuel/fuelUsageIndex)* 100f;
            System.out.printf("maxDistance ( %.1f, %.1f, %d) -> %.2f",fuel,fuelUsage,passengers,maxDistance);
        }else{
            maxDistance = fuel/fuelUsage* 100f;
            System.out.printf("maxDistance ( %.1f, %.1f, %d) -> %.2f",fuel,fuelUsage,passengers,maxDistance);

        }

    }
    /*public void printVehicleInfo (float fuel,float fuelUsage, int passengers, float maxDistance) {
        //super(fuel,fuelUsage,passengers,maxDistance);
        System.out.printf("maxDistance ( %.2f, %.2f, %d) -> %.2f",fuel,fuelUsage,passengers,maxDistance);
    }*/

}

