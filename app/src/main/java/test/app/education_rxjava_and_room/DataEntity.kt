package test.app.education_rxjava_and_room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataEntity(
    @PrimaryKey val dataId: Int,
    val name:String?,
    val price:Int?
)
