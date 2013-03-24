package scalagen

import common._

trait Operators {

	def mutate[T](indy: Individual[T]): Individual[T]  = ???

	def xover[T](mom: Individual[T], dad: Individual[T]): Individual[T] 

}

class GAOperators(val xoverRate: Double, val mutationRAte:Double) extends Operators {

	override def xover[T](mom: Individual[T], dad: Individual[T]): Individual[T] = {

		// single point xover
		def doXover[T](mom: Individual[T], dad: Individual[T]): Individual[T] = {

			val cutpoint = RNG.rndBetween(1, mom.genotype.size-1) 
			val genes = mom.genotype.splitAt(cutpoint)._1 ::: dad.genotype.splitAt(cutpoint)._2

			val child = new GAIndividual(genes)
			child
		}


		if (RNG.flip(xoverRate)) doXover(mom, dad) else mom

		
	}
}