Camel, spring-boot auto-configuration JPA & hibernate
===========================

This project is based on the great examples of the [Camel in Action](https://www.manning.com/books/camel-in-action-second-edition) 2nd edition book written by [Claus Ibsen](https://twitter.com/davsclaus) and [Jonathan Anstey](https://twitter.com/jon_anstey).
In particular https://github.com/camelinaction/camelinaction2/tree/master/chapter10/camel-cxf-rest-spring-boot

Problem
-----------------

  - I want to integrate Hibernate / JPA probably best via camel-JPA module with a hibernate backend.
As I am starting out with camel this may not be the right approach - please tell me if this is the case.
I experimented with the camel-sql component but spring could not load the datasource from the application configuration file

  - I want to integrate Hibernate without all the XML things so many tutorials show but rather opt for auto-configuration
and all the nice things of spring-boot.

  - The Order Objects should be persisted and saved during creation and retrieved on get

  - You can start a postgres database by simply executing `docker-compose up`
