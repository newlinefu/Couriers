package service.implementation;

import dto.BranchDto;
import entities.Branch;
import mapper.BranchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IBranchRepository;
import service.IBranchService;

import java.util.List;
import java.util.Optional;

@Service
public class BranchService implements IBranchService {

    @Autowired
    IBranchRepository branchRepository;
    @Autowired
    BranchMapper branchMapper;

    @Override
    public List<BranchDto> getAllBranch() {
        List<Branch> branches = branchRepository.findAll();
        return branchMapper.listRequestToListDto(branches);
    }

    @Override
    public void deleteAllBranch() {
        branchRepository.deleteAll();
    }

    @Override
    public BranchDto getBranchById(Long branchId) {
        Optional<Branch> branch = branchRepository.findById(branchId);
        return branch.map(branchMapper::branchToDto).orElse(null);
    }

    @Override
    public BranchDto addBranch(BranchDto branchDto) {
        Branch branch = branchMapper.dtoToBranch(branchDto);
        branch = branchRepository.save(branch);
        return branchMapper.branchToDto(branch);
    }

    @Override
    public void deleteBranchById(Long branchId) {
        branchRepository.deleteById(branchId);
    }
}
