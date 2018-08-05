package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) return 1
    pascal(c, r - 1) + pascal(c - 1, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    /**
      * This takes the list of characters and a flag as input
      *
      * Initially the flag is set to 0
      * When we encounter a starting brace, we increase the counter
      * and opposite is true for ending brace
      *
      * In the end, the flag should be 0
      **/
    def balance_(chars: List[Char], flag: Int): Boolean = {
      if (chars.isEmpty && flag == 0) return true
      if (chars.isEmpty && flag > 0) return false
      if (chars.head == '(') {
        return balance_(chars.tail, flag + 1)
      }
      if (chars.head == ')') {
        if (flag > 0) {
          return balance_(chars.tail, flag - 1)
        }
        // bracket sequence mismatch
        return false
      }

      // move to next char in list
      balance_(chars.tail, flag)
    }

    balance_(chars, 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    def countChange_(money: Int, coins: List[Int]): Int = {
      if (money == 0) return 1
      if (money < 0 || coins.isEmpty) return 0

      countChange_(money - coins.head, coins) + countChange_(money, coins.tail)
    }

    countChange_(money, coins)
  }
}
