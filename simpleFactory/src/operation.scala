/**
  * Created by admin on 2016/2/27.
  */
class operation {
  //成員變數 //scala中會自動設好getter setter
  var numberA: Double = 0
  var numberB: Double = 0

  def GetResult(): Any = {
    val result = 0
    return result
  }
}

//加法繼承
class operationAdd
  extends operation {
  override def GetResult(): Double = {
    val result = {
      numberA + numberB
    }
    return result
  }
}

//減法繼承
class operationSub
  extends operation {
  override def GetResult(): Double = {
    val result = numberA - numberB
    return result
  }
}

//乘法繼承
class operationMul
  extends operation {
  override def GetResult(): Double = {
    val result = numberA * numberB
    return result
  }
}

//除法繼承
class operationDiv
  extends operation {
  override def GetResult(): String = {
    val result: Either[String, Double] = {
      if (numberB != 0) {
        Right(numberA / numberB)
      }
      else {
        Left("除數不能為零")
      }
    }
    return result.fold(_.toString, _.toString)
  }
}





