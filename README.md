# Overview

This is a simple poc that
used [Spring Data](https://docs.spring.io/spring-data/elasticsearch/docs/4.2.4/reference/html/#new-features) integrated
with [Elasticsearch](https://www.elastic.co/)

# Testing

First, you need to open a terminal at the root of the application.

Second, you need to the [Docker Compose](https://docs.docker.com/compose/) running the command bellow:

```shell
docker-compuse up -d
```

Third, you need to start your application running the command bellow:

```shell
mvn clean spring-boot:run
```

Forth, to see if the application saved the model correctly you need to open the following URL

```shell
http://localhost:5000/#!/
```

# Cleaning up

First, you need to stop your application

Second, you need to stop [Docker Compose](https://docs.docker.com/compose/) running the command bellow:

```shell
docker-compuse stop -v
```

# Tips

## Elasticsearch GUI

To see [Elasticsearch](https://www.elastic.co/) data you can use
a [GUI](https://en.wikipedia.org/wiki/Graphical_user_interface)
called [ElasticHQ](http://docs.elastichq.org/index.html)!

## Testing health of Elasticsearch

To test if everthing is fine with the Elasticsearch you can run the command below:

```shell
    curl -X GET "localhost:9200/_cat/nodes?v=true&pretty"
```

# Be Happy