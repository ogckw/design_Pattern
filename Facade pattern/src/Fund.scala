/**
  * Created by admin-k on 2016/4/7.
  */
class Fund(){
  val gu1:stock1 = new stock1
  val gu2:stock2 = new stock2
  val gu3:stock3 = new stock3
  val nd1:NationalDebt1 = new NationalDebt1
  val rt1:Realty1 = new Realty1
  def buyFund(): Unit ={
    gu1.buy()
    gu2.buy()
    gu3.buy()
    nd1.buy()
    rt1.buy()
  }

  def sellFund():Unit={
    gu1.sell()
    gu2.sell()
    gu3.sell()
    nd1.sell()
    rt1.sell()
  }

}
