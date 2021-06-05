package service.implementation;

import dto.CourierDto;
import entities.Courier;
import mapper.CourierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ICourierRepository;
import service.ICourierService;

import java.util.List;
import java.util.Optional;

@Service
public class CourierService implements ICourierService {

    @Autowired
    ICourierRepository courierRepository;
    @Autowired
    CourierMapper courierMapper;

    @Override
    public List<CourierDto> getAllCourier() {
        List<Courier> couriers = courierRepository.findAll();
        return courierMapper.listCouriersToListDto(couriers);
    }

    @Override
    public void deleteAllCourier() {
        courierRepository.deleteAll();
    }

    @Override
    public CourierDto getCourierById(Long courierId) {
        Optional<Courier> country = courierRepository.findById(courierId);
        return country.map(courierMapper::courierToDto).orElse(null);
    }

    @Override
    public CourierDto addCourier(CourierDto courierDto) {
        Courier courier = courierMapper.dtoToCourier(courierDto);
        courier = courierRepository.save(courier);
        return courierMapper.courierToDto(courier);
    }

    @Override
    public void deleteCourierById(Long courierId) {
        courierRepository.deleteById(courierId);
    }
}
