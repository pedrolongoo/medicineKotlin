package br.edu.unisep.medicines.data.dao

import androidx.room.*
import br.edu.unisep.medicines.data.entity.Medicine

@Dao
interface MedicineDao {

    @Insert
    suspend fun save(medicine: Medicine)

    @Update
    suspend fun update(medicine: Medicine)

    @Delete
    suspend fun delete(medicine: Medicine)

    @Query("select * from medicine")
    suspend fun findAll(): List<Medicine>

    @Query("select * from medicine where id = :medicineId")
    suspend fun findById(medicineId: Int): Medicine
}