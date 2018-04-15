# Project Babel 2K

[![Build Status](https://travis-ci.org/bytecode-cn/v2ex-kotlin.svg?branch=master)](https://travis-ci.org/bytecode-cn/v2ex-kotlin)
[![License](https://img.shields.io/badge/License-BSD%203--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)

Project Babel 2K is an open source software package for creating and supporting communities. It's just an alternative backend implementation of [Project Babel 2](https://github.com/livid/v2ex) in Spring Boot Kotlin.

## Features(Building...)

* Topics are organized under Nodes (Discussion Areas), you can have many Nodes in one community
* Nodes can have header, foot and category property, or organized under Sections
* Two clean themes: one for desktop browser, another for iPhone and Android
* Optimized for modern browsers
* Built-in WebDAV avatar facility, you can host all avatars with MobileMe or other WebDAV servers
* Atom feed output
* HTML5
* Built-in MapReduce tasks for optimizing community data
* Built-in OAuth Twitter client for tweeting and syncing topics/replies
* Built-in Notes feature
* Gravatar support

## How to run

It's recommended to get the latest codebase of Project Babel 2K with git:

    git clone https://github.com/bytecode-cn/v2ex-kotlin.git
    
Then follow the steps:

`$ mvn spring-boot:run`

