package com.example.JPA.PART2.JoinedInheritenceMapping;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepositoryJoinedMapping extends CrudRepository<PaymentTable,Integer> {
}
