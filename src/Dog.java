/**
 * Created by David Hedman <br>
 * Date: 2020-09-28 <br>
 * Time: 18:46 <br>
 * Project: HealthyPets <br>
 * Copyright: Nackademin <br> <br>
 *     Dog, subclass of Animal.
 */
public class Dog extends Animal  {

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

    /**
     * Returns string formatted string with feeding information.
     * @return String formatted.
     */
    @Override
    public String feedInfo() {
        return String.format("%s:\nTyp: Hundfoder.\nMängd: %.0fg.",
                this.getName(), foodFormula());
    }


}
