package pl.slawek.data;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.slawek.model.Advertisement;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

}
