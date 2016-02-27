/**
  * Created by admin on 2016/2/27.
  */
object simpleFactory extends App {
  try {
    println("請輸入數字A: ")
    val enterNumberA = io.Source.stdin.getLines().next()
    println("你輸入了 " + enterNumberA)
    println("請輸入運算符號(+,-,*,/): ")
    val enterOper = io.Source.stdin.getLines().next()
    println("你輸入了 " + enterOper)
    println("請輸入數字B: ")
    val enterNumberB = io.Source.stdin.getLines().next()
    val oper = operationFactory.operationCreate(enterOper)
    println("你輸入了 " + enterNumberB)
    oper.numberA = enterNumberA.toDouble
    oper.numberB = enterNumberB.toDouble
    val result = oper.GetResult()
    println(result)
  }catch{
    case e:Throwable => print("別亂輸入"+ e.getMessage)
  }
}
