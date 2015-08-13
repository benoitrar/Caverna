package hu.boardgamemodellers.caverna.actions;

import hu.boardgamemodellers.caverna.ExpeditionAcquirable;

public class SowAction implements ExpeditionAcquirable {

    @Override
    public int unlockLevel() {
        return 12;
    }
}
