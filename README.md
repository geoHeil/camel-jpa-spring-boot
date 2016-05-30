Camel, spring-boot auto-configuration JPA & hibernate
===========================

This project is based on the great examples of the [Camel in Action](https://www.manning.com/books/camel-in-action-second-edition) 2nd edition book written by [Claus Ibsen](https://twitter.com/davsclaus) and [Jonathan Anstey](https://twitter.com/jon_anstey). 

![Camel in Action 2nd ed cover](/docs/images/cia2_cover150.jpg?raw=true), in particular
https://github.com/camelinaction/camelinaction2/tree/master/chapter10/camel-cxf-rest-spring-boot


Problem
-----------------

I want to integrate Hibernate / JPA probably best via camel-JPA module with a hibernate backend. 
As I am starting out with camel this may not be the right approach - please tell me if this is the case.

But I want to integrate Hibernate without all the XML things so many tutorials show but rather opt for auto-configuration 
and all the nice things of spring-boot.

You can start a postgres database by simply executing `docker-compose up`
