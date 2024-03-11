package com.zerobase.api.loan.exception

import java.lang.RuntimeException

class CustomException (val customErrorCode: CustomErrorCode) : RuntimeException() {
}