/**
 * Created by David Hedman <br>
 * Date: 2020-09-28 <br>
 * Time: 18:45 <br>
 * Project: HealthyPets <br>
 * Copyright: Nackademin <br>
 */
public class HealthyPets {

    enum Animals {SIXTEN, DOGGE, VENUS, OVE, HYPNO}

    public static void main(String[] args) {

        Dog sixten = new Dog("Sixten", 5000);
        Dog dogge = new Dog("Dogge", 10000);
        Cat venus = new Cat("Venus", 5000);
        Cat ove = new Cat("Ove", 3000);
        Snake hypno = new Snake("Hypno", 1000);

        String s = "SIXTEN";
        System.out.println(Animals.valueOf("SIXTEN"));
        //mainloop
        while(true){
            break;
        }
    }

}
