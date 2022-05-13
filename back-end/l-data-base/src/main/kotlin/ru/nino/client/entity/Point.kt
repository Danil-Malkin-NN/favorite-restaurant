package ru.nino.client.entity

import org.springframework.data.jpa.domain.AbstractPersistable_.id
import javax.persistence.*

@Entity
data class Point(
    @Id
    @GeneratedValue
    var id: Long? = null,
    var name: String = "",
    var mark: Float = 0.0F,
) : AbsId() {


}
