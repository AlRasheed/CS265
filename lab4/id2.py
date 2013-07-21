#!/usr/bin/python

import sys

data = {}
file = ''

if len(sys.argv) > 1 :
	file = sys.argv[1] 
	fh = open( file, "r" )
	for line in fh :
		line = line.strip( "\n" )
		line = line.split( " ", 1 )

		for col in line[1:] :
			data[line[0]] = col

else :
	file = sys.stdin
	line = file.readline()
	while line :
		line = line.strip( '\n' )
		line = line.split( " ", 1 )

		for col in line[1:] :
			data[line[0]] = col
		line = file.readline()
	print '\n'
		

#keys = data.keys();
#keys = [ int(x) for x in keys ]
#keys.sort()

for key in sorted(data.keys(), key=int) :
	print str( key ).ljust(5) + data[key]
