public class BattleController {

    private BattleStrategy strategy;

    public void setStrategy(BattleStrategy strategy) {
        this.strategy = strategy;
    }

    public void fight() {
        strategy.execute();
    }
}
