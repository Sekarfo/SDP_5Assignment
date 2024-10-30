public class DamageEffect implements EffectVisitor {
    @Override
    public void applyEffect(Character character) {
        System.out.println("Applying damage effect.");
        character.setHealth(character.getHealth() - 10);
    }
}