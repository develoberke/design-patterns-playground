package com.develoberke.strategypattern.example1.character

import com.develoberke.strategypattern.example1.weapon.WeaponBehaviour

class Knight(weaponBehaviour: WeaponBehaviour) : Character(weaponBehaviour) {
    override fun fight() {
        println("Knight is fighting")
        weaponBehaviour.useWeapon()
    }
}
