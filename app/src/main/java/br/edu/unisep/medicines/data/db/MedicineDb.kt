package br.edu.unisep.medicines.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.edu.unisep.medicines.data.dao.MedicineDao
import br.edu.unisep.medicines.data.entity.Medicine

@Database(
    entities = [Medicine::class],
    version = 1
)
abstract class MedicineDb : RoomDatabase() {

    abstract fun medicineDao(): MedicineDao

    companion object {
        private const val DATABASE_NAME = "db_medicine"
        private lateinit var mInstance: MedicineDb

        val instance
            get() = mInstance

        fun initialize(context: Context) {
            mInstance = Room.databaseBuilder(context, MedicineDb::class.java, DATABASE_NAME).build()
        }
    }
}