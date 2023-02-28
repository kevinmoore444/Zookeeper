public class GiantBat extends Mammal {
    
    public GiantBat(){
        this.energyLevel = 300;
    }

    public void fly(){
        if (energyLevel < 50){
            System.out.println("Bat is too tired to fly!");
            }
        else{
            System.out.println("Bat is ready for liftoff - he uses 50 energy");
            energyLevel = energyLevel - 50;
            super.displayEnergyLevel();
        }
    }

    public void eatHumans(){
        if (energyLevel > 275){
            System.out.println("Bat is full, he refuses to eat more humans!");
            }
        else{
            System.out.println("I fed Bat a tasty human. He was really hungry");
            energyLevel = energyLevel + 25;
            super.displayEnergyLevel();
        }
    }

    public void attackTown(){
        if (energyLevel < 100){
            System.out.println("Bat is too tired to attack town today, maybe tomorrow!");
            }
        else{
            System.out.println("Found a quaint little town for Bat to attack");
            energyLevel = energyLevel - 100;
            super.displayEnergyLevel();
        }
    }
}
