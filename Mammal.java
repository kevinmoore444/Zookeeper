public class Mammal {
    protected int energyLevel;
    
    public Mammal(){
        this.energyLevel = 100;
    }

    // Energy Getter
    public int getEnergyLevel(){
        return energyLevel;
    }

    // Energy Display
    public void displayEnergyLevel(){
        System.out.println("Energy Remaining: " + getEnergyLevel());
    }

}