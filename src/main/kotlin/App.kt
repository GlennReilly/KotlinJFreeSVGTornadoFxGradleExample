import javafx.application.Application
import javafx.application.Application.launch
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import javafx.scene.shape.SVGPath
import javafx.scene.shape.Polygon
import javafx.stage.Stage



fun main(args: Array<String>) {
    launch(HelloWorld::class.java)
}

class HelloWorld : Application(){

    override fun start(primaryStage: Stage?) {

        val svgPath: SVGPath = SVGPath().apply{
            content = "M 100 100 L 300 100 L 200 300 z"
            stroke = Color.ORANGE
            fill = Color.PURPLE
        }

        val svgPolygon = Polygon(200.0, 10.0, 250.0, 190.0, 160.0,210.0).apply {
            stroke = Color.ORANGE
            fill = Color.GREENYELLOW
        }



        val group = Group(svgPath)
        val group2 = Group(svgPolygon)

        val layout = VBox().apply{
            children.add(Label("Hello World"))
            children.add(group)
            children.add(group2)
            //children.add(ImageView("zim4.png"))
        }

        primaryStage?.run {
            scene = Scene(layout, 800.0, 800.0)
            show()
        }
    }

}