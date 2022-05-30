package ru.nino.client.entity

import javax.persistence.Entity


@Entity
data class Dish(
    var name: String = "",
    var cost: Float = 0.0F,
    var description: String = "",
    var marks: Float = 0.0F,

    ) : AbsId() {

    companion object Empty {
        val NONE: Dish = Dish()
    }

}
