package com.example.JPA.PART2.InheritenceMapping.SingleTableStrategy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}
