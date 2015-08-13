package hu.boardgamemodellers.caverna.edibles;

import hu.boardgamemodellers.caverna.Amount;

public class Food implements Edible {

    @Override
    public Amount foodValue() {
        return Amount.ONE;
    }
}
