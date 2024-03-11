package com.zerobase.api.loan.request

import com.zerobase.domain.dimain.UserInfo

interface LoanRequestService {
    fun loanRequestMain(loanRequestInputDto: LoanRequestDto.LoanRequestInputDto
    ): LoanRequestDto.LoanRequestResponseDto

    fun saveUserInfo(
        userInfoDto: UserInfoDto
    ): UserInfo

    fun loanRequestReview(userInfoDto: UserInfoDto)
}