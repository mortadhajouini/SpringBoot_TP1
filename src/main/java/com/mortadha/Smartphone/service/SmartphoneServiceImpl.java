package com.mortadha.Smartphone.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortadha.Smartphone.entities.Smartphone;
import com.mortadha.Smartphone.repos.SmartphoneRepository;
@Service
public class SmartphoneServiceImpl implements SmartphoneService {
@Autowired
SmartphoneRepository SmartphoneRepository;
@Override
public Smartphone saveSmartphone(Smartphone p) {
return SmartphoneRepository.save(p);
}
@Override
public Smartphone updateSmartphone(Smartphone p) {
return SmartphoneRepository.save(p);
}
@Override
public void deleteSmartphone(Smartphone p) {
SmartphoneRepository.delete(p);
}
 @Override
public void deleteSmartphoneById(Long id) {
SmartphoneRepository.deleteById(id);
}
@Override
public Smartphone getSmartphone(Long id) {
return SmartphoneRepository.findById(id).get();
}
@Override
public List<Smartphone> getAllSmartphones() {
return SmartphoneRepository.findAll();
}}
