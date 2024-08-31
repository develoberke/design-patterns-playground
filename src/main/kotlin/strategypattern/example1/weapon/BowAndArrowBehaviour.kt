package com.develoberke.strategypattern.example1.weapon

class BowAndArrowBehaviour : WeaponBehaviour {
    override fun useWeapon() {
        println("Shooting an arrow with a bow")
    }
}