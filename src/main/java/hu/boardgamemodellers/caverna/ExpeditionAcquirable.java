package hu.boardgamemodellers.caverna;

import java.util.Collections;
import java.util.List;

public interface ExpeditionAcquirable {
    int unlockLevel();

    default int amountGotOnExpedition() {
        return 1;
    }

    default List<ResourceStack> costOnExpedition() {
        return Collections.emptyList();
    }
}
