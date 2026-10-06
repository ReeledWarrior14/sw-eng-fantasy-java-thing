public class StrengthBoost extends HeroDecorator {

    public StrengthBoost(HeroComponent hero) { // should be stackable with FirePower
        super(hero);
    }

    @Override
    public void attack() {
        // TODO:
        // execute the regular attack first
        // then add the strength behavrior
    }

}
