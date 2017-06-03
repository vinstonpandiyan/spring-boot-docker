# spring-boot-docker
Spring-boot Docker example

[![Build Status](https://travis-ci.org/vinstonpandiyan/scala-play2-activiti-integration.svg?branch=master)](https://travis-ci.org/vinstonpandiyan/scala-play2-activiti-integration.svg?branch=master) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/78f6db9d16024552a7e9f3e9b781aec7)](https://www.codacy.com/app/vinstonpandiyan/scala-play2-activiti-integration?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=vinstonpandiyan/scala-play2-activiti-integration&amp;utm_campaign=Badge_Grade) [![DockerHub](https://img.shields.io/badge/docker-available-blue.svg)](https://hub.docker.com/r/vinston/spring-boot-tomcat/)

This is Spring-boot tomcat docker example,
## Build docker image
docker build -t vinston/spring-boot-tomcat .
## Run Docker image
docker run -P -d --name spring-boot-tomcat vinston/spring-boot-tomcat


# New Features!
  - Play 2.4’s AES encryption now uses initialization vectors to randomize each encryption.
  - The Play encryption format has been changed to add support for initialization vectors.

You can also:
  - Download and Use the GitHub project for your learning purpose
  - Refer Play2 Site for more info: [Play2 Crypto](https://www.playframework.com/documentation/2.5.x/CryptoMigration25#Use-of-Stream-Cipher-without-Authentication)

### Tech

Play2 Built-in Java Cryptographic Example uses a number of open source projects to work properly:

* [Play Framework](https://www.playframework.com/) - Play Framework makes it easy to build web applications with Java & Scala. Play is based on a lightweight, stateless, web-friendly architecture
* [AngularJS] - HTML enhanced for web apps!
* [node.js] - evented I/O for the backend
* [Gulp] - the streaming build system

### Installation
This example required the following tools to run
* [Play Framework](https://www.playframework.com/) v2.4+ to run.
* [SBT](http://www.scala-sbt.org/download.html) vsbt-0.12+ to run.
* [Node.js](https://nodejs.org/) v4+ to run.

Install the dependencies and devDependencies and start the server.
```sh
$ mkdir examples
$ cd examples
$ git clone ssh://git@github.com/vinstonpandiyan/scalaplay2aesexample.git
$ cd scalaplay2aesexample
$ sbt run
```

```sh
$ cd examples/app/website
$ npm install -d
$ node app
```

### Configuration
For using the play2 we need to generate the private key.
Use and run the following steps to create the private key and copy paste the play2 application.conf file
* Ex: play.crypto.secret="jhc_GPt:=uhJJYjEI00`5RkoB9C6kotmqb3iM9CVE]9jq:3t]>oOK2;MSzxmg?Uy"

```sh
$ sbt playGenerateSecret
```
OR

```sh
$ sbt play-generate-secret
```

For production environments...

```sh
$ npm install --production
$ npm run predeploy
$ NODE_ENV=production node app
```
### Development
Use IntelliJ scala editor tool to develop the application, it is sweet and elagant way of development friendly tool.
* Use Git to download the project
* And use Scala Play SBT plugin to run the project 
#### Use the following REST end point to test the AES crypto
* To Encrypt the text using play2 - http://127.0.0.1:9000/app/play/encrypt?text=TEST_TEXT
* To Decrypt the text using play2 - http://127.0.0.1:9000/app/play/decrypt?text=<ENCRYPTED _TEXT>
* To Encrypt the text using custom AES - http://127.0.0.1:9000/app/aes/encrypt?text=TEST_TEXT
* To Decrypt the text using custom AES - http://127.0.0.1:9000/app/aes/decrypt?text=<ENCRYPTED _TEXT>

#### CURL Example:
```sh
$ curl --request GET 'http://127.0.0.1:9000/app/play/encrypt?text=TEST_TEXT'
$ curl --request GET 'http://127.0.0.1:9000/app/play/decrypt?text=<ENCRYPTED _TEXT>'
$ curl --request GET 'http://127.0.0.1:9000/app/aes/encrypt?text=TEST_TEXT'
$ curl --request GET 'http://127.0.0.1:9000/app/aes/decrypt?text=<ENCRYPTED _TEXT>'
```

### Running Test Spec
```sh
$ cd scalaplay2aesexample
$ sbt test
```

#### Building for source
For production release:
```sh
$ sbt build --prod
```

### Docker
