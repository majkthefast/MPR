package com.example.zoo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface ZooRepository extends JpaRepository<Zoo, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Zoo z SET z.Name = :name, z.isClosed = :open where z.Zoo = :id")
    int updateZoo(String name, boolean open, Integer id);

    List<Zoo> findAllByOpenIsFalse();
    List<Zoo> findAllByZooGreaterThan();
}
