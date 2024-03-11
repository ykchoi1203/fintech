package com.zerobase.domain.dimain

import javax.persistence.*

@Entity
@Table(name = "USR_INFO")
class UserInfo (
        @Column(name = "usr_key")
        val userKey: String,

        @Column(name = "usr_reg_num")
        val userRegistrationNumber: String,

        @Column(name = "usr_nm")
        val userName: String,

        @Column(name = "usr_icn_ant")
        val userIncomeAmount: Long
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}