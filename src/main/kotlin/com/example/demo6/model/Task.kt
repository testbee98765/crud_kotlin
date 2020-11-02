package com.example.demo6.model

import javax.persistence.*

@Entity
//data class Task {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "serial") var id: Long? = null
//    var title: String? = null
//    var description: String? = null
//    var author: String? = null
//    var finished: Boolean? = false
//
//}

@Table(name = "demo")
class Task {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "serial") var id: Long? = null

    var title: String? = null
    var description: String? = null
    var author: String? = null
    var finished: Boolean? = false
}
