package homeWork.MaximumDistance;

public class Vehicle {
    //Fields
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    //Custom constructor
    public Vehicle (float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    //2 options of possible
    public float maxDistance(float fuel, float fuelUsage, int passengers){
        return fuel /(fuelUsage * (1+ passengers * 0.05f))*100;
    }

    public float maxDistance(){
        return fuel /(fuelUsage * (1+ passengers * 0.05f))*100;
    }


    //Mine solution
/*    public void maxDistance (){
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
    }*/
}

