package com.adsphere.service;

import com.adsphere.model.Advertisement;
import com.adsphere.repository.AdvertisementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisementService {

    private final AdvertisementRepository repository;

    public AdvertisementService(AdvertisementRepository repository) {
        this.repository = repository;
    }

    public Advertisement create(Advertisement ad) {
        ad.setId(null);
        return repository.save(ad);
    }

    public List<Advertisement> getAll() {
        return repository.findAll();
    }

    public Advertisement getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Advertisement not found: " + id));
    }

    public Advertisement update(Long id, Advertisement updatedAd) {

        Advertisement existing = getById(id);

        existing.setTitle(updatedAd.getTitle());
        existing.setAdvertiser(updatedAd.getAdvertiser());
        existing.setDescription(updatedAd.getDescription());
        existing.setBudget(updatedAd.getBudget());
        existing.setStatus(updatedAd.getStatus());
        existing.setStartDate(updatedAd.getStartDate());
        existing.setEndDate(updatedAd.getEndDate());

        return repository.save(existing);
    }

    public void delete(Long id) {
        Advertisement ad = getById(id);
        repository.delete(ad);
    }
}
