package com.example.naviuni.models
data class Source(
    val id: String?,
    val name: String = ""
) {
    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }
}
