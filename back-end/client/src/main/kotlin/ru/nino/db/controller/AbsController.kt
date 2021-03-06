package ru.nino.db.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import ru.nino.db.entity.AbsId
import ru.nino.db.repository.AbsRepository

abstract class AbsController<
        E : AbsId,
        R : AbsRepository<E>>(
    private val repository: R
) {

    @GetMapping
    fun getE(@RequestParam id: Long): E {
        return repository.getById(id)
    }

    @PostMapping
    fun save(@RequestBody entity: E): E {
        return repository.save(entity)
    }

    @DeleteMapping
    fun delete(@RequestParam id: Long): Boolean {
        return try {
            repository.deleteById(id)
            true
        } catch (e: Exception) {
            false
        }
    }

    @GetMapping("/all")
    fun getAll(): List<E> {
        return repository.findAll()
    }

    @DeleteMapping("/deleteAll")
    fun getAll(@RequestBody() listId: List<Long>) {
        return repository.deleteAllById(listId);
    }

}