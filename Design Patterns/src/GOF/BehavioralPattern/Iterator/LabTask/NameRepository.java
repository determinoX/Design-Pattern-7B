/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.BehavioralPattern.Iterator.LabTask;

/**
 *
 * @author shafq
 */


// Implementation of the Container interface
public class NameRepository implements Container {
    // Array of names
    public String names[] = {"Robert", "John", "Julie", "Lora"};

    // Implementation of the getIterator method from the Container interface
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    // Inner class implementing the Iterator interface
    private class NameIterator implements Iterator {
        int index;

        // Implementation of the hasNext method from the Iterator interface
        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        // Implementation of the next method from the Iterator interface
        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }

        // Implementation of the previous method
        public Object previous() {
            if (index > 0) {
                return names[--index];
            }
            return null;
        }

        // Implementation of the moveToLast method
        public Object moveToLast() {
            index = names.length - 1;
            return names[index];
        }

        // Implementation of the moveToFirst method
        public Object moveToFirst() {
            index = 0;
            return names[index];
        }
    }
}
