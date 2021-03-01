object Main {

  // Simple example of gutter alignment issue.
  //
  // e.g.
  // {{{
  // /** Entrypoint.
  //   *
  //   * Look at this fabulous gutter alignment!
  //   */
  // }}}

  /** Entrypoint
   *
   * Yikes! Look at this gutter alignment.
   */
  def main(): Unit = {

    // Continuation lines should be indented two more spaces to the right.
    //
    // e.g.
    // {{{
    //   println(
    //     "qwerty ..." +
    //       "iopas"
    //   )
    // }}}
    println(
      "qwerty uiopas dfghjk lzxcvb nmqwer tyuio pasdf ghjklz xcvbnm qwerty uiopas dfghjk lzxcvb nmqwe rtyu " +
      "iopas dfghj"
    )
  } // def main

} // object Main
