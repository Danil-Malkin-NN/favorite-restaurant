package ru.nino.db.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.nino.db.entity.Address
import ru.nino.db.repository.AddressRepository

@RestController
@RequestMapping("address")
class AddressController @Autowired constructor(repository: AddressRepository) :
    AbsController<Address, AddressRepository>(repository) {

}