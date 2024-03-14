package com.example.naviuni.db

import androidx.room.TypeConverter
import com.example.naviuni.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        // Assuming Source has id and name properties
        return Source(name, name)
    }
}
