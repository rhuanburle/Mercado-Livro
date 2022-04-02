package com.mercadolivro.controller.request

import com.mercadolivro.model.CustomerModel

data class PutCustomerRequest (
    var name: String,
    var email: String
)
