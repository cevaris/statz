import scala.io.Source

/**
 * Created by cevaris on 6/27/14.
 */
object Statz {

  def main(args: Array[String]) {
    for(line <- Source.fromFile("/data/fileA.txt").getLines())
      println(line)
  }

}
