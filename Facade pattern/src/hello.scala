/**
  * Created by admin-k on 2016/4/7.
  */
object client extends App{
  /*
  //需要了解股票 國債 房地產等等具體買和賣 耦合性很高
  val gu1 = new stock1
  val gu2 = new stock2
  val gu3 = new stock3
  val nd1 = new NationalDebt1
  val rt1 = new Realty1
  //買
  gu1.buy()
  gu2.buy()
  gu3.buy()
  nd1.buy()
  rt1.buy()
  //賣
  gu1.sell()
  gu2.sell()
  gu3.sell()
  nd1.sell()
  rt1.sell()
  */
//外觀模式
  val fund = new Fund
  fund.buyFund()
  fund.sellFund()

}
