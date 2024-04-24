package com.mortadha.Smartphone.repos;

import org.springframework.data.repository.JpaRepository;
import com.mortadha.Smartphone.entities.Smartphone;
public interface SmartphoneRepository extends JpaRepository<Smartphone, Long> {

	Smartphone save(Smartphone prod);
}

