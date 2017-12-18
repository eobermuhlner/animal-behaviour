package ch.obermuhlner.animal.behaviour.simulation

class Animal(
        val type: AnimalType) {

    var x: Double = 0.0
    var y: Double = 0.0
    var angle: Double = 0.0

    var behaviour: Behaviour = Behaviour.Rest
    var sinceMilliseconds: Long = 0
}