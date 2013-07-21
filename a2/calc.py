#!/usr/bin/python

import sys

file = ''

def main():
	if len(sys.argv) > 1 :
		file = sys.argv[1] 
		fh = open( file, "r" )
		for line in fh :
			line = line.strip( "\n" )
			line = "( " + line + " )"
			print line
			postfix = infix2postfix( line )
			evaluated_postfix = evalPostfix( postfix )
			print ' '.join( postfix ) + " = " + evaluated_postfix
	else :
		file = sys.stdin
		line = file.readline()
		line = line.strip( '\n' )
		line = "( " + line + " )"
		postfix = infix2postfix( line )
		evaluated_postfix = evalPostfix( postfix )
		print ' '.join( postfix ) + " = " + evaluated_postfix

def op_precedence( op ):
	if op == '*' or op ==  '/' or op == '%':
		return 1
	elif op is '+' or op == '-':
		return 0

def isOperator( op ):
	if op == '+' or op == '-' or op == '*' or op == '/' or op == '%':
		return 1
	else:
		return 0

def infix2postfix( infix ):
	postfix = []
	stack = []
	char = infix.split( ' ' )
	for i in char:
		if str(i) == "(" :
			stack.append( i )
		elif str(i) == ")" :
			popped_element = stack.pop()
			while popped_element != '(' :
				postfix.append( popped_element )
				popped_element = stack.pop()
		elif str(i) == '+' or str(i) == '-' or str(i) == '*' or str(i) == '/' or str(i) == '%':
			curr_precedence = op_precedence( i )
			#while len( stack ) != 0 and curr_precedence <= op_precedence( stack[-1] ):
			while len( stack ) != 0 and (isOperator(stack[-1])) and curr_precedence <= op_precedence( stack[-1] ):
				popped_element = stack.pop()
				postfix.append( popped_element )
			stack.append( i )
			#curr_precedence = 0
		elif str(i).isalnum() == True:
			postfix.append( i )
		elif str(i) == ' ':
			continue
	return postfix

def evalPostfix( postfix ):
	stack = []
	for char in postfix:
		if str(char).isalnum() == True:
			stack.append( char )
		elif isOperator( char ):
			a = int( stack.pop() )
			b = int( stack.pop() )
			if char == '%':
				evaluated_postfix = b % a
			elif char == '*':
				evaluated_postfix = b * a
			elif char == '/':
				evaluated_postfix = b / a
			elif char == '+':
				evaluated_postfix = b + a
			elif char == '-':
				evaluated_postfix = b - a
			stack.append( str(evaluated_postfix) )
	return stack.pop()





if __name__ == "__main__":
	main()
