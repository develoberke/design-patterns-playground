package com.develoberke.strategypattern.example1.weapon

class SwordBehaviour : WeaponBehaviour {
    override fun useWeapon() {
        println("Swinging a sword")
    }
}