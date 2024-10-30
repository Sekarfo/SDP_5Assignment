public abstract class GameAction {
    public final void executeAction() {
        prepare();
        action();
        conclude();
    }

    protected abstract void prepare();
    protected abstract void action();
    protected abstract void conclude();
}