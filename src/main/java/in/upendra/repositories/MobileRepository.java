package in.upendra.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.upendra.entities.MobileEntity;

@Repository
public interface MobileRepository extends JpaRepository<MobileEntity, Serializable> {

}
