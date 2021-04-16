package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IRequestRepository;

@Service
public class RequestService {
    @Autowired
    private IRequestRepository reposData;
}
