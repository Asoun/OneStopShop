/*
 * package io.swagger.test;
 * 
 * import static org.junit.Assert.assertEquals; import static
 * org.mockito.Mockito.when;
 * 
 * import java.sql.Date; import java.util.ArrayList; import java.util.List;
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * import io.swagger.api.NotFoundException; import
 * io.swagger.dao.OrderRepository; import io.swagger.model.Order; import
 * io.swagger.service.OrderService;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @SpringBootTest public class OrderServiceTest {
 * 
 * @Autowired private OrderService service;
 * 
 * @MockBean private OrderRepository repository;
 * 
 * Order order = new Order(12345l, "TwinBeatz", 1234l, new Date(2020, 02, 20),
 * 12345l); List<Order> orders = new ArrayList<Order>();
 * 
 * @Test public void orderDetailsOrderIdGetTest() throws NotFoundException {
 * long id = 12345l; when(repository.findOne(id)).thenReturn(order);
 * assertEquals(order, service.orderDetailsOrderIdGet(id).getBody()); }
 * 
 * @Test public void orderDetailsUserNameGetTest() throws NotFoundException {
 * String userName = "TwinBeatz"; orders.add(order);
 * when(repository.findByUserName(userName)).thenReturn(orders);
 * assertEquals(orders, service.orderDetailsUserNameGet(userName).getBody());
 * 
 * } }
 */