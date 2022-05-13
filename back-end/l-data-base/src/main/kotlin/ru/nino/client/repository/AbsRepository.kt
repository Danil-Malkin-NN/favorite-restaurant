package ru.nino.client.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean
import ru.nino.client.entity.AbsId

@NoRepositoryBean
public interface AbsRepository<T : AbsId>
    : JpaRepository<T, Long>