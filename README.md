# Delphi <img src="https://github.com/delphi-hub/delphi/raw/master/img/delphi.png" align="right" height=140/>

A data curation platform for data collected on open-source software

[![Join the chat at https://gitter.im/delphi-hub/delphi](https://badges.gitter.im/delphi-hub/delphi.svg)](https://gitter.im/delphi-hub/delphi?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)


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
After you started ElasticSearch, you can run delphi by following the below steps

* Cloning the projects. Needs to be done only for the first time.
```
sbt clone-all
```
* After that, just use run command

```
sbt run
```
&nbsp;&nbsp;&nbsp;&nbsp;
into your terminal. SBT will compile and start all necessary services to run Delphi.

* Delphi components can be deleted in case all cloned components needs to be deleted using

```
sbt delete
```
&nbsp;&nbsp;&nbsp;&nbsp;
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
