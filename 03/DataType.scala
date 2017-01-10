object DataType {
  def main(args:Array[String]) = {
    val byte: Byte = 0
    val short: Short = 0
    val int: Int = 0
    val long: Long = 0
    val char: Char = 'a'
    val string: String = "abc"
    val float: Float = 0.0f
    val double: Double = 0.0
    val boolean: Boolean = true
    
    println("default(Byte):", byte)
    println("default(Short):", short)
    println("default(Int):", int)
    println("default(Long):" + long.toString())
    println("default(Char):" + char.toString())
    println("default(String):" + string)
    println("default(Float):" + float.toString())
    println("default(Double):" + double.toString())
    println("default(Boolean):" + boolean.toString())
    
  }
}
