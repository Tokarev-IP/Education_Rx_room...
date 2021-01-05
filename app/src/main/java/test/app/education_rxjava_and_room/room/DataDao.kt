package test.app.education_rxjava_and_room.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import io.reactivex.rxjava3.core.Completable

@Dao
interface DataDao {

    @Query("SELECT * FROM data_table")
    fun getAll(): List<DataEntity>

    @Query("SELECT name FROM data_table")
    fun getAllNames(): List<String>

    @Query("SELECT price FROM data_table")
    fun getAllPrices(): List<Int>

    @Insert
    fun insert(data: DataEntity)

    @Delete
    fun delete(data: DataEntity)

}