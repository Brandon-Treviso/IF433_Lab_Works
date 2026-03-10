package oop_00000114579_BrandonTreviso.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Menyalakan Speaker $name")
    }
    override fun turnOff() {
        println("Mematikan Speaker $name")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}