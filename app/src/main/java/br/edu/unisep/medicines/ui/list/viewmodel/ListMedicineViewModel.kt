package br.edu.unisep.medicines.ui.list.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.edu.unisep.medicines.data.db.MedicineDb
import br.edu.unisep.medicines.data.entity.Medicine
import kotlinx.coroutines.launch

class ListMedicineViewModel : ViewModel() {

    fun save() {
        viewModelScope.launch {
            val medicine = Medicine("Remedio de teste", 1, 1, 8)
            val dao = MedicineDb.instance.medicineDao()
            dao.save(medicine)
        }
    }

    fun list() {
        viewModelScope.launch {
            val dao = MedicineDb.instance.medicineDao()
            val result = dao.findAll()
            result.forEach { medicine ->
                println("${medicine.id} - ${medicine.name}")
            }
        }
    }
}