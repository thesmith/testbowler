package thesmith.testbowler

import org.bowlerframework.view.scalate._
import org.bowlerframework.Request

class Bootstrap{
  val parentLayout = DefaultLayout("default")

  def resolver(request: Request): Option[DefaultLayout] = Option(parentLayout)
  TemplateRegistry.defaultLayout = resolver(_)

  val controller = new MyController
	
  org.bowlerframework.view.scalate.RenderEngine.getEngine.allowCaching = true
  org.bowlerframework.view.scalate.RenderEngine.getEngine.allowReload = false
}