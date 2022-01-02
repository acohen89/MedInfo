ExeName=MedInfo

$(ExeName): main.o
	g++ main.o -o $(ExeName)

main: main.cpp
	g++ -c main.cpp 

 clean:
	-rm *.o $(objects) $(ExeName)