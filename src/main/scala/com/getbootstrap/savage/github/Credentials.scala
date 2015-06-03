package com.getbootstrap.savage.github

import com.jcabi.github.{Github, RtGithub}
import com.getbootstrap.savage.http.{UserAgent, SuperWire}

case class Credentials(username: String, password: String) {
  private def basicGithub: Github = new RtGithub(username, password)
  def github(threshold: Int)(implicit userAgent: UserAgent): Github = new RtGithub(basicGithub.entry.through(classOf[SuperWire], userAgent, new Integer(threshold)))
}
