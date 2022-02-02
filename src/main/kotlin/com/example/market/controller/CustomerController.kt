package com.example.market.controller

import com.example.market.entity.Customer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customers")
class CustomerController {

    @GetMapping("1")
    fun getCustomer(): Customer {
        return Customer("1", "test", "test@test.com")
    }
}