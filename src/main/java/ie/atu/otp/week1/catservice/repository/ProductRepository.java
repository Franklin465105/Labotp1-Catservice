package ie.atu.otp.week1.catservice.repository;

import ie.atu.otp.week1.catservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
