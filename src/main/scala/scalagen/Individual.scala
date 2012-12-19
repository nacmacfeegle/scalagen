package scalagen

/**
 * Base trait for an EA individual. 
 */
trait Individual[T] extends Ordered[Individual[T]] {
  private var ftns = -1.0d
	def fitness = ftns
	def genotype : List[T]
	
	def compare(that: Individual[T]) : Int = (this.fitness - that.fitness).toInt 
	override def toString = genotype.mkString(" ")

	def calculateFitness(ff: FitnessFunction[T]) {
		ftns = ff.calculate(genotype)
	}
}

// GA stuff
class GAIndividual[T](val genes: List[T]) extends Individual[T] {

  override def toString = {
    genes.map{x => x match {
  	  case x:Boolean => if (x) "1" else "0"
  	  case x:Any => x
  	}}.mkString("")
  }
  
  override def genotype = genes

}

object GAIndividual {
  def fromStr(bs: String) : List[Boolean] = {
    bs.toList.map(bitToBool)
  }
  def bitToBool(ch: Char) : Boolean = {
    if(ch == '1') true 
    else false
  }
}

// GP Stuff
class GPIndividual[T](val genes: List[T]) extends Individual[T] {
  override def genotype = genes
}