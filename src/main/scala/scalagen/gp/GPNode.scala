package scalagen.gp

abstract class GPExpr

case class Var(name: String) extends GPExpr
case class Constant(num: Double) extends GPExpr
case class UnaryOp(operator: String, arg: GPExpr) extends GPExpr
case class BinaryOp(operator: String, left: GPExpr, right: GPExpr) extends GPExpr

