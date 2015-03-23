package com.larroy.ibclient.handler

import com.larroy.ibclient.{Tick, MarketDataSubscription}
import rx.lang.scala.Subject

/**
 * @author piotr 20.02.15
 */
case class MarketDataHandler(subscription: MarketDataSubscription, subject: Subject[Tick]) extends Handler {
  override def error(throwable: Throwable): Unit = {
    subject.onError(throwable)
  }
}
