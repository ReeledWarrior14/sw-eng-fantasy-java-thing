public abstract class HeroDecorator implements HeroComponent {
    protected HeroComponent hero;

    public HeroDecorator(HeroComponent hero) {
        this.hero = hero;
    }

    @Override
    public void showInfo() {
        hero.showInfo();
    }

    @Override
    public void attack() {
        hero.attack();
    }
}
