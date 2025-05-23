package com.NotasBack.NotasFacil.DTO

import java.util.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class DisciplinaDTO(
    @field:NotBlank val nome: String,
    @field:NotNull val professorId: UUID
)

data class DisciplinaResponseDTO(
    val id: UUID,
    val nome: String,
    val professorNome: String
)

data class AlunoResponseDTO(
    val id: UUID,
    val nome: String
)
