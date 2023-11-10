package refactoring_guru.prototype.example.shapes;

public class Square extends Shape {
    public int width;
    public int height;

    public Square() {
    }

    public Square(Square target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Square) || !super.equals(object2)) return false;
        Square shape2 = (Square) object2;
        return shape2.width == width && shape2.height == height;
    }
}