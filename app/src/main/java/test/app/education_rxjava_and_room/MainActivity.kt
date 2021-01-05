package test.app.education_rxjava_and_room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import test.app.education_rxjava_and_room.room.DataDao
import test.app.education_rxjava_and_room.room.RoomDB

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_layout)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerView()

        val db = RoomDB.getDatabase(applicationContext)

        val wordDao: DataDao = db.dataDaoFun()
    }
}