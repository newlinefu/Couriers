package entities;

import java.util.UUID;

public class Path {
    private Branch branchOne;
    private Branch branchTwo;
    private int range;

    private UUID pathId;

    public Path(Branch branchOne, Branch branchTwo, int range) {
        this.branchOne = branchOne;
        this.branchTwo = branchTwo;
        this.range = range;

        this.pathId = UUID.randomUUID();
    }

    public UUID getPathId() {
        return pathId;
    }

    public Branch getBranchOne() {
        return branchOne;
    }

    public Branch getBranchTwo() {
        return branchTwo;
    }

    public int getRange() {
        return range;
    }
}
