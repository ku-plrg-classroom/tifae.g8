package kuplrg

object Implementation extends Template {

  import Expr.*
  import Value.*
  import Type.*

  def typeCheck(
    expr: Expr,
    tenv: TypeEnv,
    sol: Solution,
  ): (Type, Solution) = ???

  def resolve(ty: Type, sol: Solution): Type = ???

  def free(ty: Type, sol: Solution): Set[Int] = ???

  def interp(expr: Expr, env: Env): Value = ???
}
