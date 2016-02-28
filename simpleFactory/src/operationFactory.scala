/**
  * Created by admin on 2016/2/27.
  */
object operationFactory {
  def operationCreate(operator: String): operation = {
    var oper: operation = null
    operator match {
      case "+" =>
        oper = new operationAdd()
      case "-" =>
        oper = new operationSub()
      case "*" =>
        oper = new operationMul()
      case "/" =>
        oper = new operationDiv()
    }
    return oper
  }
}
