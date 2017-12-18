package ch.obermuhlner.animal.behaviour.simulation

class Simulation {
    val animals = mutableListOf<Animal>()

    fun run(milliseconds: Long) {
        for (animal in animals) {

        }
    }
}

fun randomAnimal(type: AnimalType): Animal {
    val animal = Animal(type)

    animal.x = Math.random() * 1000
    animal.y = Math.random() * 1000
    animal.angle = Math.random() * 2 * Math.PI

    return animal
}

fun main(args: Array<String>) {
    val simulation = Simulation()

    val lion = AnimalType("Lion")
    val hyena = AnimalType("Hyena")
    val gazelle = AnimalType("Gazelle")
    val ox = AnimalType("Ox")

    for (i in 0..5) {
        simulation.animals.add(randomAnimal(lion))
        simulation.animals.add(randomAnimal(hyena))
    }
    for (i in 0..20) {
        simulation.animals.add(randomAnimal(gazelle))
    }
    for (i in 0..10) {
        simulation.animals.add(randomAnimal(ox))
    }
}
