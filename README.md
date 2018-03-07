# Project Babel 2K

Project Babel 2K is an open source software package for creating and supporting communities. It's just an alternative backend implementation of [Project Babel 2](https://github.com/livid/v2ex) in Spring Boot Kotlin.

[V2EX](http://v2ex.appspot.com/), a community about sharing and discovering interesting stuff of the world, is proudly powered by Project Babel 2.

## Features

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

## Installation

It's recommended to get the latest codebase of Project Babel 2K with git:

    git clone https://github.com/bytecode-cn/v2ex-kotlin.git
    
Then follow the steps:

`$ mvn spring-boot:run`

If you have any questions or feature requests, feel free to discuss it in official development node at V2EX:

[http://v2ex.appspot.com/go/babel](http://v2ex.appspot.com/go/babel)

## Troubleshooting

## FAQ

### Why I got an error page says it needs index?

For newly deployed App Engine app, it took some time for Google to build indexes so that your data can be fast accessed. It usually take up to an hour to build all indexes required for a new installation of Project Babel 2.

### How about performance?

According to our actual operation data, Project Babel 2 is able to support 100,000 pageviews under App Engine free quota. If you don't mind enabling billing, Project Babel 2 is able to support large sites with millions pageviews/day as long as you have enough budget for traffic.

Performance is always our area of focus, we'll keep improving it.
