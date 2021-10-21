fun main() {
    val name = "Madrigal"  // Никнэйм
    var healthPoints = 89  // Очки игрока
    val isBlessed = true   // Восстановление
    val isImmortal = false // Бессмертие
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal// Аура
    val auraColor = if (auraVisible) "GREEN" else "NONE"// Условия видимости ауры
    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        }
         else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
     println("$name$healthStatus")// Состояние игрока
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}