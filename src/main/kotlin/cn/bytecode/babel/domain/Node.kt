package cn.bytecode.babel.domain

import javax.persistence.*

@Entity
@Table(name = "t_node")
data class Node(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0,
        var name: String = "",
        var title: String = ""
) {
    @OneToMany(mappedBy = "node")
    var topics: MutableSet<Topic> = HashSet()
}