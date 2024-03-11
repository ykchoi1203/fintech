package com.zerobase.api.loan.exception

import org.springframework.http.HttpStatus

enum class CustomErrorCode (
    val statusCode: HttpStatus,
    val errorCode: String,
    val errorMessage: String
) {
    RESULT_NOT_FOUND(HttpStatus.BAD_REQUEST, "E001", "result not found")
}