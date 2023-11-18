/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.CreationalPattern.Prototype.LabTask;

/**
 *
 * @author shafq
 */

public abstract class Avatar extends Shape {
    public String name;

    public Avatar() {
    }

    public Avatar(Avatar target) {
        super(target);
        if (target != null) {
            this.name = target.name;
        }
    }

    public abstract Avatar clone();
}

