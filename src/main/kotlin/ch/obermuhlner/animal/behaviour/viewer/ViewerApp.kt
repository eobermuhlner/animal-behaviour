package ch.obermuhlner.animal.behaviour.viewer

import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.canvas.Canvas
import javafx.scene.layout.BorderPane
import javafx.scene.paint.Color
import javafx.stage.Stage

class ViewerApp : Application() {

    override fun start(primaryStage: Stage) {
        val root = Group()
        val scene = Scene(root)

        val borderPane = BorderPane()
        root.children.add(borderPane)

        val simulationCanvas = Canvas(800.0, 600.0)

        borderPane.center = simulationCanvas

        primaryStage.scene = scene
        primaryStage.show()

        drawSimulation(simulationCanvas)
    }

    private fun  drawSimulation(canvas: Canvas) {
        val graphics = canvas.graphicsContext2D

        graphics.fill = Color.BLACK
        graphics.fill()


    }
}

fun main(args: Array<String>) {
    Application.launch(ViewerApp::class.java, *args)
}