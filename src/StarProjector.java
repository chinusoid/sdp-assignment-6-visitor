public class StarProjector implements Equipment {
    private final String name;

    public StarProjector(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitStarProjector(this);
    }
}
