package test

import play.api.test._
import play.api.test.Helpers._
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class ImageContentControllerTest extends FlatSpec with ShouldMatchers {

  val cartoonUrl = "/commentisfree/cartoon/2013/jul/15/iain-duncan-smith-benefits-cap"
  val pictureUrl = "/artanddesign/picture/2013/oct/08/photography"

  "Image Content Controller" should "200 when content type is picture" in Fake {
    val result = controllers.ImageContentController.render(pictureUrl)(TestRequest())
    status(result) should be(200)
  }
  
  "Image Content Controller" should "200 when content type is cartoon" in Fake {
    val result = controllers.ImageContentController.render(cartoonUrl)(TestRequest())
    status(result) should be(200)
  }

}