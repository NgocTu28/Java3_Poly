package service.impl;

import java.util.List;
import model.Publishers;
import model.Users;
import repository.PublishersRepository;

public class PublishersServiceImpl {

    PublishersRepository repo;

    public PublishersServiceImpl() {
        repo = new PublishersRepository();
    }

    public List<Publishers> getAllPub(Users u) {
        return repo.findAllPub(u);
    }

}
