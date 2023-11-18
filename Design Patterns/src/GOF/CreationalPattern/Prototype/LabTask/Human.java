/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.CreationalPattern.Prototype.LabTask;

/**
 *
 * @author shafq
 */

public class Human extends Avatar {
    public String gender;
    public String occupation;

    public Human() {
    }

    public Human(Human target) {
        super(target);
        if (target != null) {
            this.gender = target.gender;
            this.occupation = target.occupation;
        }
    }

    @Override
    public Human clone() {
        return new Human(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Human) || !super.equals(object2)) return false;
        Human human2 = (Human) object2;
        return human2.name.equals(name) && human2.gender.equals(gender) && human2.occupation.equals(occupation);
    }
}

