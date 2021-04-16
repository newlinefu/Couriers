package repository;

import entities.Branch;
import entities.Courier;
import entities.Path;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CourierRepository implements ICourierRepository {

    private List<Courier> couriers = new ArrayList<Courier>() {

    };

    @Override
    public void addCourier(Courier courier) {
        couriers.add(courier);
    }

    @Override
    public Courier deleteCourier(UUID courId) {
        Courier deletedCourier = getCourier(courId);
        couriers.removeIf(r -> r.getCourierId().equals(courId));

        return deletedCourier;
    }

    @Override
    public Courier getCourier(UUID courId) {
        Optional<Courier> result = couriers.stream().filter(r -> r.getCourierId().equals(courId)).findFirst();
        return result.isEmpty() ? null : result.get();
    }

    @Override
    public Collection<Courier> getAll() {
        return couriers;
    }
}
