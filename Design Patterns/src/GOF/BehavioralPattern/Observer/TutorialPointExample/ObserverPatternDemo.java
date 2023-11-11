/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Observer.TutorialPointExample;

/**
 *
 * @author shafq
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create a subject
        Subject subject = new Subject();

        // Create observers and attach them to the subject
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

        // Change the state of the subject and observe the updates
        System.out.println("First state change: 15");
        subject.setState(15);

        // Detach one observer (e.g., HexaObserver)
        subject.detach(hexaObserver);

        // Change the state again
        System.out.println("Second state change: 10");
        subject.setState(10);

        // Attach a new observer (e.g., a new HexaObserver)
        HexaObserver newHexaObserver = new HexaObserver(subject);

        // Change the state once more
        System.out.println("Third state change: 20");
        subject.setState(20);
    }
}
