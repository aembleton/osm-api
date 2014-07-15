name := "osm-api"

version := "1.0"


resolvers ++= Seq(
  "sonatype releases"  at "https://oss.sonatype.org/content/repositories/releases",
"sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
"typesafe repo"      at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies += "net.sandrogrzicic" %% "scalabuff-runtime" % "1.3.6"