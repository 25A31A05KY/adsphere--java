package com.adsphere.controller;

import com.adsphere.model.Advertisement;
import com.adsphere.service.AdvertisementService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ads")
public class AdvertisementController {

    private final AdvertisementService service;

    public AdvertisementController(AdvertisementService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Advertisement createAd(
            @Valid @RequestBody Advertisement ad) {

        return service.create(ad);
    }

    @GetMapping
    public List<Advertisement> getAllAds() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Advertisement getAdById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Advertisement updateAd(
            @PathVariable Long id,
            @Valid @RequestBody Advertisement ad) {

        return service.update(id, ad);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAd(@PathVariable Long id) {
        service.delete(id);
    }
}
