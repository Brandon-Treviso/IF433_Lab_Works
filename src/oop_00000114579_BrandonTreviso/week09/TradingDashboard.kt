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
}