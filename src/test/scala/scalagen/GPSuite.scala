package scalagen

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import 

@RunWith(classOf[JUnitRunner])
class GPSuite extends FunSuite {

	trait TestGP {

		val e1 = BinaryOp("*", BinaryOp("/", Constant(1), Constant(2)), 
                          BinaryOp("+", Var("x"), Constant(1)))		
	}

}