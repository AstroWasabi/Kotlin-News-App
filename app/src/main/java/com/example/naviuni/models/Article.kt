package com.example.naviuni.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "articles")
data class Article(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val author: String? = "",
    val content: String? = "",
    val description: String? = "",
    val publishedAt: String? = "",
    val source: Source? = Source("", ""), // Provide a default Source instance
    val title: String? = "",
    val url: String? = "",
    val urlToImage: String? = ""
) : Serializable