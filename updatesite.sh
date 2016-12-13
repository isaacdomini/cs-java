#!/bin/bash
echo "Copying all html files..."
cp -r target/site/apidocs/* . 
echo "Adding html files for staging."
git add *.html -f
git add com -f

