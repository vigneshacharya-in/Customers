package in.vigachar.customers.Customers.repository;

import in.vigachar.customers.Customers.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // You can add custom query methods here if needed
}

