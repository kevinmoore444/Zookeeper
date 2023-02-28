public class Gorilla extends Mammal {
    
    public Gorilla(){
        super();
    }



    public void throwThings(){
        if (energyLevel < 5){
            System.out.println("Gorilla is too tired to throw!");
            }
        else{
            System.out.println("Gorilla threw his toy at me!");
            energyLevel = energyLevel - 5;
            super.displayEnergyLevel();
        }
    }

    public void eatBananas(){
        if (energyLevel > 90){
            System.out.println("Gorilla is full, he refuses to eat more!");
            }
        else{
            System.out.println("I fed Gorilla a banana. He was really hungry");
            energyLevel = energyLevel + 10;
            super.displayEnergyLevel();
        }
    }

    public void climb(){
        if (energyLevel < 10){
            System.out.println("Gorilla is too tired to climb!");
            }
        else{
            System.out.println("Gorilla climbed to his tree house:");
            energyLevel = energyLevel - 10;
            super.displayEnergyLevel();
        }
    }
}
