/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommunicationSystem;

/**
 *
 * @author shafq
 */
import java.util.List;

public class StakeholderIterator {
    private List<Stakeholder> stakeholders;
    private int position;

    public StakeholderIterator(List<Stakeholder> stakeholders) {
        this.stakeholders = stakeholders;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < stakeholders.size();
    }

    public Stakeholder next() {
        if (this.hasNext()) {
            Stakeholder stakeholder = stakeholders.get(position);
            position++;
            return stakeholder;
        }
        return null;
    }
}
