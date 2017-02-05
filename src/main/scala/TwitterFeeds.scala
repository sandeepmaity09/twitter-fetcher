
import twitter4j.conf.ConfigurationBuilder
import twitter4j.{Twitter, TwitterFactory}

object ConfigBuilder {

    val configurationBuilder = new ConfigurationBuilder()
    configurationBuilder.setDebugEnabled(false)
      .setOAuthConsumerKey(ConnectionKeys.consumerKey)
      .setOAuthConsumerSecret(ConnectionKeys.consumerSecretKey)
      .setOAuthAccessToken(ConnectionKeys.accessToken)
      .setOAuthAccessTokenSecret(ConnectionKeys.accessTokenSecret)

    val twitter: Twitter = new TwitterFactory(configurationBuilder.build()).getInstance()
}