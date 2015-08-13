package hu.boardgamemodellers.caverna.actions;

import hu.boardgamemodellers.caverna.ExpeditionAcquirable;

public class BuildACavernAction implements ExpeditionAcquirable {

    @Override
    public int unlockLevel() {
        return 7;
    }
}
