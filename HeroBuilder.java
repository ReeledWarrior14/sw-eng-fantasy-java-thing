public class HeroBuilder {
    private String name;
    private String heroClass;
    private int level;
    private Weapon weapon;

    public HeroBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HeroBuilder setHeroClass(String heroClass) {
        this.heroClass = heroClass;
        return this;
    }

    public HeroBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public HeroBuilder setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Hero build() {
        return new Hero(name, heroClass, level, weapon);
    }
}
