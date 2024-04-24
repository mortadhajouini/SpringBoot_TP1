package com.mortadha.Smartphone;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.mortadha.Smartphone.entities.Smartphone;
import com.mortadha.Smartphone.repos.SmartphoneRepository;
@SpringBootTest
class SmartphonesApplicationTests {
@Autowired
private SmartphoneRepository SmartphoneRepository;
@Test
public void testCreateSmartphone() {
Smartphone prod = new Smartphone("PC Dell",2200.500,new Date());
SmartphoneRepository.save(prod);
}
@Test
public void testFindSmartphone()
{
Smartphone p = SmartphoneRepository.findById(1L).get(); 
System.out.println(p);
}
@Test
public void testUpdateSmartphone()
{
Smartphone p = SmartphoneRepository.findById(1L).get();
p.setPrixSmartphone(1000.0);
SmartphoneRepository.save(p);
}
@Test
public void testDeleteSmartphone()
{
SmartphoneRepository.deleteById(1L);;
}
 
@Test
public void testListerTousSmartphones()
{
List<Smartphone> prods = SmartphoneRepository.findAll();
for (Smartphone p : prods)
{
System.out.println(p);
}
}

}