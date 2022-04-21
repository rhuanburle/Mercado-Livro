package com.mercadolivro.Exception

class AuthenticationException (override val message: String, val erroCode: String): Exception()