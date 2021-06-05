package service;

import dto.CourierDto;

import java.util.List;

public interface ICourierService {

    List<CourierDto> getAllCourier();

    void deleteAllCourier();

    CourierDto getCourierById(Long courierId);

    CourierDto addCourier(CourierDto courierDto);

    void deleteCourierById(Long courierId);

}
