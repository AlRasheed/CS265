#!/bin/bash
# This script prints out the filename, # of lines and words to stdout

#for file in $(ls -l | rev | cut -d' ' -f1 | rev); do
for file in *; do
	if [[ -f "$file" ]]; then
		echo $file $(wc -l $file  | cut -d' ' -f1) $(wc -w $file  | cut -d' ' -f1)
	fi
done
