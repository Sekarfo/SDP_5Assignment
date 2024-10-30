public class NormalState implements CharacterState {
    private Character character;

    public NormalState(Character character) {
        this.character = character;
    }

    @Override
    public void attack() {
        System.out.println("Normal attack with strength: " + character.getAttackStrength());
    }
}
