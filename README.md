# multi-module-demo
A demo of building multi-module maven project with pass-through versioning and conditionally enabled modules

* app1 -  building context by scanning base package, dependencies are the simple libraries of spring-annotated classes in the same top-level package
* app2 - building context from starters, no need to have them in the same top-level package. Starters used spring.factories to propagate context to external application.
* app3 - building context from starters. Starters used @ConditionalOnProperty for property-driven context configuration of external application.

 I believe that app3 is the most suitable approach
