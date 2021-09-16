#!/bin/bash
while [ true ]; do
    curl -X GET "localhost:9200/_cat/nodes?v=true&pretty"
    sleep 3
done