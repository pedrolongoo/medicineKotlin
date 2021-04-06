package br.edu.unisep.medicines.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "medicine")
data class Medicine(val name: String,
                    val amount: Int,
                    val unity: Int,
                    val frequency: Int) {

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
