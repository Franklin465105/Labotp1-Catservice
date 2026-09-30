package ie.atu.otp.week1.catservice.service;

import ie.atu.otp.week1.catservice.model.Product;
import ie.atu.otp.week1.catservice.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService
{
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll()
    {
        return productRepository.findAll();
    }

    public Product create(Product product)
    {
        product.setId(null);
        //leave null for now
        return productRepository.save(product);
    }
    public Product getbyId(Long id)
    {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not Found"));
    }
}
