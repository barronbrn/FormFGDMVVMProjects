package com.example.formfgdmvvmprojects.model

data class AttendanceModel(
    val nama: String = "",
    val phone: String = "",
    val email: String = "",
    val gender: String = "",
    val skillset: List<String> = emptyList(),
    val kategori: String = ""
)
