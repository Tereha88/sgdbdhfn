fun main() {
    val name = "Madrigal"  // Никнэйм
    var healthPoints = 89  // Очки игрока
    val isBlessed = true   // Восстановление
    val isImmortal = false // Бессмертие
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal// Аура
    val auraColor = if (auraVisible) "GREEN" else "NONE"// Условия видимости ауры
    println(auraColor)
    val healthStatus = if (healthPoints == 100) " is in excellent condition!"
     else if (healthPoints in 90..99) " has a few scratches."
     else if (healthPoints in 75..99)
        if (isBlessed) " has some minor wounds but is healing quite quickly!"
        else " has some minor wounds."
     else if (healthPoints in 15..74) " looks pretty hurt."
     else " is in awful condition!"
     println("$name$healthStatus")// Состояние игрока
}