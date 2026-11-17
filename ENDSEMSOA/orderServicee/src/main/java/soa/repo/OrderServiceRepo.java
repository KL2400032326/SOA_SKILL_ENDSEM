package soa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soa.model.Order;

@Repository
public interface OrderServiceRepo extends JpaRepository<Order,Long> {

}
