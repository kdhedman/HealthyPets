/**
 * Created by David Hedman <br>
 * Date: 2020-09-28 <br>
 * Time: 19:11 <br>
 * Project: HealthyPets <br>
 * Copyright: Nackademin <br>
 */
public class Cat extends Animal implements IFoodInfo{

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

    @Override
    public String feedInfo() {
        return String.format("1 Portion till %s består av %.0fg kattfoder.",
                this.getName(), this.foodFormula());
    }
}
