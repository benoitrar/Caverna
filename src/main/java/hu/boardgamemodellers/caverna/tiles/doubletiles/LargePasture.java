package hu.boardgamemodellers.caverna.tiles.doubletiles;

import hu.boardgamemodellers.caverna.ResourceStack;
import hu.boardgamemodellers.caverna.BuildingMaterials;
import hu.boardgamemodellers.caverna.ExpeditionAcquirable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargePasture implements DoubleTile, ExpeditionAcquirable {

    private static final List<ResourceStack> COST_ON_EXPEDITION = Collections.unmodifiableList(Arrays.asList(new ResourceStack(BuildingMaterials.WOOD, 2)));

    @Override
    public int unlockLevel() {
        return 10;
    }

    @Override
    public List<ResourceStack> costOnExpedition() {
        return COST_ON_EXPEDITION;
    }
}
