package com.hybcode.petcare.common.domain.model.animal.details


import com.hybcode.petcare.common.domain.model.animal.AdoptionStatus
import com.hybcode.petcare.common.domain.model.animal.Media
import com.hybcode.petcare.common.domain.model.organization.Organization
import org.threeten.bp.LocalDateTime

data class AnimalWithDetails(
    val id: Long,
    val name: String,
    val type: String,
    val details: Details,
    val media: Media,
    val tags: List<String>,
    val adoptionStatus: AdoptionStatus,
    val publishedAt: LocalDateTime
){
    data class Details(
        val description: String,
        val age: Age,
        val species: String,
        val breed: Breed,
        val colors: Colors,
        val gender: Gender,
        val size: Size,
        val coat: Coat,
        val healthDetails: HealthDetails,
        val habitatAdaptation: HabitatAdaptation,
        val organization: Organization)
}
