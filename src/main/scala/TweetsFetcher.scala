import twitter4j.Query

import scala.collection.JavaConverters._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object TweetsFetcher {

  val fut: Future[List[Any]] = Future {
    val query = new Query("#hot")
    //query.setCount(100)
    val list = ConfigBuilder.twitter.search(query)
    val tweets = list.getTweets.asScala
    tweets.toList
  }

  fut onComplete{
    case Success(list:List[Any]) => list.map(lis => lis.getTest + "\n")
    case Failure(lis) => "exit"
  }

}
