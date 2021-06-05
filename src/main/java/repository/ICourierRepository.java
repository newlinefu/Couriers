package repository;

import entities.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourierRepository extends JpaRepository<Courier, Long> {}
