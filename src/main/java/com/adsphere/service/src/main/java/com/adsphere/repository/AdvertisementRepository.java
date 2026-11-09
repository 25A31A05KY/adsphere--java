package com.adsphere.repository;

import com.adsphere.model.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertisementRepository
        extends JpaRepository<Advertisement, Long> {

}
