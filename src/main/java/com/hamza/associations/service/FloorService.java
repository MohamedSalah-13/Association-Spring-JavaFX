package com.hamza.associations.service;

import com.hamza.associations.entity.Floor;
import com.hamza.associations.repository.FloorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloorService {

    @Autowired
    private FloorRepository floorRepository;


    public List<Floor> findAll() {
        return floorRepository.findAll();
    }

    public List<Floor> findAllByAssociation_Id(Long id) {
        return floorRepository.findAllByAssociation_Id(id);
    }

    public Floor findById(Long id) {
        return floorRepository.findById(id).orElseThrow();
    }

    public List<Floor> saveList(List<Floor> list) {
        return floorRepository.saveAll(list);
    }

}
