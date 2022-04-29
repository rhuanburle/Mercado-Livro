package com.mercadolivro.service

import com.mercadolivro.enums.CustomerStatus
import com.mercadolivro.enums.Role
import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerRepository
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import java.util.UUID

@ExtendWith(MockKExtension::class)
class CustomerServiceTest {

    @MockK
    private lateinit var customerRepository: CustomerRepository
    @MockK
    private lateinit var bookService: BookService
    @MockK
    private lateinit var bCrypt: BCryptPasswordEncoder

    @InjectMocks
    private  lateinit var customerService: CustomerService

    @Test
    fun `Should return all customers`() {

        val fakeCustomers = listOf(buildCustomer(), buildCustomer())

        every { customerRepository.findAll() } returns fakeCustomers

        val customers =  customerService.getAll(null)

        assertEquals(fakeCustomers, customers)
    }

    fun buildCustomer(
        id: Int? = null,
        name: String = "",
        email: String = "${UUID.randomUUID()}@email.com",
        password: String = "password"
    ) = CustomerModel(
       id = id,
       name = name,
       email = email,
       status = CustomerStatus.ATIVO,
       password = password,
       roles = setOf(Role.CUSTOMER))

}