# ARWS_lab2_BBP-Formula

# Creador: Jimmy Armando Chirivi Nivia

# BBP Formula
This exercise contains an introduction to programming with threads in Java, in addition to the application to a specific case.

# Part I - Introduction to Java Threads
As reviewed in the readings, complete the CountThread classes, so that they define the life cycle of a thread that prints the numbers between A and B. 

Complete the main method of the CountMainThreads class so that: 

Create 3 threads of type CountThread, assigning the first one the interval [0..99], the second one [99..199], and the third one [200..299]. 

Start all three threads with start(). 

Run and check the output on screen. 

Change the beginning with start() to run(). How does the output change? Why?

RTA// 

Entre el metodo start() y run() el output si cambia 

En la implementacion del start() se evidencia que este metodo no es conviente utilizarlo en varios debido aque el output es dado intercaladamente, en cambio con el metodo run() este es conveniente debido a que este finaliza el proceso para darle paso al siguiente hilo.



# # #Dogs Race case 

# Part I

RTA//
![1.1] (https://raw.githubusercontent.com/jchirivi97/ARWS_lab2_BBP-Formula/master/imagenes/1.1.JPG)



! [1.1.2] (https://raw.githubusercontent.com/jchirivi97/ARWS_lab2_BBP-Formula/blob/master/imagenes/1.1.2.JPG)

Se evidencia que  el  proceso utiliza el 9 % del procesador 

![1.1] (https://raw.githubusercontent.com/jchirivi97/ARWS_lab2_BBP-Formula/master/imagenes/1.1.JPG)
