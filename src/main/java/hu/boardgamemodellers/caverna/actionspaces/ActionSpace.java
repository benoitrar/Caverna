package hu.boardgamemodellers.caverna.actionspaces;

import hu.boardgamemodellers.caverna.ResourceStack;

import java.util.List;

public interface ActionSpace {
    List<ResourceStack> resourceSetup();
    List<ResourceStack> resourceTopup();
    List<ResourceStack> fixResourceBenefit();
}
