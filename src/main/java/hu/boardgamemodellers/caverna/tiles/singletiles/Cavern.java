package hu.boardgamemodellers.caverna.tiles.singletiles;

import hu.boardgamemodellers.caverna.ExpeditionAcquirable;
import hu.boardgamemodellers.caverna.RubyAcquirable;

import java.math.BigDecimal;

public class Cavern implements SingleTile, RubyAcquirable, ExpeditionAcquirable {

    private static final BigDecimal RUBY_VALUE = new BigDecimal("2");

    @Override
    public BigDecimal rubyValue() {
        return RUBY_VALUE;
    }

    @Override
    public int unlockLevel() {
        return 14;
    }
}
