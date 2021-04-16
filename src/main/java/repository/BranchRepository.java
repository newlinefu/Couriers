package repository;

import entities.Branch;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BranchRepository implements IBranchRepository {

    private List<Branch> branches = new ArrayList<Branch>() {

    };

    @Override
    public void addMessage(Branch branch) {
        branches.add(branch);
    }

    @Override
    public Branch deleteBranch(UUID branchId) {
        Branch deletedBranch = getBranch(branchId);
        branches.removeIf(r -> r.getBranchId().equals(branchId));

        return deletedBranch;
    }

    @Override
    public Branch getBranch(UUID branchId) {
        Optional<Branch> result = branches.stream().filter(r -> r.getBranchId().equals(branchId)).findFirst();
        return result.isEmpty() ? null : result.get();
    }

    @Override
    public Collection<Branch> getAll() {
        return branches;
    }
}
