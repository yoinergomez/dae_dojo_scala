
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/estudiantes/kodexx/dojo_scala/conf/routes
// @DATE:Sat Sep 23 09:33:13 COT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def listPlace(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "places")
    }
  
    // @LINE:16
    def removePlace(id:Int): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "places/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:15
    def updatePlace(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "places")
    }
  
    // @LINE:14
    def addPlace(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "places")
    }
  
    // @LINE:13
    def getPlaceById(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "places/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
