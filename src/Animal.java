/**
 * Created by David Hedman <br>
 * Date: 2020-09-28 <br>
 * Time: 16:15 <br>
 * Project: HealthyPets <br>
 * Copyright: Nackademin <br>
 */
public abstract class Animal implements IFoodInfo{
    private String name;
    private double weight;
    public Animal(String name, double weight){
        setName(name);
        setWeight(weight);
    }

    public void setName(String name){
        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("Nytt namn tomt.");
        this.name = name;
    }

    public void setWeight(double weight){
        if(weight <= 0)
            throw new IllegalArgumentException("Vikt 0 eller mindre.");
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public double getWeight(){
        return this.weight;
    }

}
