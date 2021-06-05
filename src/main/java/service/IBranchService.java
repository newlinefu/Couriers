package service;

import dto.BranchDto;
import java.util.List;

public interface IBranchService {

    List<BranchDto> getAllBranch();

    void deleteAllBranch();

    BranchDto getBranchById(Long branchId);

    BranchDto addBranch(BranchDto branchDto);

    void deleteBranchById(Long branchId);

}
