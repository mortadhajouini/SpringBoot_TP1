package com.mortadha.Smartphone.service;

import java.util.List;
import com.mortadha.Smartphone.entities.Smartphone;
public interface SmartphoneService {
Smartphone saveSmartphone(Smartphone p);
Smartphone updateSmartphone(Smartphone p);
void deleteSmartphone(Smartphone p);
 void deleteSmartphoneById(Long id);
Smartphone getSmartphone(Long id);
List<Smartphone> getAllSmartphones();
}
