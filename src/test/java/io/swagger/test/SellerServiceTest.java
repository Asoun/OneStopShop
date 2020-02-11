/*
 * package io.swagger.test;
 * 
 * import static org.junit.Assert.assertEquals; import static
 * org.mockito.Mockito.when;
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * import io.swagger.api.NotFoundException; import
 * io.swagger.dao.SellerRepository; import io.swagger.model.Seller; import
 * io.swagger.service.SellerService;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @SpringBootTest public class SellerServiceTest {
 * 
 * @Autowired private SellerService service;
 * 
 * @MockBean private SellerRepository repository;
 * 
 * Seller seller = new Seller(234l, "The Prophec");
 * 
 * @Test public void sellersPostTest() throws NotFoundException {
 * when(repository.save(seller)).thenReturn(seller); assertEquals(seller,
 * service.sellersPost(seller).getBody()); }
 * 
 * @Test public void sellersSellerNameGetTest() throws NotFoundException {
 * String sellerName = "The Prophec";
 * when(repository.findBySellerName(sellerName)).thenReturn(seller);
 * assertEquals(seller, service.sellersSellerNameGet(sellerName).getBody()); }
 * 
 * @Test public void sellersSellerIdGetTest() throws NotFoundException { Long id
 * = 234l; when(repository.findOne(id)).thenReturn(seller); assertEquals(seller,
 * service.sellersSellerIdGet(id).getBody()); }
 * 
 * }
 */