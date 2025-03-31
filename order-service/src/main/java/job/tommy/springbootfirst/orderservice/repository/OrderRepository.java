package job.tommy.springbootfirst.orderservice.repository;

import job.tommy.springbootfirst.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
