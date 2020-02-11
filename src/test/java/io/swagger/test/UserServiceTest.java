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
 * io.swagger.dao.UserRepository; import io.swagger.model.User; import
 * io.swagger.service.UserService;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @SpringBootTest public class UserServiceTest {
 * 
 * @Autowired private UserService service;
 * 
 * @MockBean private UserRepository repository; User user = new
 * User("TwinBeatz", "twin123", "Twin123@gmail.com", "Punjab", 8978787879l,
 * "Admin", 0.0);
 * 
 * @Test public void usersPostTest() throws NotFoundException {
 * when(repository.save(user)).thenReturn(user); assertEquals(user,
 * service.usersPost(user).getBody()); }
 * 
 * @Test public void usersUserNameGetTest() throws NotFoundException { String
 * userName = "TwinBeatz";
 * when(repository.findOne("TwinBeatz")).thenReturn(user); assertEquals(user,
 * service.usersUserNameGet(userName).getBody()); }
 * 
 * }
 */