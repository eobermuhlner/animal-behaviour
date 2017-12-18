package ch.obermuhlner.animal.behaviour.simulation

class AnimalType(
        val name: String) {
    val behaviourTransitions = mutableListOf<BehaviourTransition>()

    fun initPredator() {
        behaviourTransitions.add(BehaviourTransition(
                null,
                Behaviour.Attack,
                Trigger.SmallerPrey,
                0.9
        ))
        behaviourTransitions.add(BehaviourTransition(
                null,
                Behaviour.Defend,
                Trigger.Attacked,
                0.9
        ))
    }

    fun initPrey() {

    }
}

data class BehaviourTransition(
        val startBehaviour: Behaviour?,
        val endBehaviour: Behaviour,
        val trigger: Trigger,
        val probabilityPerMinute: Double
    )