package hu.boardgamemodellers.caverna.edibles;

import hu.boardgamemodellers.caverna.Amount;
import hu.boardgamemodellers.caverna.Scorable;

public class Ruby implements Edible, Scorable
{

    @Override
    public Amount foodValue() {
        return Amount.TWO;
    }

    @Override
    public Amount scoreValue() {
        return Amount.ONE;
    }
}
