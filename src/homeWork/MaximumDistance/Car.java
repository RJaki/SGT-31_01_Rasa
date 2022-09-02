package homeWork.MaximumDistance;

public class Car extends Vehicle{
    public boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner){
        super(fuel, fuelUsage, passengers);//re-using customer constructor
        this.airConditioner = airConditioner;
    }

    public float maxDistance(){
        float airConditionerAdd;
        if (airConditioner){
            airConditionerAdd=1.1f;
        }else {
            airConditionerAdd = 1f;
        }
        float usage = fuelUsage * (1+ passengers * 0.05f);
        float maxDistance = fuel /(usage * airConditionerAdd)*100;
        return maxDistance;
    }

    //Mine solution
    /*public void maxDistance (float fuel, float fuelUsage, int passengers, boolean airConditioner){
        float maxDistance;
        float fuelUsageIndex;

        if (passengers >0){
            if (airConditioner){
                fuelUsageIndex = ((0.05f* passengers+ 1f) * fuelUsage) * 1.1f;
                maxDistance = (fuel/fuelUsageIndex)* 100f;
                System.out.printf("maxDistance (%.1f, %.1f, %d, %b) -> %.2f",fuel,fuelUsage,passengers,true,maxDistance);
            }else{
                fuelUsageIndex = (0.05f* passengers+1f)*fuelUsage;
                maxDistance = (fuel/fuelUsageIndex)* 100f;
                System.out.printf("maxDistance (%.1f, %.1f, %d, %b) -> %.2f",fuel,fuelUsage,passengers,false, maxDistance);
            }

        }else{
            if (airConditioner){
                maxDistance = fuel/(fuelUsage *1.1f)* 100f;
                System.out.printf("maxDistance (%.1f, %.1f, %d, %b) -> %.2f",fuel,fuelUsage,passengers,true,maxDistance);
            }else{
                maxDistance = fuel/fuelUsage* 100f;
                System.out.printf("maxDistance (%.1f, %.1f, %d, %b) -> %.2f",fuel,fuelUsage,passengers,false, maxDistance);
            }
        }
    }*/


}
