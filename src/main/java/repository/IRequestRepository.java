package repository;

import entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRequestRepository extends JpaRepository<Request, Long> {}
