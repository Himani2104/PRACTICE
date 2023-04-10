package com.example.JPA.PART2.TablePerClassInheritenceMapping;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepositoryTablePerClass extends CrudRepository<PaymentMode,Integer> {
}
