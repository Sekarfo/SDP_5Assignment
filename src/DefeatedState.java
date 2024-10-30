public class DefeatedState implements CharacterState {
    private Character character;

    public DefeatedState(Character character) {
        this.character = character;
    }

    @Override
    public void attack() {
        System.out.println("Cannot attack, character is defeated.");
    }
}