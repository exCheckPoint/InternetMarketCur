package com.boot.internetmarket.repositories;

import com.boot.internetmarket.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 02.06.2017.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}
