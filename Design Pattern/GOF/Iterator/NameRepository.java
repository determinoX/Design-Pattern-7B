/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.Iterator;

/**
 *
 * @author FA20-BSE-042
 */
public class NameRepository implements Container {
    public Student students[] = {
        new Student(1, "Abbas", "Male", "0311-1211111"),
        new Student(2, "Nabil", "Male", "0311-1213131"),
        new Student(3, "Haleema", "Female", "0311-1213111"),
        new Student(4, "Zain", "Male", "0311-1111112"),
        new Student(5, "Asim", "Male", "0321-1111112"),
        new Student(6, "Hamza", "Male", "0321-2111112"),
        new Student(7, "Adan", "Male", "0321-1411112"),
        new Student(8, "Sami", "Female", "0321-1121112"),
        new Student(9, "Baboobs", "Female", "0321-1123112"),
    };

    @Override
    public Iterator getIterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < students.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return students[index++];
            }
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return index > 0;
        }

        @Override
        public Object previous() {
            if (this.hasPrevious()) {
                return students[--index];
            }
            return null;
        }

        @Override
        public void moveToLast() {
            index = students.length - 1;
        }

        @Override
        public void moveToFirst() {
            index = 0;
        }
    }
}
