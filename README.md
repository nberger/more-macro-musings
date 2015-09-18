# more-macro-musings

Repository with the code for my post [_More portable (complex) macro musing_](http://blog.nberger.com.ar/blog/2015/09/18/more-portable-complex-macro-musing/)

Build must be passing: [![Circle CI](https://circleci.com/gh/nberger/more-macro-musings.svg?style=svg)](https://circleci.com/gh/nberger/more-macro-musings) :)

## Usage

The first commit is an original reduced version of the [juxt.iota/given](https://github.com/juxt/iota/blob/master/src/juxt/iota.cljc#L50) macro in clj.

The other 6 commits correspond to each of the tried alternatives in the post. The last one is the one that works :)

For each commit you can run the clojure tests with `lein test` and the cljs tests with `lein doo node node-test` (node >= 0.12 needed)

Clojure tests should work for every commit. ClojureScript tests will only work for two of them :)

## License

Copyright © 2015 Nicolás Berger

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
