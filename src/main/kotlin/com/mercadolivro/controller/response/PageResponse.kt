package com.mercadolivro.controller.response

class PageResponse<T>(
    var items: List<T>,
    var currentPage: Int,
    var totalItens: Long,
    var totalPages: Int,
)