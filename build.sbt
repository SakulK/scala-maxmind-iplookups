/*
 * Copyright (c) 2012-2022 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */

lazy val root = project
  .in(file("."))
  .enablePlugins(SiteScaladocPlugin, PreprocessPlugin)
  .settings(
    organization := "com.snowplowanalytics",
    name := "scala-maxmind-iplookups",
    description := "Scala wrapper for MaxMind GeoIP2 library",
    scalaVersion := "3.3.0",
    crossScalaVersions := Seq("3.3.0", "2.13.10", "2.12.17"),
    javacOptions := BuildSettings.javaCompilerOptions,
    scalafmtOnCompile := true
  )
  .settings(BuildSettings.publishSettings)
  .settings(BuildSettings.docSettings)
  .settings(BuildSettings.coverageSettings)
  .settings(
    libraryDependencies ++= Seq(
      Dependencies.maxmind,
      Dependencies.cats,
      Dependencies.catsEffect,
      Dependencies.lruMap,
      Dependencies.specs2,
      Dependencies.specs2CatsEffect
    )
  )
