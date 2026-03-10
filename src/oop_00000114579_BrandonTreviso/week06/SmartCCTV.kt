package oop_00000114579_BrandonTreviso.week06

class SmartCCTV (override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn(){
        println("CCTV dengan $name menyala")
    }
    override fun turnOff(){
        println("CCTV dengan $name mati")
    }
    override fun startRecord() {
        println("CCTV dengan nama $name merekam")
    }
}