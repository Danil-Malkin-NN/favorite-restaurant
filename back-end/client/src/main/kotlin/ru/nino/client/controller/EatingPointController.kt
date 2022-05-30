package ru.nino.client.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.nino.client.entity.EatingPoint
import ru.nino.client.repository.EatingPointRepository

@RestController
@RequestMapping("eatingPoint")
class EatingPointController @Autowired constructor(repository: EatingPointRepository) :
    AbsController<EatingPoint, EatingPointRepository>(repository) {

}