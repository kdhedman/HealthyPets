/**
 * Created by David Hedman <br>
 * Date: 2020-09-28 <br>
 * Time: 19:44 <br>
 * Project: HealthyPets <br>
 * Copyright: Nackademin <br> <br>
 *     Snake, subclass of Animal.
 */
public class Snake extends Animal{

    public Snake(String name, int weight){
        super(name, weight);
    }


    /**
     * Returns how much food a Snake needs.
     * Snake always eats 20g pellets.
     * @return int 1 food portion in grams.
     */
    @Override
    public double foodFormula() {
        return 20;
    }

    /**
     * Returns string formatted string with feeding information.
     * @return String formatted.
     */
    @Override
    public String feedInfo() {
        return String.format("%s:\nTyp: Ormpellets.\nMängd: %.0fg.",
                this.getName(), foodFormula());
    }
}
