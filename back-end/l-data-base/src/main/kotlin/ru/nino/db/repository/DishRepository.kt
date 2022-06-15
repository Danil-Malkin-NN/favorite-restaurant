package ru.nino.db.repository

import org.springframework.stereotype.Repository
import ru.nino.db.entity.Dish

@Repository
interface DishRepository : AbsRepository<Dish> {
}