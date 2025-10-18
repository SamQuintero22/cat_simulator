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
