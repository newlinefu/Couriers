package mapper;

import dto.RequestDto;
import entities.Request;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface RequestMapper {
    Request dtoToRequest(RequestDto requestDto);

    RequestDto requestToDto(Request request);

    List<Request> listDtoToListRequest(List<RequestDto> requestDtoList);

    List<RequestDto> listRequestToListDto(List<Request> requestList);
}
