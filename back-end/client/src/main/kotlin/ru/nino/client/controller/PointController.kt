package ru.nino.client.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.nino.client.entity.Point
import ru.nino.client.repository.PointRepository

@RestController
@RequestMapping("Point")
class PointController @Autowired constructor(repository: PointRepository) :
    AbsController<Point, PointRepository>(repository) {

    @GetMapping("test")
    override fun test() = Point()


}