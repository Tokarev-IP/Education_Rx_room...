package test.app.education_rxjava_and_room.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "data_table")
data class DataEntity(
    @PrimaryKey val dataId: Int,

    @ColumnInfo(name = "name")
    val name:String?,

    @ColumnInfo(name = "price")
    val price:Int?
)
