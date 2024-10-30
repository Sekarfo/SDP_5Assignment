public class Character {
    private CharacterState state;
    private FightingStrategy strategy;
    private int health;
    private int attackStrength;
    private int defense;

    public Character() {
        this.state = new NormalState(this);
        this.strategy = new MeleeStrategy();
        this.health = 100;
        this.attackStrength = 50;
        this.defense = 15;
    }

    public void setState(CharacterState newState) {
        this.state = newState;
    }

    public void setStrategy(FightingStrategy newStrategy) {
        this.strategy = newStrategy;
    }

    public void performAttack() {
        state.attack();
    }

    public void fight() {
        strategy.fight();
    }

    public void applyEffect(EffectVisitor visitor) {
        visitor.applyEffect(this);
    }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public int getAttackStrength() { return attackStrength; }
    public void setAttackStrength(int attackStrength) { this.attackStrength = attackStrength; }
    public int getDefense() { return defense; }
    public void setDefense(int defense) { this.defense = defense; }
}
