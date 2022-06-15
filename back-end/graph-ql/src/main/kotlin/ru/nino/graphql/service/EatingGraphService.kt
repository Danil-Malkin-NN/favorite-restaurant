//package ru.nino.graphql.service
//
//import org.springframework.stereotype.Service
//import ru.nino.db.entity.EatingPoint
//import ru.nino.db.repository.EatingPointRepository
//
//@Service
//class EatingGraphService(val repository: EatingPointRepository) {
//
//
//    fun getEatingPoint(id: Long): EatingPoint {
//        return repository.findById(id).orElse(EatingPoint.NONE)
//    }
//
//
//}