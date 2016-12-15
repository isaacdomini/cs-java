#!/bin/bash
# echo "Copying all html files..."
# cp -r target/site/apidocs/* .
# echo "Adding html files for staging."
# git add *.html -f
# git add com -f
#
echo "Generating javadoc using maven ..."
mvn javadoc:javadoc
if [ $? -eq 0 ]; then
  echo "Pushing javadoc to gh-pages branch ..."
  git add -f target/site/apidocs && git commit -m "Javadoc site update"
  git subtree push --prefix target/site/apidocs origin gh-pages
else
  echo "Unable to generate doc"
fi
