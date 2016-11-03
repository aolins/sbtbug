/**
  * Created by a.olins on 03/11/2016.
  */
import org.apache.camel.builder.RouteBuilder
import org.apache.camel.impl.DefaultCamelContext
object FileCopier {
  def main(a: Array[String]) {
    println("hi")
    val context = new DefaultCamelContext()

    val r: RouteBuilder = new RouteBuilder() {
      override def configure(): Unit = from("file:/d/inbox?noop=true").to("file:/d/out")
    }
    context.addRoutes(r)

    context.start()
    Thread.sleep(10000)

  }
}