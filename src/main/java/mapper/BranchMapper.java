package mapper;

import dto.BranchDto;
import entities.Branch;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface BranchMapper {
    Branch dtoToBranch(BranchDto branchDto);

    BranchDto branchToDto(Branch request);

    List<Branch> listDtoToListRequest(List<BranchDto> branchDtoList);

    List<BranchDto> listRequestToListDto(List<Branch> branches);
}
