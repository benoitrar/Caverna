package hu.boardgamemodellers.caverna.edibles.goods;

import hu.boardgamemodellers.caverna.Amount;
import hu.boardgamemodellers.caverna.ExpeditionAcquirable;
import hu.boardgamemodellers.caverna.RubyAcquirable;

import java.math.BigDecimal;

import static hu.boardgamemodellers.caverna.Amount.floor;
import static hu.boardgamemodellers.caverna.Amount.ZERO;
import static hu.boardgamemodellers.caverna.Amount.ONE;
import static hu.boardgamemodellers.caverna.Amount.TWO;
import static hu.boardgamemodellers.caverna.Amount.THREE;

public enum Animals implements Goods, RubyAcquirable, ExpeditionAcquirable
{

    DOG(ZERO, ONE, BigDecimal.ONE, 1),
    SHEEP(ONE, ONE, BigDecimal.ONE, 2),
    DONKEY(floor(new BigDecimal("1.5")), ONE, BigDecimal.ONE, 3),
    WILD_BOAR(TWO, ONE, BigDecimal.ONE, 5),
    CATTLE(THREE, ONE, new BigDecimal("1.5"), 10);

    private final Amount foodValue;
    private final Amount score;
    private final BigDecimal rubyValue;
    private final int unlockLevel;

    Animals(Amount foodValue, Amount score, BigDecimal rubyValue, int unlockLevel) {
        this.foodValue = foodValue;
        this.score = score;
        this.rubyValue = rubyValue;
        this.unlockLevel = unlockLevel;
    }

    @Override
    public Amount foodValue() {
        return foodValue;
    }

    @Override
    public Amount scoreValue() {
        return score;
    }

    @Override
    public BigDecimal rubyValue() {
        return rubyValue;
    }

    @Override
    public int unlockLevel() {
        return unlockLevel;
    }
}
