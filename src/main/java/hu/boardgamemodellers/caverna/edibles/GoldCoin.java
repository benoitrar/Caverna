package hu.boardgamemodellers.caverna.edibles;

import hu.boardgamemodellers.caverna.Amount;
import hu.boardgamemodellers.caverna.ExpeditionAcquirable;
import hu.boardgamemodellers.caverna.Scorable;

import java.math.BigDecimal;

public class GoldCoin implements Edible, Scorable, ExpeditionAcquirable
{

    private static final Amount FOOD_VALUE = Amount.floor(new BigDecimal("0.99"));
    private static final Amount SCORE_VALUE = Amount.ONE;

    @Override
    public Amount foodValue() {
        return FOOD_VALUE;
    }

    @Override
    public Amount scoreValue() {
        return SCORE_VALUE;
    }

    @Override
    public int unlockLevel() {
        return 6;
    }

    @Override
    public int amountGotOnExpedition() {
        return 2;
    }
}
