package scalagen

trait FitnessFunction[T] {
	def calculate(genome: List[T]) : Double
}

class OneMaxFitnessFunction extends FitnessFunction[Boolean] {
	override def calculate(genome: List[Boolean]) : Double = genome.filter(_ == true).size
}