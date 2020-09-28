package cl.crised.restsecurityspring.service;

import cl.crised.restsecurityspring.model.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();
}
