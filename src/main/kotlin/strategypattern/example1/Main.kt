package com.develoberke.strategypattern.example1

import com.develoberke.strategypattern.example1.character.King
import com.develoberke.strategypattern.example1.character.Knight
import com.develoberke.strategypattern.example1.character.Queen
import com.develoberke.strategypattern.example1.weapon.AxeBehaviour
import com.develoberke.strategypattern.example1.weapon.BowAndArrowBehaviour
import com.develoberke.strategypattern.example1.weapon.SwordBehaviour

fun main() {
    val knight = Knight()
    val swordBehaviour = SwordBehaviour()
    knight.setWeapon(swordBehaviour)

    knight.fight()

    val king = King()
    val axeBehaviour = AxeBehaviour()
    king.setWeapon(axeBehaviour)

    king.fight()

    knight.setWeapon(axeBehaviour)
    knight.fight()

    val queen = Queen()
    val bowAndArrowBehaviour = BowAndArrowBehaviour()
    queen.setWeapon(bowAndArrowBehaviour)

    queen.fight()
}