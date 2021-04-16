package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ICourierRepository;

@Service
public class CourierService {

    @Autowired
    private ICourierRepository reposData;
}
