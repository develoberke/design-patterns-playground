package com.develoberke.strategypattern.example1.character

class Knight : Character() {
    override fun fight() {
        println("Knight is fighting")
        weaponBehaviour.useWeapon()
    }
}
