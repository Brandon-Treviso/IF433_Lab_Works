package oop_00000114579_BrandonTreviso.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance <= amount) {
            balance -= amount
            println("Pembayaran berhasil menggunakan EWallet. Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup di EWallet")
        }
    }
    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo sekarang: $balance")
    }
}