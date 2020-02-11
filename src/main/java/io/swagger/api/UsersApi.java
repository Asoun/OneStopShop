/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.User;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-21T11:51:13.410Z[GMT]")
@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "", nickname = "usersPost", notes = "Creates a new user in the database.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new object.") })
    @RequestMapping(value = "/users",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<User> usersPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User body) throws NotFoundException;


    @ApiOperation(value = "", nickname = "usersUserNameGet", notes = "Obtain information about specific product.", response = User.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = User.class) })
    @RequestMapping(value = "/users/{UserName}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> usersUserNameGet(@ApiParam(value = "",required=true) @PathVariable("UserName") String userName) throws NotFoundException;

}