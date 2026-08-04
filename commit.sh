#!/bin/bash
IFS=$'\n'

if [ ! -f 'comentario.txt' ];then
  echo "Arquivo Readme.md nao encontado."
  exit
fi

#if [ -n "$(git ls-files --others --exclude-standard)" ];then
#  for f in $(git ls-files --others --exclude-standard);do
#    git add $f
#  done
#fi

git pull
git commit -a -m "$(cat comentario.txt|head -n 1)"
git push