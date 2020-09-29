/**
 * Created by David Hedman <br>
 * Date: 2020-09-28 <br>
 * Time: 19:44 <br>
 * Project: HealthyPets <br>
 * Copyright: Nackademin <br>
 */
public class Snake extends Animal implements IFoodInfo {

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

    @Override
    public String feedInfo() {
        return String.format("1 Portion till %s består av %.0fg ormpellets.",
                this.getName(), this.foodFormula());
    }
}
