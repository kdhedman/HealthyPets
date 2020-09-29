import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by David Hedman <br>
 * Date: 2020-09-28 <br>
 * Time: 18:45 <br>
 * Project: HealthyPets <br>
 * Copyright: Nackademin <br>
 */
public class HealthyPets {

    public enum Animals {SIXTEN("Sixten"), DOGGE("Dogge"), VENUS("Venus"), OVE("Ove"), HYPNO("Hypno");
        public final String animalName;
        Animals (String name){
            animalName = name;
        }
    }


    public static void main(String[] args) {
        //Dog sixten = new Dog("Sixten", 5000);
//        Dog dogge = new Dog("Dogge", 10000);
//        Cat venus = new Cat("Venus", 5000);
//        Cat ove = new Cat("Ove", 3000);
//        Snake hypno = new Snake("Hypno", 1000);

        //en polymorfisk lista med djuren.
        List<Animal> animalList = new LinkedList<>();
        animalList.add(new Dog("Sixten", 5000));
        animalList.add(new Dog("Dogge", 10000));
        animalList.add(new Cat("Venus", 5000));
        animalList.add(new Cat("Ove", 3000));
        animalList.add(new Snake("Hypno", 1000));

        //mainloop
        while(true){

            int choice = -1;
            try{
                String s = JOptionPane.showInputDialog("Vilket djur vill du mata?");
                if(s == null)
                    break;
                //Sätter choice till indexvärdet av passande enum-objekt.
                choice = Animals.valueOf(s.toUpperCase()).ordinal();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,
                        "Error: " + e +
                        "\nFörsök igen!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                continue;
            }

            infoDialog(animalList.get(choice).feedInfo());

            choice = JOptionPane.showConfirmDialog(null,"Mata ett djur till?", "HealthyPets", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(choice == 0){
                continue;
            }
            break;
        }
    }

    public static void infoDialog(String message){
        JOptionPane.showMessageDialog(null, message, "HealthyPets", JOptionPane.INFORMATION_MESSAGE);
    }

}
