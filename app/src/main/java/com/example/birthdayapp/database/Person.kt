package com.example.birthdayapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "person_table"
)
data class Person(
    @PrimaryKey(autoGenerate = true)
    var personId: Long = 0L,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "birthday_date")
    var birthdayDate: Long,

    @ColumnInfo(name = "phone")
    var phone: String
)