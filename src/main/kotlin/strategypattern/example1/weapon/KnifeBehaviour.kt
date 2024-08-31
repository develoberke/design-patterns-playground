package com.develoberke.strategypattern.example1.weapon

class KnifeBehaviour : WeaponBehaviour {
    override fun useWeapon() {
        println("Stabbing with a knife")
    }
}