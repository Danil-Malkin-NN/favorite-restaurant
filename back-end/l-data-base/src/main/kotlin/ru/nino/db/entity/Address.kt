package ru.nino.db.entity

import javax.persistence.Entity

@Entity
data class Address(
    var street: String = "",
    var houseNumber: Int = Integer.MAX_VALUE,
    var cityName: String = "",
    var corpus: String = "",
    var pointX: String = "0.0",
    var pointY: String = "0.0"
) : AbsId() {

    companion object Empty {
        val NONE = Address()
    }


}
