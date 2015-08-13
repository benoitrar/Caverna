package hu.boardgamemodellers.caverna.tiles.singletiles;

import hu.boardgamemodellers.caverna.ExpeditionAcquirable;
import hu.boardgamemodellers.caverna.RubyAcquirable;

import java.math.BigDecimal;

public class Meadow implements SingleTile, RubyAcquirable, ExpeditionAcquirable {

    @Override
    public BigDecimal rubyValue() {
        return BigDecimal.ONE;
    }

    @Override
    public int unlockLevel() {
        return 11;
    }
}
