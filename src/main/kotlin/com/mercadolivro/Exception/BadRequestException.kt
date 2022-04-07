package com.mercadolivro.Exception

class BadRequestException(override val message: String, val erroCode: String): Exception() {
}