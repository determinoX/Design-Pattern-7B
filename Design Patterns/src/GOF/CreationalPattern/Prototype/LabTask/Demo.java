/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.CreationalPattern.Prototype.LabTask;

/**
 *
 * @author shafq
 */
import GOF.CreationalPattern.Prototype.LabTask.Circle;
import GOF.CreationalPattern.Prototype.LabTask.Rectangle;
import GOF.CreationalPattern.Prototype.LabTask.Shape;
import GOF.CreationalPattern.Prototype.LabTask.Human;
import GOF.CreationalPattern.Prototype.LabTask.Fish;



import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Avatar> avatars = new ArrayList<>();

        // Create a Fish Avatar
        Fish fish = new Fish();
        fish.name = "Nemo";
        fish.color = "Orange";
        fish.species = "Clownfish";
        avatars.add(fish);

        // Create a Human Avatar
        Human human = new Human();
        human.name = "Alice";
        human.gender = "Female";
        human.occupation = "Software Engineer";
        avatars.add(human);

        // Clone the Fish Avatar
        Fish clonedFish = (Fish) fish.clone();
        avatars.add(clonedFish);

        // Clone the Human Avatar
        Human clonedHuman = (Human) human.clone();
        avatars.add(clonedHuman);

        // Compare the original Fish Avatar to its clone
        if (fish.equals(clonedFish)) {
            System.out.println("Fish avatars are identical");
        } else {
            System.out.println("Fish avatars are different");
        }

        // Compare the original Human Avatar to its clone
        if (human.equals(clonedHuman)) {
            System.out.println("Human avatars are identical");
        } else {
            System.out.println("Human avatars are different");
        }
    }
}
