package ru.nino.client.repository

import org.springframework.stereotype.Repository
import ru.nino.client.entity.Point

@Repository
interface PointRepository : AbsRepository<Point> {

}