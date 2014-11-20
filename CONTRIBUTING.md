Hacking on Savage
=================
## How do I build Savage?
1. [Install sbt](http://www.scala-sbt.org/download.html)
2. Go to your `savage` directory.
3. Run `sbt compile`

## How do I run the Savage service locally for test purposes?
**This method is not recommended for use in production deployments!**

0. Ensure that sbt is installed (see above).
1. Go to your `savage` directory.
2. Run `sbt`
3. At the sbt prompt, enter `re-start 9090` (replace `9090` with whatever port you want the HTTP server to run on) or `re-start` (which will use the default port specified in `application.conf`). Note that running on ports <= 1024 requires root privileges (not recommended) or using port mapping.

## How do I generate a single self-sufficient JAR that includes all of the necessary dependencies?
0. Ensure that sbt is installed (see above).
1. Go to your `savage` directory.
2. Run `sbt assembly`
3. If the build is successful, the desired JAR will be generated as `target/scala-2.10/savage-assembly-1.0.jar`.

## Licensing
Savage is licensed under The MIT License. By contributing to Savage, you agree to license your contribution under [The MIT License](https://github.com/twbs/savage/blob/master/LICENSE.txt).
