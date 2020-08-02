package com.swaggerproj.demo.controller;


import com.swaggerproj.demo.model.UserSet;
import com.swaggerproj.demo.service.MyService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/user")

public class UserRestServiceController {

    @Autowired
    private MyService service;

    @GetMapping(value= "/")
    public List<UserSet> getAllUsers() {
        return service.getUsersFromService();
    }

    @GetMapping(value= "/{id}")
    @ApiOperation(value = "returns the json and finds user by Id")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Suceess|OK"),
                    @ApiResponse(code = 404, message = "not found!!!")
            }
    )
    public Optional<UserSet> getUserSet(@PathVariable(name= "id") int id) {
        return service.getUserByIdFromService(id);
    }
}