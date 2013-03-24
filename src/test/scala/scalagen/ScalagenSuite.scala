package scalagen

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ScalagenSuite extends FunSuite {

    trait TestScalaGen {
      val gaGenome01 = true :: false :: true :: false :: Nil
      val gaGenome02 = true :: false :: false :: false :: Nil
      val gaGenome03 = false :: true :: true :: true :: Nil

      val bitString01 = "1010"
      val bitString02 = "1000"
      val bitString03 = "0111"

      val gaIndy01 = new GAIndividual(gaGenome01)
      val gaIndy02 = new GAIndividual(gaGenome02)
      val gaIndy03 = new GAIndividual(gaGenome03)

      val gaIndy04 = new GAIndividual(GAIndividual.fromStr(bitString01))
      val gaIndy05 = new GAIndividual(GAIndividual.fromStr(bitString02))
      val gaIndy06 = new GAIndividual(GAIndividual.fromStr(bitString03))
    }
  
	test("OneMax fitness function tests") {
	  new TestScalaGen {
	    val ff = new OneMaxFitnessFunction
	    gaIndy01.calculateFitness(ff)
	    assert(gaIndy01.fitness === 2)
	    
	    gaIndy02.calculateFitness(ff)
	    assert(gaIndy02.fitness === 1)
	    
	    gaIndy03.calculateFitness(ff)
	    assert(gaIndy03.fitness === 3)
	  }
	}
	
	test("GA Individual tests") {
	  new TestScalaGen {
  	  assert(gaIndy01.toString === bitString01)
  	  assert(gaIndy02.toString === bitString02)
  	  assert(gaIndy03.toString === bitString03)

      assert(gaIndy04.toString === bitString01)
      assert(gaIndy05.toString === bitString02)
      assert(gaIndy06.toString === bitString03)
	  }
	}

	test("GA Crossover tests") {

		new TestScalaGen {
			val op1 = new GAOperators(1, 1)
			// xover of identical individuals produces same individual
			assert(op1.xover(gaIndy01, gaIndy01).toString === gaIndy01.toString)
		}
	}
	
}
