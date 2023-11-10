package refactoring_guru.prototype.example.shapes;

public class HumanAvatar extends Shape {
    public int width;
    public int height;

    public HumanAvatar() {
    }

    public HumanAvatar(HumanAvatar target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new HumanAvatar(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof HumanAvatar) || !super.equals(object2)) return false;
        HumanAvatar shape2 = (HumanAvatar) object2;
        return shape2.width == width && shape2.height == height;
    }
}