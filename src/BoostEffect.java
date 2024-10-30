public class BoostEffect implements EffectVisitor {
    @Override
    public void applyEffect(Character character) {
        System.out.println("Applying boost effect.");
        character.setAttackStrength(character.getAttackStrength() + 5);
    }
}