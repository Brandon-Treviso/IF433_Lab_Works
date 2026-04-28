package oop_00000114579_BrandonTreviso.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    val response = ApiResponse("200 OK", coinRepo.getAll())
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1000.0))

    println("Status: ${response.status}")

    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }
}
