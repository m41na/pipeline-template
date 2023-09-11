#!/bin/bash
urlProtocol=
remoteUrl=$1

if [[ "$remoteUrl" =~ ^ssh ]]; then
  urlProtocol='ssh'
else
  urlProtocol='http'
fi

echo "remote url - $remoteUrl"
echo "using protocol $urlProtocol"
echo $urlProtocol