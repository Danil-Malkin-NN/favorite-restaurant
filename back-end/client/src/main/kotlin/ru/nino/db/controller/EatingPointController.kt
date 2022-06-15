package ru.nino.db.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.nino.db.entity.EatingPoint
import ru.nino.db.repository.EatingPointRepository

@RestController
@RequestMapping("eatingPoint")
class EatingPointController @Autowired constructor(repository: EatingPointRepository) :
    AbsController<EatingPoint, EatingPointRepository>(repository) {

}