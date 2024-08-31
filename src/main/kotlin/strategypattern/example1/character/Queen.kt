package com.develoberke.strategypattern.example1.character

class Queen : Character() {

    override fun fight() {
        println("Quenn is fighting")
        weaponBehaviour.useWeapon()
    }
}