public class InventoryVisitor implements EquipmentVisitor {
    private int telescopeCount;
    private int projectorCount;

    @Override
    public void visitTelescope(Telescope telescope) {
        telescopeCount++;
    }

    @Override
    public void visitStarProjector(StarProjector projector) {
        projectorCount++;
    }

    public int getTelescopeCount() {
        return telescopeCount;
    }

    public int getProjectorCount() {
        return projectorCount;
    }
}
