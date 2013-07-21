#!/usr/bin/awk -f

BEGIN { FS="\t" }

{
	printf( "<entry>\n" )
	printf( "\t<lat>%f</lat>\n", $1 )
	printf( "\t<long>%f</long>\n", $2 )
	printf( "\t<time>%f</time>\n", $3 )
	printf( "\t<alt>%f</alt>\n", $4 )
	print( "</entry>\n" )
}
