package hu.boardgamemodellers.caverna;

public class ResourceStack {

    private final Resource resource;
    private final int amount;

    public ResourceStack(Resource resource, int amount) {
        this.resource = resource;
        this.amount = amount;
    }

    public Resource getResource() {
        return resource;
    }

    public int getAmount() {
        return amount;
    }
}
