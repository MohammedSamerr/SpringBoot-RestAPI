package restDemo.example.restAppDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restDemo.example.restAppDemo.entities.product;

public interface productRepository extends JpaRepository<product,Integer> {
}
