package hu.boardgamemodellers.caverna.edibles.goods;

import hu.boardgamemodellers.caverna.Amount;
import hu.boardgamemodellers.caverna.ExpeditionAcquirable;
import hu.boardgamemodellers.caverna.edibles.goods.Goods;

import java.math.BigDecimal;

public enum Seeds implements Goods, ExpeditionAcquirable
{
    GRAIN(Amount.ONE, Amount.ceiling(new BigDecimal("0.5")), 2),
    VEGETABLE(Amount.TWO, Amount.ONE, 4);

    private final Amount foodValue;
    private final Amount scoreValue;
    private final int unlockLevel;

    Seeds(Amount foodValue, Amount scoreValue, int unlockLevel) {
        this.foodValue = foodValue;
        this.scoreValue = scoreValue;
        this.unlockLevel = unlockLevel;
    }

    @Override
    public Amount foodValue() {
        return foodValue;
    }

    @Override
    public Amount scoreValue() {
        return scoreValue;
    }

    @Override
    public int unlockLevel() {
        return unlockLevel;
    }
}
