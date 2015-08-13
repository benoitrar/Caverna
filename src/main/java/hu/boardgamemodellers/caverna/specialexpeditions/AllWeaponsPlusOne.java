package hu.boardgamemodellers.caverna.specialexpeditions;

import hu.boardgamemodellers.caverna.ExpeditionAcquirable;

public class AllWeaponsPlusOne implements ExpeditionAcquirable {

    @Override
    public int unlockLevel() {
        return 1;
    }
}
