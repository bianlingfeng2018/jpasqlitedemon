package edu.fudan.jpasqlitedemon.repository;

import edu.fudan.jpasqlitedemon.beans.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String> {
}
