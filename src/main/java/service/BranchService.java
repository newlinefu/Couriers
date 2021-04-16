package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IBranchRepository;

@Service
public class BranchService {

    @Autowired
    private IBranchRepository reposData;
}
