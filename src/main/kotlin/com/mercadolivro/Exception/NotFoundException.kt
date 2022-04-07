package com.mercadolivro.Exception

class NotFoundException(override val message: String, val erroCode: String): Exception() {
}