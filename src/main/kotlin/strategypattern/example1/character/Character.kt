package com.develoberke.strategypattern.example1.character

import com.develoberke.strategypattern.example1.weapon.WeaponBehaviour

abstract class Character {

    lateinit var weaponBehaviour: WeaponBehaviour

    open fun fight() {
        weaponBehaviour.useWeapon()
    }

    fun setWeapon(weaponBehaviour: WeaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour
    }
}