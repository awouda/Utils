package jtm.utils

import scala.math._

object MathUtils {
  def main(args: Array[String]): Unit = {

    println(dissolve(4))
    println(dissolve(-1643))
    println(dissolve(5))
    println(dissolve(Integer.MAX_VALUE - 1))
  }

  def dissolve(i: Int) = {
    def determine(factor: Int): (Int, Int) = {
      if (i % factor == 0) (factor, i / factor)
      else determine(factor - 1)
    }
    determine(floor(sqrt(abs(i))).intValue)
  }
}

