package scalagen

import scala.util.Random

object RNG {

	val rng = new Random

	def flip(value: Double) : Boolean = (rng.nextDouble < value)

	def flip : Boolean = flip(0.5)

	def rndBetween(min: Int, max: Int) : Int = {
		min +  rng.nextInt(max) 
	}

	def rndBetween(max: Int) : Int = rndBetween(0, max)
}
