package service;

import dto.PathDto;
import java.util.List;

public interface IPathService {

    List<PathDto> getAllPath();

    void deleteAllPath();

    PathDto getPathById(Long pathId);

    PathDto addPath(PathDto pathDto);

    void deletePathById(Long pathId);
}
