package com.zerobase.domain.repository

import com.zerobase.domain.dimain.UserInfo
import org.springframework.data.jpa.repository.JpaRepository

interface UserInfoRepository : JpaRepository<UserInfo, Long> {
    fun findByUserKey(userKey: String): UserInfo
}