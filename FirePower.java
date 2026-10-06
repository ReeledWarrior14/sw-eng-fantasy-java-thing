public class FirePower extends HeroDecorator {

    public FirePower(HeroComponent hero) { // should be stackable with StrengthBoost
        super(hero);
    }

    @Override
    public void attack() {
        // TODO:
        // execute the wrapped behavior
        // then add the fire damage
    }

}
