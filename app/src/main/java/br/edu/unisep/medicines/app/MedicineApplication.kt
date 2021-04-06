package br.edu.unisep.medicines.app

import android.app.Application
import br.edu.unisep.medicines.data.db.MedicineDb

class MedicineApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        MedicineDb.initialize(applicationContext)
    }
}