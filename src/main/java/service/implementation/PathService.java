package service.implementation;

import dto.PathDto;
import entities.Path;
import mapper.PathMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IPathRepository;
import service.IPathService;

import java.util.List;
import java.util.Optional;

@Service
public class PathService implements IPathService {

    @Autowired
    IPathRepository pathRepository;
    @Autowired
    PathMapper pathMapper;

    @Override
    public List<PathDto> getAllPath() {
        List<Path> paths = pathRepository.findAll();
        return pathMapper.listPathToListDto(paths);
    }

    @Override
    public void deleteAllPath() {
        pathRepository.deleteAll();
    }

    @Override
    public PathDto getPathById(Long pathId) {
        Optional<Path> path = pathRepository.findById(pathId);
        return path.map(pathMapper::pathToDto).orElse(null);
    }

    @Override
    public PathDto addPath(PathDto pathDto) {
        Path path = pathMapper.dtoToPath(pathDto);
        path = pathRepository.save(path);
        return pathMapper.pathToDto(path);
    }

    @Override
    public void deletePathById(Long pathId) {
        pathRepository.deleteById(pathId);
    }
}
