package com.develoberke.strategypattern.example1.character

import com.develoberke.strategypattern.example1.weapon.WeaponBehaviour

class Queen(weaponBehaviour: WeaponBehaviour) : Character(weaponBehaviour) {
    override fun fight() {
        println("Quenn is fighting")
        weaponBehaviour.useWeapon()
    }
}
