public class DefeatedState implements CharacterState {
    private java.lang.Character character;

    public DefeatedState(java.lang.Character character) {
        this.character = character;
    }

    @Override
    public void attack() {
        System.out.println("Cannot attack, character is defeated.");
    }
}