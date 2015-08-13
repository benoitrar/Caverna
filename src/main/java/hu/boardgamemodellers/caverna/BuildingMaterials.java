package hu.boardgamemodellers.caverna;

import java.math.BigDecimal;

public enum BuildingMaterials implements Resource, RubyAcquirable, ExpeditionAcquirable {
    WOOD(1, 1),
    STONE(3, 1),
    ORE(4, 2);

    private final int unlockLevel;
    private final int amountGotOnExpedition;

    private BuildingMaterials(int unlockLevel, int amountGotOnExpedition) {
        this.unlockLevel = unlockLevel;
        this.amountGotOnExpedition = amountGotOnExpedition;
    }

    @Override
    public BigDecimal rubyValue() {
        return BigDecimal.ONE;
    }

    @Override
    public int unlockLevel() {
        return unlockLevel;
    }

    @Override
    public int amountGotOnExpedition() {
        return amountGotOnExpedition;
    }
}
