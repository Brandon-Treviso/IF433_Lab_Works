package oop_00000114579_BrandonTreviso.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)
