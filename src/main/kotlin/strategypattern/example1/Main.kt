package com.develoberke.strategypattern.example1

import com.develoberke.strategypattern.example1.character.King
import com.develoberke.strategypattern.example1.character.Knight
import com.develoberke.strategypattern.example1.character.Queen
import com.develoberke.strategypattern.example1.weapon.AxeBehaviour
import com.develoberke.strategypattern.example1.weapon.BowAndArrowBehaviour
import com.develoberke.strategypattern.example1.weapon.SwordBehaviour

fun main() {
    val swordBehaviour = SwordBehaviour()
    val axeBehaviour = AxeBehaviour()
    val bowAndArrowBehaviour = BowAndArrowBehaviour()

    val knight = Knight(swordBehaviour)
    knight.fight()

    val king = King(axeBehaviour)
    king.fight()

    knight.setWeapon(axeBehaviour)
    knight.fight()

    val queen = Queen(bowAndArrowBehaviour)
    queen.fight()
}
