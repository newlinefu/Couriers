package repository;

import entities.Branch;

import java.util.Collection;
import java.util.UUID;

public interface IBranchRepository {
    void addMessage(Branch branch);

    Branch deleteBranch(UUID branchId);

    Branch getBranch(UUID branchId);

    Collection<Branch> getAll();
}
