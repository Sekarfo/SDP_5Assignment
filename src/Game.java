public class Game {
    public static void main(String[] args) {
        Character hero = new Character();


        hero.setState(new NormalState(hero));
        hero.performAttack();
        hero.setState(new PoweredUpState(hero));
        hero.performAttack();


        hero.setStrategy(new MeleeStrategy());
        hero.fight();
        hero.setStrategy(new MagicStrategy());
        hero.fight();


        GameAction attack = new AttackAction();
        GameAction defend = new DefendAction();
        GameAction heal = new HealAction();

        attack.executeAction();
        defend.executeAction();
        heal.executeAction();


        EffectVisitor boost = new BoostEffect();
        EffectVisitor damage = new DamageEffect();

        hero.applyEffect(boost);
        hero.applyEffect(damage);
    }
}