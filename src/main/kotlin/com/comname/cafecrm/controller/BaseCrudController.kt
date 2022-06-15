package com.comname.cafecrm.controller

import com.comname.cafecrm.domain.dto.BaseDto
import com.comname.cafecrm.domain.dto.IdDto
import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

interface BaseCrudController<T : BaseDto> {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create empty entity")
    fun create(): IdDto

    @GetMapping("/{id}")
    @Operation(summary = "Get entity by ID")
    fun get(@PathVariable("id") id: Long): T

    @PatchMapping("/{id}")
    @Operation(summary = "Update entity")
    fun update(
        @PathVariable("id") id: Long,
        @RequestBody dto: T
    ): T

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Delete entity by ID")
    fun delete(@PathVariable("id") id: Long)

}