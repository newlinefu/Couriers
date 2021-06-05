package mapper;

import dto.PathDto;
import entities.Path;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface PathMapper {
    Path dtoToPath(PathDto pathDto);

    PathDto pathToDto(Path path);

    List<Path> listDtoToListPath(List<PathDto> pathDtoList);

    List<PathDto> listPathToListDto(List<Path> paths);
}
