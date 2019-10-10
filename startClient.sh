#!/bin/bash

set -e

cd `dirname $0`
r=`pwd`
echo $r

# Client
cd $r/client
npm install
echo "Starting Angular Client..."
npm start
