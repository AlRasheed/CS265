#!/usr/bin/python

import sys

file = sys.argv[1]

fh = open( file, "r" )

data = {}

for line in fh :
	line = line.strip( "\n" )
	line = line.split( " ", 1 )

	for col in line[1:] :
		data[line[0]] = col


for key in sorted(data.keys(), key=int) :
	print str( key ).ljust(5)  + data[key]
