# sbt scalafmt howto

The _sbt-scalafmt_ plugin is great for running scalafmt in sbt, but if you are new to _sbt_ and/or _scalafmt_, it may
not be super clear how to integrate this in as a compile time dependency.

Reference: https://scalameta.org/scalafmt/

# Execute scalafmtCheck

Let's suppose you want to automatically check the code style on compile, and fail if the code isn't in compliance with
your expections. Instead of wasting time during a code review, as well as having everyone on your team be consistent on
what that style is, the _sbt-scalafmt_ plugin can apply this for you.

TL;DR: `(Compile / compile) := (Compile / compile).dependsOn(scalafmtCheckAll).value`

# Background

As of _sbt-scalafmt_ 2.4.2, the document contains a _Task keys_ section, but if you are not familiar with all the ins
and outs of sbt (as I was), you might be confused on how this all works.

Reference: https://www.scala-sbt.org/1.x/docs/Task-Graph.html

Task keys are the (variable) names of the tasks to be performed. Hence, `(<BUILD-STEP>).dependsOn(taskKey).value` is the
construct used to invoke the task as part of a particular build step. Since we want this taskKey to be invoked on
compile, we reassign `(Compile / compile)` to itself plus the dependency.
