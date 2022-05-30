package ru.nino.client.repository

import org.springframework.stereotype.Repository
import ru.nino.client.entity.Dish

@Repository
interface DishRepository : AbsRepository<Dish> {
}