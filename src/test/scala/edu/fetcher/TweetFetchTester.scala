package edu.fetcher

import org.scalatest.FunSuite
import scala.concurrent.Await
import scala.concurrent.duration._

class TweetFetchTester extends FunSuite {

  val tester = new TweetsFetcher

  test("Future Working"){
    assert(Await.result(tester.fut,Duration.Inf)!=List[MyTweets]())
  }
}
