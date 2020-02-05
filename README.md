# Log Aggregation for Spring boot application using EFK Stack 

Sample Springboot Application demonstrating Log Aggregation using EFK Stack and Log4j. 

License : [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)



# Prerequsites:
	JAVA Version = 8 or higher
	Compute : CPU 4
	Memory : 8GB or higher
	Docker Enviornment available
    Docker enviornment with cache clear - network , volumes , images , containers.
    

## EFK Stack ( Elasticsearch Fluentd Kibana)
Fluentd is an open source data collector providing a unified logging layer, supported by 500+ plugins connecting to many types of systems.

Elasticsearch is a distributed, RESTful search and analytics engine.

Kibana lets you visualize your Elasticsearch data


Together, Fluentd, Elasticsearch and Kibana is also known as “EFK stack”. Fluentd will forward logs from the individual instances in the cluster to a centralized logging backend (CloudWatch Logs) where they are combined for higher-level reporting using ElasticSearch and Kibana.

## Architecture:

![alt text](https://github.com/dipsscor/Log-Aggregation-EFK-Stack/blob/master/screenshots/architecture.png) 



## References:

    https://github.com/patoi/springboot-fluentd-logging-example/blob/master/fluent.conf
    https://geowarin.com/spring-boot-logs-in-elastic-search-with-fluentd/
    https://docs.fluentd.org/v/0.12/container-deployment/docker-compose
    https://docs.docker.com/config/containers/logging/fluentd/
    
