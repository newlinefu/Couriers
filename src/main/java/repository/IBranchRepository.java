package repository;

import entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IBranchRepository extends JpaRepository<Branch, Long> {}
