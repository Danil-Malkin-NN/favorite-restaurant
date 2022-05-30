package ru.nino.client.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.nino.client.entity.Dish
import ru.nino.client.entity.EatingPoint
import ru.nino.client.repository.DishRepository
import ru.nino.client.repository.EatingPointRepository

@RestController
@RequestMapping("dish")
class DishController @Autowired constructor(repository: DishRepository) :
    AbsController<Dish, DishRepository>(repository) {
}




