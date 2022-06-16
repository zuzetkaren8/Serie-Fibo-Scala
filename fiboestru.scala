object fibo {
  
  def fibona(n: Int):Int = {
    var i = 0
    var x = -1
    var y = 1
    var z = 0
    var res = 0
  
    while( i < n ) {
        x = y
        y = z
        z = res
        res = x + y + z
        i = i + 1
  }
    return res
  }
  
  
  def fiboResu(n: Int):Unit = {
	 for (i <-0 to (n-1)){
	   System.out.print(fibona(i)+" ")
	 }
	}
  
  def main(args:Array[String]):Unit = {
    println("Introduce la cantidad de numeros que deseas de la secuencia de fibonacci: ")
    val n = scala.io.StdIn.readInt()
    print(fiboResu(n))
  }
}