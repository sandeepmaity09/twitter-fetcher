package edu.fetcher

import twitter4j.Query
import scala.collection.JavaConverters._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class TweetsFetcher{

  val fut:Future[List[MyTweets]]=Future {

    val query = new Query("#modi")
    query.setCount(5)
    val list = ConfigBuilder.twitter.search(query)
    val tweets = list.getTweets.asScala.toList
    //val text = tweets.map(tweet => tweet.getText)
    //val user = tweets.map(tweet => tweet.getUser.getScreenName)
    //val create = tweets.map(tweets => tweets.getCreatedAt)
    val allTweets = tweets.map {
      tweet => MyTweets(tweet.getText, tweet.getUser.getScreenName, tweet.getCreatedAt.toString)
    }
    allTweets
  }

}
