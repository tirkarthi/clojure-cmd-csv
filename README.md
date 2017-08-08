# cmd-csv

A simple TSV/CSV utility to process files and for benchmarking

## Usage

    $ wget -O data.gz https://storage.googleapis.com/books/ngrams/books/googlebooks-eng-all-1gram-20120701-0.gz
    $ gunzip -c data.gz > sample.tsv
    $ lein install
    $ lein uberjar
    $ java -jar cmd-csv-0.1.0-standalone.jar

## License

Copyright © 2017 Karthikeyan S

Distributed under the MIT License
