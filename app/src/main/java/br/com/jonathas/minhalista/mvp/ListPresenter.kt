package br.com.jonathas.minhalista.mvp

import br.com.jonathas.minhalista.data.Item

class ListPresenter {
    private var listItem = mutableListOf<Item>()

    fun addItem(item: Item) {
        listItem.add(item)
    }

    fun sizeList() : Int {
        return listItem.size
    }
}