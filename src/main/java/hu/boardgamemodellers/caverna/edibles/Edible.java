package hu.boardgamemodellers.caverna.edibles;

import hu.boardgamemodellers.caverna.Amount;
import hu.boardgamemodellers.caverna.Resource;

import java.math.BigDecimal;

public interface Edible extends Resource
{
    Amount foodValue();
}
