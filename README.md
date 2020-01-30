# ARWS_lab2_BBP-Formula

# Creador: Jimmy Armando Chirivi Nivia

# BBP Formula
This exercise contains an introduction to programming with threads in Java, in addition to the application to a specific case.

# Parte I - Introduction to Java Threads
As reviewed in the readings, complete the CountThread classes, so that they define the life cycle of a thread that prints the numbers between A and B. 

Complete the main method of the CountMainThreads class so that: 

Create 3 threads of type CountThread, assigning the first one the interval [0..99], the second one [99..199], and the third one [200..299]. 

Start all three threads with start(). 

Run and check the output on screen. 

Change the beginning with start() to run(). How does the output change? Why?

RTA// 

Entre el metodo start() y run() el output si cambia 

En la implementacion del start() se evidencia que este metodo no es conviente utilizarlo en varios debido aque el output es dado intercaladamente, en cambio con el metodo run() este es conveniente debido a que este finaliza el proceso para darle paso al siguiente hilo.



# Dogs Race case 

# Parte I

1. Por ahora, tiene un solo hilo que busca primos entre 0 y 30,000,000. Ejecútelo, abra el administrador de procesos del sistema operativo y verifique cuántos núcleos utiliza.

RTA//
![1 1](https://user-images.githubusercontent.com/48265107/73475223-f0408080-435d-11ea-848c-b225b724e62e.jpg)


![1 1 2](https://user-images.githubusercontent.com/48265107/73475307-15cd8a00-435e-11ea-9de9-ddf58e595047.jpg)

Se evidencia que  el  proceso utiliza el 9 % del procesador, con el uso de 2 nucleos

2. Resolver el problema con un solo hilo, hágalo con tres

![2 2 1](https://user-images.githubusercontent.com/48265107/73478854-d9e9f300-4364-11ea-96c9-e223e1f70ac8.PNG)

![2 2 2](https://user-images.githubusercontent.com/48265107/73478860-dc4c4d00-4364-11ea-86f8-92e9d73757db.PNG)

3. modificar la aplicación para que cuando hayan transcurrido 5 segundos desde que comenzó la ejecución, se detengan todos los subprocesos

![2 3 1](https://user-images.githubusercontent.com/48265107/73482088-13256180-436b-11ea-86e9-526f4032b60d.PNG)




