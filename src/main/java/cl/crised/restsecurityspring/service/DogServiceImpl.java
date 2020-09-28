package cl.crised.restsecurityspring.service;

import cl.crised.restsecurityspring.model.Dog;
import cl.crised.restsecurityspring.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    private DogRepository dogRepository;

    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }
}
