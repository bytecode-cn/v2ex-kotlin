package cn.bytecode.babel.domain

import javax.persistence.*

@Entity
@Table(name = "t_person")
data class Person(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0,
        var username: String = "",
        var password: String = ""
) {
    @OneToMany(mappedBy = "compositedBy")
    var topics: MutableSet<Topic> = HashSet()
}