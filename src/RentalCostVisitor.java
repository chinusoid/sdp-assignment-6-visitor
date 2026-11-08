public class RentalCostVisitor implements EquipmentVisitor {
    private static final int TELESCOPE_DAILY_RATE = 5000;
    private static final int PROJECTOR_DAILY_RATE = 3000;

    private final int days;
    private int total;

    public RentalCostVisitor(int days) {
        this.days = days;
    }

    @Override
    public void visitTelescope(Telescope telescope) {
        total += TELESCOPE_DAILY_RATE * days;
    }

    @Override
    public void visitStarProjector(StarProjector projector) {
        total += PROJECTOR_DAILY_RATE * days;
    }

    public int getTotal() {
        return total;
    }
}
