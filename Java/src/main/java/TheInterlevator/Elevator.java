// http://www.codewars.com/kata/546b3e38bbf1a51757000629/train/java

package TheInterlevator;

class Elevator {
    private final int totalNumberOfPeopleCapacity;
    private final int maxWeightKg;

    int liftees  = 0;
    int kiloGram = 0;
    private String lastEntryPhrase = "";

    public Elevator(int maxWeightKg, int totalNumberOfPeopleCapacity) {
        this.maxWeightKg = maxWeightKg;
        this.totalNumberOfPeopleCapacity = totalNumberOfPeopleCapacity;
    }

    public String enter(Person p){
        if (kiloGram + p.weigth > maxWeightKg){
            return lastEntryPhrase;
        }

        kiloGram+=p.weigth;
        liftees++;
        lastEntryPhrase = p.phrase;

        return "Welcome to the intelevator";
    }
    public String empty(){
        if (liftees== 0){
            return "I am allready empty";
        }

        liftees = 0;
        kiloGram = 0;

        return "Hope you had a nice trip with the intelevator";
    }
}