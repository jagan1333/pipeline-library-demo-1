#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
}

def call(String name = 'Mobile') {
  echo "Cell, ${name}."
}

