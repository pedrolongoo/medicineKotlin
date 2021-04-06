package br.edu.unisep.medicines.ui.list

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import br.edu.unisep.medicines.databinding.ActivityListMedicineBinding
import br.edu.unisep.medicines.ui.list.viewmodel.ListMedicineViewModel

class ListMedicineActivity : AppCompatActivity() {

    private val viewModel: ListMedicineViewModel by viewModels()

    private val binding: ActivityListMedicineBinding by lazy {
        ActivityListMedicineBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnInsert.setOnClickListener { viewModel.save() }
        binding.btnList.setOnClickListener { viewModel.list() }
    }
}