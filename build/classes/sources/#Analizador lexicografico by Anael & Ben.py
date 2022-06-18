#Analizador lexicografico by Anael & Benjamín - Cervantes

import argparse
import ply.lex as lex
tokens=['DIGITO','LETRA','IDEN','DECIM','REAL','SUMA','RESTA','MULTIPLICAR','DIVISION','GORRITO','MENORQ','MENORI','MAYORQ','MAYORI','IGUALI','DIFERENTEI','IGUAL','PUNTOC','COMA','PARENTI','PARENTD','LLAVEI','LLAVED']
reserved= {
    'program' : 'PROGRAM',
    'if' : 'IF',
    'else' : 'ELSE',
    'fi' : 'FI',
    'do' : 'DO',
    'until' : 'UNTIL',
    'while' : 'WHILE',
    'read' : 'READ',
    'write' : 'WRITE',
    'float' : 'FLOAT',
    'int' : 'INT',
    'bool' : 'BOOL',
    'not' : 'NOT',
    'and' : 'AND',
    'or' : 'OR'
}
tokens += reserved.values()
#EXPRESIONES REGULARES

t_SUMA = r'\+'
t_RESTA = r'-'
t_MULTIPLICAR = r'\*'
t_DIVISION = r'/'
t_GORRITO = r'\^'
t_MENORQ = r'\<'
t_MENORI = r'\<\='
t_MAYORQ = r'\>'
t_MAYORI = r'\>\='
t_IGUALI = r'\=\='
t_DIFERENTEI = r'\!\='
t_IGUAL = r'\='
t_PUNTOC = r'\;'
t_COMA = r'\,'
t_PARENTI = r'\('
t_PARENTD = r'\)'
t_LLAVEI = r'\{'
t_LLAVED = r'\}'

def t_ID(t):
    r'[a-zA-Z_][a-zA-Z0-9_]*'
    if t.value in reserved:
        t.type = reserved[ t.value ]
    return t

def t_DECIM(t):
    r'\d+'
    t.value = int(t.value)    
    return t

def t_REAL(t):
    r'\d+.d+'
    return t

def t_newline(t): # SALTO DE LINEA
    r'\n+'
    t.lexer.lineno += len(t.value)

def t_error(t): # ERRORES
    print("Illegal character '%s'" % t.value[0])
    t.lexer.skip(1)

t_ignore  = ' \t' #IGNORAR ESPACIO Y TABULADOS

#CONSTRUIMOS EL LEXICOGRAFICO
lexer = lex.lex(optimize=1,lextab="footab")

# RECIBIMOS DATOS
parser = argparse.ArgumentParser()
parser.add_argument("-f","--file", help="Nombre de archivo")
args=parser.parse_args()
# Aquí procesamos lo que se tiene que hacer con cada argumento
if args.file:
     #print ("El nombre de archivo a procesar es: ", args.file)
     f = open(args.file,'r')
     data = f.read()
     #print(data)
     f.close
#data = '''int variable1,x,y,z;if(x==1)x=1;else x=0;fi'''
 
# Give the lexer some input
lexer.input(data)
 
 # Tokenize
while True:
    tok = lexer.token()
    if not tok: 
        break      # No more input
    print(tok)