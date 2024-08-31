package com.develoberke.strategypattern.example1.character

import com.develoberke.strategypattern.example1.weapon.WeaponBehaviour

class King(weaponBehaviour: WeaponBehaviour) : Character(weaponBehaviour) {
    override fun fight() {
        println("King is fighting")
        weaponBehaviour.useWeapon()
    }
}
