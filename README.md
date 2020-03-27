## contrived-di-example

In a Nestjs project I'm working on they use Dependency Injection heavily, but it's hidden behind the scenes with framework magic. I wanted to understand how it was working, so I've created this small Java project in order to try and emulate what I THINK they're doing.

Here I'm also practicing Design Patterns / SOLID principles by utilising the Factory & Strategy Pattern in order to achieve Inversion of Control.

Benefits of using Dependency Injection;
- Separation of Concerns
- Configurable components making the application easily extendable (reducing rigidity)
- Unit testing made easy with mock objects
