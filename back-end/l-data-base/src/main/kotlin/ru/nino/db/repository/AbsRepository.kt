package ru.nino.db.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean
import ru.nino.db.entity.AbsId

@NoRepositoryBean
public interface AbsRepository<T : AbsId>
    : JpaRepository<T, Long>