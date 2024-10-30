public class DefendAction extends GameAction {
    @Override
    protected void prepare() {
        System.out.println("Preparing defense...");
    }

    @Override
    protected void action() {
        System.out.println("Defending!");
    }

    @Override
    protected void conclude() {
        System.out.println("Defense concluded.");
    }
}