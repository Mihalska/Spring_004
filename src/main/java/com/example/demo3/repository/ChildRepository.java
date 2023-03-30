package com.example.demo3.repository;

import com.example.demo3.entity.Child;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ChildRepository extends CrudRepository<Child, Integer> {
    @Modifying(clearAutomatically = true,flushAutomatically = true)
    @Transactional
    @Query(value = "delete from child c where c.id = ?", nativeQuery = true)
    void deleteChildByID (@Param("id")Integer Id);

    @Modifying(clearAutomatically = true,flushAutomatically = true)
    @Transactional
    @Query(value = "update child c set  c.name = ? where c.id = ?", nativeQuery = true)
    Integer updateChildByID(@Param("name") String Name, Integer Id) ;

    Child getChildNewById(Integer id);
}
