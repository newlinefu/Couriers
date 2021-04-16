package repository;

import entities.Path;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PathRepository implements IPathRepository {

    private List<Path> paths = new ArrayList<Path>() {

    };

    @Override
    public void addPath(Path path) {
        paths.add(path);
    }

    @Override
    public Path deletePath(UUID pathId) {
        Path deletedPath = getPath(pathId);
        paths.removeIf(r -> r.getPathId().equals(pathId));

        return deletedPath;
    }

    @Override
    public Path getPath(UUID pathId) {
        Optional<Path> result = paths.stream().filter(r -> r.getPathId().equals(pathId)).findFirst();
        return result.isEmpty() ? null : result.get();
    }

    @Override
    public Collection<Path> getAll() {
        return paths;
    }
}
