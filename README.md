Objetivo: Aplicar Strategy para modelar distintos tipos de maullido y desplazamiento en gatos.

# Consigna

* Cree una clase abstracta Cat con dos estrategias:

  MeowBehavior → define el método meow().

  MoveBehavior → define el método move().

* Cree algunas implementaciones concretas:

  LoudMeow, SilentMeow, PurringMeow.

  WalkBehavior, RunBehavior, LazyMoveBehavior.

* Cree subclases concretas de Cat:
  StrayCat, HouseCat, TigerCat.

* Cada gato debe poder cambiar su comportamiento dinámicamente.

* Implemente una clase CatPark que mantenga una lista de gatos y tenga métodos:

  makeAllMove()

  makeAllMeow()

* Escriba tests para:

  Verificar que cada gato usa su comportamiento inicial.

  Verificar que los comportamientos pueden cambiar en tiempo de ejecución.

  Verificar que CatPark aplica correctamente las estrategias de todos los gatos.
