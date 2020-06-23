package br.com.jonathas.minhalista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import br.com.jonathas.minhalista.data.Item
import br.com.jonathas.minhalista.databinding.ActivityMainBinding
import br.com.jonathas.minhalista.mvp.ListPresenter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val listPresenter: ListPresenter = ListPresenter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.addButton.setOnClickListener{
            addItem()
        }
    }

    private fun addItem() {
        val item = Item()
        val value : Editable = Editable.Factory.getInstance().newEditable("")
        binding.apply {
            item.name = binding.nameTxt.text.toString()
            item.amount = binding.amountTxt.text.toString().toInt()
            binding.invalidateAll()
            binding.nameTxt.text = value
            binding.nameTxt.requestFocus()
            binding.amountTxt.text = value
        }
        listPresenter.addItem(item)
        Toast.makeText(this, listPresenter.listItem.toString(), Toast.LENGTH_SHORT).show()
    }
}