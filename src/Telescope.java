public class Telescope implements Equipment {
    private final String name;

    public Telescope(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitTelescope(this);
    }
}
