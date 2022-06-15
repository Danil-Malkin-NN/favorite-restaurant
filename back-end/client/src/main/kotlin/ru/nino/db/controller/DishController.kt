package ru.nino.db.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.nino.db.entity.Dish
import ru.nino.db.repository.DishRepository

@RestController
@RequestMapping("dish")
class DishController @Autowired constructor(repository: DishRepository) :
    AbsController<Dish, DishRepository>(repository) {
}




