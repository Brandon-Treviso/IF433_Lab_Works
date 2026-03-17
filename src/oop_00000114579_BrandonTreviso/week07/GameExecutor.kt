package oop_00000114579_BrandonTreviso.week07

fun processEvent(event: BattleState){
    when (event) {
        is BattleState.MonsterEncounter ->
            println("Monster muncul: ${event.monsterName}")

        is BattleState.LootDropped ->
            println("Loot: ${event.item.name}")

        is BattleState.GameOver ->
            println("Game Over: ${event.reason}")

        BattleState.SafeZone ->
            println("Safe zone")

    }
}