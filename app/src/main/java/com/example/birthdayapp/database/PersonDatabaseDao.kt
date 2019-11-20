package com.example.birthdayapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PersonDatabaseDao {

    @Insert
    fun insert(person: Person)

    @Update
    fun update(person: Person)

    @Query("SELECT * from person_table WHERE personId = :key")
    fun get(key: Long): Person

    @Query("DELETE FROM person_table")
    fun clear()

    @Query("SELECT * FROM person_table ORDER BY personId DESC")
    fun getAllPeople(): LiveData<List<Person>>

    @Query("SELECT * FROM person_table WHERE name LIKE :name")
    fun searchPeople(name: String): LiveData<List<Person>>
}