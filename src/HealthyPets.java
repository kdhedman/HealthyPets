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
        //en polymorfisk lista med djur.
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
                String s = inputDialog("Vilket djur vill du mata?");
                if(s == null)
                    break;
                //Sätter choice till indexvärdet av passande enum-objekt.
                choice = Animals.valueOf(s.toUpperCase().trim()).ordinal();
            } catch (Exception e){
                errorDialog(e.getMessage());
                continue;
            }

            infoDialog(animalList.get(choice).feedInfo());

            choice = yesNoDialog("Mata ett djur till?");
            if(choice == 0){
                continue;
            }
            break;
        }
    }

    public static String inputDialog(String message){
        return JOptionPane.showInputDialog(null,
                message,
                "HealthyPets",
                JOptionPane.QUESTION_MESSAGE);
    }

    public static void errorDialog(String message){
        JOptionPane.showMessageDialog(null,
                "Error: " + message+
                        "\nFörsök igen!",
                "HealthyPets",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void infoDialog(String message){
        JOptionPane.showMessageDialog(null,
                message,
                "HealthyPets",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static int yesNoDialog(String message){
        return JOptionPane.showConfirmDialog(null,
                message,
                "HealthyPets",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
    }

}
