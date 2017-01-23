package service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ServiceRepository extends CrudRepository<ServiceEntity, Long> {
}
