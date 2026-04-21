package oop_00000114579_BrandonTreviso.week09

fun main() {
    val tradeHistory = listOf(
        Tradelog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        Tradelog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        Tradelog("BTCUSDT", "SHORT", 15, -10.0, "CLOSED"),
        Tradelog("ETHUSDT", "LONG", 20, 25.0, "CLOSED"),
        Tradelog("XRPUSDT", "LONG", 5, 0.0, "OPEN"),
        Tradelog("SOLUSDT", "SHORT", 10, -3.5, "CLOSED")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val uniquePairs = tradeHistory.map { it.pair }.toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }

    println("\n=== TOP PERFORMANCE ===")
    topPerformersString.forEach { println(it) }

    println("\n=== WORST PERFORMANCE ===")
    worstPerformersString.forEach { println(it) }

}