package br.com.jonathas.minhalista.mvp

import br.com.jonathas.minhalista.data.Item

class ListPresenter {
    val listItem = mutableListOf<Item>()

    fun addItem(item: Item) {
        listItem.add(item)
    }
}