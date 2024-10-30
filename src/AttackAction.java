public class AttackAction extends GameAction {
    @Override
    protected void prepare() {
        System.out.println("Preparing for attack...");
    }

    @Override
    protected void action() {
        System.out.println("Attacking the opponent!");
    }

    @Override
    protected void conclude() {
        System.out.println("Attack completed.");
    }
}