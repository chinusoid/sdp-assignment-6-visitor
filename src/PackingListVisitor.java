public class PackingListVisitor implements EquipmentVisitor {
    @Override
    public void visitTelescope(Telescope telescope) {
        System.out.println(telescope.getName() + ": tripod, eyepiece, lens cap");
    }

    @Override
    public void visitStarProjector(StarProjector projector) {
        System.out.println(projector.getName() + ": power cable, remote control");
    }
}
