package repository;


import entities.Path;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.UUID;

public interface IPathRepository extends JpaRepository<Path, Long> {}
