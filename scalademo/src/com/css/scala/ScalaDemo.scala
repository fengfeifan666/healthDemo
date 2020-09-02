package com.css.scala

object ScalaDemo {
  def main(arg: Array[String]): Unit = {
    //println("hello scala");
    //    1 to 9 map( (i)=>
    //    {
    //      1 to i map( (j) =>
    //        printf("%d*%d=%d\t",i,j,i*j)
    //        )
    //      println()
    //    })
    //    def add(a:Int,b:Int):Int=a+b
    //    println(add(1,4))
    /*
    def m1(x: Int): Int = {
      if (x == 1) 1
      else x * m1(x - 1)
    }
    println(m1(10))
    */
    /*
    def add(num: Int *) = num.sum
    println(add(12,45,34))

     */
    /*
    val add = (x:Int,y:Int) => x+y
    println(add(1,7))

     */
    //(x:Int, y: Int)=>{x+y}
    //println("hello scala")
    val map = Map("tom"->30,"lucy"->40);for((k, v) <- map) println(k + " -> " + v)
    println("------------------------")
    for(k <- map.keys) println(k + " -> " + map(k))

  }

}
