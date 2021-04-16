package repository;

import java.util.Collection;
import java.util.List;
import entities.Branch;
import entities.Courier;

import java.util.UUID;

public interface ICourierRepository {

    void addCourier(Courier courier);

    Courier deleteCourier(UUID courId);

    Courier getCourier(UUID courId);

    Collection<Courier> getAll();

}
