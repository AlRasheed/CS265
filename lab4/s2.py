#!/usr/bin/python

import sys

file = sys.argv[1]

fh = open( file, "r" )

student_name = ''
average = 0
count = 0

for line in fh :
	line = line.split( "," )
	student_name = line[0]

	for col in line[1:] :
		average = average + int( col )
		count = count + 1

	print student_name.ljust(10) + " " + str( average/count ).rjust(5)
	average = 0
	count = 0

