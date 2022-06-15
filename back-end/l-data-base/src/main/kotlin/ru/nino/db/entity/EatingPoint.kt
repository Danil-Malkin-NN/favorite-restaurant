package ru.nino.db.entity

import javax.persistence.*

@Entity
data class EatingPoint(
    var name: String = "",
    var mark: Float = 0.0F,
    var description: String = "",
    @OneToOne(orphanRemoval = true, cascade = [CascadeType.ALL])
    var address: Address = Address.NONE,
    @OneToOne(cascade = [CascadeType.ALL])
    var bestDish: Dish = Dish.NONE,


    ) : AbsId() {

    companion object Empty {
        val NONE: EatingPoint = EatingPoint()
    }

}
