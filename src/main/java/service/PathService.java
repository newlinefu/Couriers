package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IPathRepository;

@Service
public class PathService {

    @Autowired
    private IPathRepository reposData;
}
