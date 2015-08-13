package hu.boardgamemodellers.caverna;

import hu.boardgamemodellers.caverna.tiles.Tile;

public interface PlayerBoard {
    boolean isApplicable(TableSpaceTransformation... tableSpaceTransformations);
    void apply(Tile tile, TableSpaceTransformation... tableSpaceTransformations);
}
