package cn.bytecode.babel.domain

import javax.persistence.*

@Entity
@Table(name = "t_topic")
data class Topic(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0,
        var title: String = "",
        var content: String = ""
) {
    @ManyToOne
    lateinit var lastRepliedBy: Person
    @ManyToOne
    lateinit var compositedBy: Person
}