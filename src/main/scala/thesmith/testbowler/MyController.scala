package thesmith.testbowler 

import org.bowlerframework.controller.Controller
import org.bowlerframework.model.{ ParameterMapper, Validations }
import org.bowlerframework.view.{ Renderable }

class MyController extends Controller with ParameterMapper with Validations with Renderable {
  
  get("/")((request, response) => {
      render
  })
}
