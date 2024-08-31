package com.develoberke.strategypattern.example1.character

class King : Character() {

    override fun fight() {
        println("King is fighting")
        weaponBehaviour.useWeapon()
    }
}