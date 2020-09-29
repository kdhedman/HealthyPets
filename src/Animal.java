/**
 * Created by David Hedman <br>
 * Date: 2020-09-28 <br>
 * Time: 16:15 <br>
 * Project: HealthyPets <br>
 * Copyright: Nackademin <br> <br>
 *     Animal superClass, name and weight of animal, also included interface for feeding information.
 */
public abstract class Animal implements IFoodInfo{
    private String name;
    private double weight;

    /**
     * Only constructor.
     * @param name String
     * @param weight double
     */
    public Animal(String name, double weight){
        setName(name);
        setWeight(weight);
    }

    /**
     * Sets name, error if empty or null.
     * @param name String
     */
    public void setName(String name){
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("Nytt namn tomt.");
        this.name = name;
    }

    /**
     * Sets weight, error if 0 or less.
     * @param weight double.
     */
    public void setWeight(double weight){
        if(weight <= 0)
            throw new IllegalArgumentException("Vikt 0 eller mindre.");
        this.weight = weight;
    }

    /**
     * Returns name as String
     * @return String name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Returns weight as double.
     * @return double weight
     */
    public double getWeight(){
        return this.weight;
    }

}
