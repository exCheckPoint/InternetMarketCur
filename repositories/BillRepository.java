package com.boot.internetmarket.repositories;

import com.boot.internetmarket.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 01.06.2017.
 */
@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
}

