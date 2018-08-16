
object worksheet {

  // 1. if nested conditionales

  val n = 6
  if (n == 5) {
    println("n vale 5")

  } else {

    println("No, n no vale 5")

    if (n == 6) {
      println("Bueno, pero vale 6")
    }
  }

  // 2. k vale 10

  var k = 10
  def inlineReturn(): String = if (k == 10) "k vale 10" else "k no vale 10"
  inlineReturn()

  // 3. switch equivalent (match), do note that match returns a value

  val mes = 1; // try an out of range exception
  mes match {
    case 1 => "enero"
    case 2 => "febrero"
    case _ => "ninguno"  // '_' == anything
  }

}
