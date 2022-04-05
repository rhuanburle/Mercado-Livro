package com.mercadolivro.controller.request

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.model.CustomerModel
import java.math.BigDecimal
import javax.persistence.*

data class PutBookRequest (
    var name: String?,
    var price: BigDecimal?,
)
