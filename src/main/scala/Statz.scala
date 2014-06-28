import scala.io.Source

/**
 * Created by cevaris on 6/27/14.
 */
object Statz {

  class Summer {
    var result = 0.0;

    def add(x: Double): Double = {
      this.result = this.result + x;
      this.result
    }

    def apply (x: Int) = add(x)
    def apply (x: Double) = add(x)

  }

  class Average {
    var result = 0.0;

    def add(x: Double): Double = {
      this.result = this.result + x;
      this.result
    }

    def apply (x: Double) = add(x)

  }

  def main(args: Array[String]) {

    val s = new Summer()
    for(line <- Source.fromFile("/data/fileA.txt").getLines()){
      s.add(line.toDouble)
    }
    println(s.result)
  }

}
