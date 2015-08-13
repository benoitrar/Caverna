package hu.boardgamemodellers.caverna.tiles.singletiles;

import hu.boardgamemodellers.caverna.ResourceStack;
import hu.boardgamemodellers.caverna.BuildingMaterials;
import hu.boardgamemodellers.caverna.ExpeditionAcquirable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallPasture implements SingleTile, ExpeditionAcquirable {

    private static final List<ResourceStack> COST_ON_EXPEDITION = Collections.unmodifiableList(Arrays.asList(new ResourceStack(BuildingMaterials.WOOD, 1)));

    @Override
    public int unlockLevel() {
        return 9;
    }

    @Override
    public List<ResourceStack> costOnExpedition() {
        return COST_ON_EXPEDITION;
    }
}
