package test.app.education_rxjava_and_room

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

interface Dao {

    @Query("SELECT * FROM DataEntity")
    fun getAll()

    @Query("SELECT name FROM DataEntity")
    fun getAllNames()

    @Query("SELECT price FROM DataEntity")
    fun getAllPrices()

    @Insert
    fun insert(data: DataEntity)

    @Delete
    fun delete(data: DataEntity)

}