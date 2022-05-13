package ru.nino.client.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import ru.nino.client.entity.AbsId
import ru.nino.client.repository.AbsRepository
import kotlin.reflect.full.createInstance

abstract class AbsController<
        E : AbsId,
        R : AbsRepository<E>>(
    private val repository: R
) {


    abstract fun test(): E

    @GetMapping
    fun getE(id: Long): E {
        return repository.getById(id)
    }

    @PostMapping
    fun save(@RequestBody entity: E): E {
        return repository.save(entity)
    }

    @DeleteMapping
    fun delete(id: Long): Boolean {
        return try {
            repository.deleteById(id)
            true
        } catch (e: Exception) {
            false
        }

    }


}