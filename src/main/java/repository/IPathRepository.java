package repository;


import entities.Path;

import java.util.Collection;
import java.util.UUID;

public interface IPathRepository {

    void addPath(Path path);

    Path deletePath(UUID pathId);

    Path getPath(UUID pathId);

    Collection<Path> getAll();

}
