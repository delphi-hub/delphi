# Delphi
A data curation platform for data collected on open-source software

## Motivation

For experiments researchers regularly require real-world code that fulfils specific requirements to be eligible to be included in an evaluation dataset.
These requirements can may be fairly complex to come by or compute.
Thus, a multitude of code projects have to be downloaded, inspected, and most of them will be discarded as not eligible.

Delphi is designed to help in these cases by providing a search interface to find open-source projects by various pre-computed criteria.

## Usage

The easiest way to Delphi will be to use our live version once it is up and running on:
https://delphi.cs.uni-paderborn.de

However, as Delphi is itself open-source software you can run your own service.
This source code repository bundles all of Delphi's components and provides an uniform way to compile, run, and package the system.

### Prerequisites

You need a running instance of [ElasticSearch](https://www.elastic.co/downloads/elasticsearch) on your local machine on port 9200.

### Running Delphi locally
After you started ElasticSearch, it is simply a matter of typing
```
sbt run
```
into your terminal. SBT will compile and start all necessary services to run Delphi.

## Components

### delphi-crawler

Repository: https://github.com/delphi-hub/delphi-crawler

### delphi-webapi
Repository: https://github.com/delphi-hub/delphi-webapi

### delphi-management
Repository: https://github.com/delphi-hub/delphi-management

### delphi-cli
Repository: https://github.com/delphi-hub/delphi-cli

### delphi-webapp
Repository: https://github.com/delphi-hub/delphi-webapp
