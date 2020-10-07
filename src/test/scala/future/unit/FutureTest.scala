package future.unit

import future.information
import future.information.getListOfFiles
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import org.scalatest.time.SpanSugar.convertIntToGrainOfTime

import scala.language.postfixOps
import scala.concurrent.Await
import scala.reflect.io.File

class FutureTest extends AnyFlatSpec with Matchers {
  behavior of "examle project"
  it should "give the name of directories/files" in {
    val a =information.getListOfFiles("/home/knoldus/IdeaProjects")
   val list= List(File("/home/knoldus/IdeaProjects/intern"),File("/home/knoldus/IdeaProjects/shradha.txt"))
    Await.result(a,5 seconds) shouldBe(list)
  }
  it should "copute result number" in {}
}
