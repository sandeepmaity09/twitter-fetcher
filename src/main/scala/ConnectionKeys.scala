import com.typesafe.config.ConfigFactory

object ConnectionKeys {

  val conf = ConfigFactory.systemEnvironment()
  val consumerKey = conf.getString("consumerKey")
  val consumerSecretKey = conf.getString("consumerSecretKey")
  val accessToken = conf.getString("accessToken")
  val accessTokenSecret = conf.getString("accessTokenSecret")
}
