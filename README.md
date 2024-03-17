<h1>
    <img src="./docs/pattern-lock.png" width="35" height="35">
    DESIGN PATTERN: ABSTRACT FACTORY
</h1>
This repository contains a detailed case study on the Abstract Factory design pattern. The Abstract Factory pattern is one of the most important and widely used design patterns in software development. It provides an interface for creating families of related or dependent objects without specifying their concrete classes.

<h2>
    <img src="./docs/project-icon.png" width="25" height="25">
    About project
</h2>

<p>To exemplify this design pattern, a project representing a part of the business logic of a law firm management system was used. In this system, there are salaried and commissioned lawyers. This part of the system represents the functionality that issues the salary and history of these lawyers.
</p>

<h2>
    <img src="./docs/flow-chart.png" width="25" height="25">
    Class diagram
</h2>

<p align="center">
 <img src="./docs/d-class-abstract-factory.png" >
</p>

# Project structure

```
- 📁 src
  - 📁 main
    - 📁 java
      - 📁 com
        - 📁 example
          - 📁 implementations
            - 📄 CommissionedFactory.java
            - 📄 CommissionedPayroll.java
            - 📄 HistoricComissioned.java
            - 📄 HistoricSalaried.java
            - 📄 Lawyer.java
            - 📄 SalariedFactory.java
            - 📄 SalariedPayroll.java
        - 📁 interfaces
           - 📄 AbstractFactory.js
           - 📄 Historic.js
           - 📄 Payroll.js
        - 📁 resources
  - 📁 test
    - 📁 java
      - 📁 factoryTests
          - 📄 FactoryTests.java

```
