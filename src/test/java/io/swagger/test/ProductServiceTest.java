/*
 * package io.swagger.test;
 * 
 * import static org.junit.Assert.assertEquals; import static
 * org.mockito.Mockito.when;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * import io.swagger.api.NotFoundException; import
 * io.swagger.dao.ProductRepository; import io.swagger.model.Product; import
 * io.swagger.service.ProductService;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @SpringBootTest public class ProductServiceTest {
 * 
 * @Autowired private ProductService service;
 * 
 * @MockBean private ProductRepository repository;
 * 
 * Product product1 = new Product(121, "Shoes", 111l, 1222.0, 4, 4.5); Product
 * product2 = new Product(122, "Sunglass", 111l, 1222.0, 4, 4.5); List<Product>
 * products = new ArrayList<Product>();
 * 
 * 
 * @Test public void getProductsTest() throws NotFoundException {
 * products.add(product1); products.add(product2);
 * 
 * when(repository.findAll()).thenReturn(products);
 * assertEquals(products.size(), service.productsGet(12, 2).getBody().size());
 * 
 * }
 * 
 * @Test public void productsProductIdGetTest() throws NotFoundException {
 * Integer id = 121; when(repository.findOne(id)).thenReturn(product1);
 * assertEquals(product1.getProductName(),
 * service.productsProductIdGet(id).getBody().getProductName());
 * 
 * }
 * 
 * @Test public void productsProductNameGetTest() throws NotFoundException {
 * String productName = "Sunglass"; products.add(product2);
 * when(repository.findByProductName(productName)).thenReturn(products);
 * assertEquals(1,
 * service.productsProductNameGet(productName).getBody().size()); }
 * 
 * @Test public void productsPostTest() throws NotFoundException { Product
 * newProduct = new Product(123, "Perfume", 111l, 1222.0, 4, 4.5);
 * when(repository.save(newProduct)).thenReturn(newProduct);
 * assertEquals(newProduct, service.productsPost(newProduct).getBody()); } }
 */