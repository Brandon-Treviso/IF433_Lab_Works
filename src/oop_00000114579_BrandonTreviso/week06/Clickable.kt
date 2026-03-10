package oop_00000114579_BrandonTreviso.week06

interface Clickable {
    val name: String // Abstract property, tidak ada nilai default
    fun click()
}

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}