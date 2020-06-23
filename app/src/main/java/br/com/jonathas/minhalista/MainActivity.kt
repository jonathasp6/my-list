package br.com.jonathas.minhalista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import br.com.jonathas.minhalista.data.Item
import br.com.jonathas.minhalista.databinding.ActivityMainBinding
import br.com.jonathas.minhalista.mvp.ListPresenter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var listPresenter: ListPresenter = ListPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.addButton.setOnClickListener{
            addItem()
        }
    }

    private fun addItem() {
        val item = Item("teste1", 3)
        listPresenter.addItem(item)
        Toast.makeText(this, listPresenter.sizeList().toString(), Toast.LENGTH_SHORT).show()
    }
}