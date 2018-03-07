import org.scalatest._
@DoNotDiscover
class DemoTest extends FlatSpec with Matchers{

  "MyUtil" should "Divide 2 numbers" in {
    MyUtil.divide(10,5) should be (2)
  }

  it should "throw ArithmiticException if attemeped to divide by 0" in {
    a[java.lang.ArithmeticException] should be thrownBy {
      MyUtil.divide(10, 0)
    }
  }
  it should "let adults vote" in {
    MyUtil.canVote(18) should be (true)
  }

  it should "not let minors vote" in {
    MyUtil.canVote(16) should be (false)
  }
}
