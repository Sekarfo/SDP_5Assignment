public class HealAction extends GameAction {
    @Override
    protected void prepare() {
        System.out.println("Preparing to heal...");
    }

    @Override
    protected void action() {
        System.out.println("Healing...");
    }

    @Override
    protected void conclude() {
        System.out.println("Heal completed.");
    }
}