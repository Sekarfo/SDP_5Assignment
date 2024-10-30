public class PoweredUpState implements CharacterState {
    private Character character;

    public PoweredUpState(Character character) {
        this.character = character;
    }

    @Override
    public void attack() {
        System.out.println("Powered up attack with double strength: " + (character.getAttackStrength() * 2));
    }
}