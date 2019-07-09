package edu.fudan.jpasqlitedemon;

import edu.fudan.jpasqlitedemon.beans.Person;
import edu.fudan.jpasqlitedemon.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpasqlitedemonApplicationTests {
    @Autowired
    PersonRepository personRepository;

    @Test
    public void save() {
        Person person = new Person();
        person.setId("001");
        person.setName("feng");
        person.setAge("28");
        String[] hs = {"sing", "sleep", "reading"};
        person.setHobbies(hs);
        personRepository.save(person);
    }

    @Test
    public void findAll(){
        List<Person> all = personRepository.findAll();
        for (Person person : all) {
            System.out.println(person.toString());
        }
    }
}
