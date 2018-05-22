# app1
A demo of building context by scanning base package "my.demo"

App1Config is a main class, annotated with: @SpringBootApplication(scanBasePackages = "my.demo")
dependencies lib1-lib3 are in the same root package "my.demo"

You can change context by including/excluding lib1-3 from dependencies.

Flow: need to have all modules in the same root package


