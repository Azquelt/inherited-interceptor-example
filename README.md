Small app to test behaviour of CDI when annotation bindings applied at the class-level are replaced by a subclass

## Overview

* `Bean1` is annotated with `@MyBinding(type="A")` and declares a method `public String service()`
* `Bean1A` extends `Bean1`, is annotated with `@MyBinding(type="B")` and declares no methods
* `InterceptorA` is annotated with `@MyBinding(type="A")`
* `InterceptorB` is annotated with `@MyBinding(type="B")`

The interesting question is whether the service method is intercepted by `InterceptorA` or by `InterceptorB` when it's called on an instance of `Bean1` and when it's called on an instance of `Bean1A`.

## Usage

1. Build and install the .war
1. Visit `/bean1` to test calling Bean1
1. Visit `/bean1a` to test calling Bean1A