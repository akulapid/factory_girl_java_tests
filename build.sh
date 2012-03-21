rm -rf out/
mkdir out
javac -cp .:/Users/akulasm/dev/jars/*.jar -d out/ $(find ./src/* | grep .java && find ./gen/* | grep .java)
