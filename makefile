
JAVAC = javac -g
NOMBRE = Juegazo
sources = $(wildcard *.java)
classes = $(sources:.java=.class)

all: Compilar

Compilar: $(classes)
	jar cvf $(NOMBRE).jar $(classes) 

clean :
	rm -f *.class
	rm -f *.jar

%.class : %.java
	$(JAVAC) $<