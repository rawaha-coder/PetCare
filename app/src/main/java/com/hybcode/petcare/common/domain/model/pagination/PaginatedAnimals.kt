package com.hybcode.petcare.common.domain.model.pagination

import com.hybcode.petcare.common.domain.model.animal.details.AnimalWithDetails

data class PaginatedAnimals(
    val animals: List<AnimalWithDetails>,
    val pagination: Pagination
)