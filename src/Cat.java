/**
 * Created by David Hedman <br>
 * Date: 2020-09-28 <br>
 * Time: 19:11 <br>
 * Project: HealthyPets <br>
 * Copyright: Nackademin <br> <br>
 *     Cat, subclass of Animal.
 */
public class Cat extends Animal{

    public Cat(String name, int weight){
        super(name,weight);
    }

    /**
     * Returns how much food a cat needs.
     * Cat weight(in grams) / 150.
     * @return int 1 food portion in grams.
     */
    @Override
    public double foodFormula() {
        return this.getWeight() / 150;
    }

    /**
     * Returns string formatted string with feeding information.
     * @return String formatted.
     */
    @Override
    public String feedInfo() {
        return String.format("%s:\nTyp Kattfoder.\nMängd: %.0fg.",
                this.getName(), foodFormula());
    }
}
