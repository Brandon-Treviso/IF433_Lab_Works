package oop_00000114579_BrandonTreviso.week06

class SmartLamp (override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Menyalakan lampu $name")
    }
    override fun turnOff() {
        println("Mematikan lampu $name")
    }
}