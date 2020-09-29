/**
 * Created by David Hedman <br>
 * Date: 2020-09-28 <br>
 * Time: 18:46 <br>
 * Project: HealthyPets <br>
 * Copyright: Nackademin <br>
 */
public class Dog extends Animal implements IFoodInfo {
    String type = "Dog";

    public Dog(String name, double weight){
        super(name, weight);
    }


    /**
     * Returns how much food a dog needs.
     * Dog weight(in grams) / 100.
     * @return int 1 food portion in grams.
     */
    @Override
    public double foodFormula() {
        return this.getWeight() / 100;
    }

    //TODO FIXA
    @Override
    public String feedInfo() {
        return this.getName() + ":\n" +
                "Typ: Hundfoder. \tMängd: " + foodFormula() + "g.\n";
    }


}
