package edu.fetcher

import twitter4j.Query

import scala.collection.JavaConverters._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class TweetsFetcher {

  val fut: Future[List[MyTweets]] = Future {

    val countsValue = 5
    val query = new Query("#modi")
    query.setCount(countsValue)
    val list = ConfigBuilder.twitter.search(query)
    val tweets = list.getTweets.asScala.toList
    val allTweets = tweets.map {
      tweet => MyTweets(tweet.getText, tweet.getUser.getScreenName, tweet.getCreatedAt.toString)
    }
    allTweets
  }

}
