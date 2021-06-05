package mapper;

import dto.CourierDto;
import entities.Courier;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface CourierMapper {

    Courier dtoToCourier(CourierDto courierDto);

    CourierDto courierToDto(Courier courier);

    List<Courier> listDtoToListCourier(List<CourierDto> courierDtoList);

    List<CourierDto> listCouriersToListDto(List<Courier> couriers);
}
