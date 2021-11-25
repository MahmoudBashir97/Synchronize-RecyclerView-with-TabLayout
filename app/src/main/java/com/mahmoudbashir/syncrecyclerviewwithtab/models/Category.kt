package com.mahmoudbashir.syncrecyclerviewwithtab.models

class Category(val name: String, vararg item: Item) {

    val listOfItems: List<Item> = item.toList()

}