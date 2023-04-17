package example

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class TestSpec extends AnyWordSpec with Matchers {
  "Patter match" should {
    "return values without default case" in {
      Test.hasMoreThanTwo(Seq()) shouldBe false
      Test.hasMoreThanTwo(Seq(1)) shouldBe false
      Test.hasMoreThanTwo(Seq(1, 2)) shouldBe false
      Test.hasMoreThanTwo(Seq(1, 2, 3)) shouldBe true
      Test.hasMoreThanTwo((1 to 10)) shouldBe true
      Test.hasMoreThanTwo((1 until 1000)) shouldBe true
      Test.hasMoreThanTwo((1 to 1000)) shouldBe true
    }
  }
}
