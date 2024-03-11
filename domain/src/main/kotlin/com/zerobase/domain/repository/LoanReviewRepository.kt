package com.zerobase.domain.repository

import com.zerobase.domain.dimain.LoanReview
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface LoanReviewRepository : JpaRepository<LoanReview, Long> {
    fun findByUserKey(userKey: String): LoanReview?
}