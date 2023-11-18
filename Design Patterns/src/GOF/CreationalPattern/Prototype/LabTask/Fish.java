/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.CreationalPattern.Prototype.LabTask;

/**
 *
 * @author shafq
 */


public class Fish extends Avatar {
    public String species;

    public Fish() {
    }

    public Fish(Fish target) {
        super(target);
        if (target != null) {
            this.species = target.species;
        }
    }

    @Override
    public Fish clone() {
        return new Fish(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Fish) || !super.equals(object2)) return false;
        Fish fish2 = (Fish) object2;
        return fish2.name.equals(name) && fish2.species.equals(species);
    }
}

