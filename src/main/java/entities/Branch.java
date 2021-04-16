package entities;

import java.util.UUID;

public class Branch {
    private UUID branchId;
    private String name;

    public Branch(String name) {
        this.name = name;

        this.branchId = UUID.randomUUID();
    }

    public UUID getBranchId() {
        return branchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
