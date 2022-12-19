# Park Me- Projektseite

Schule: Stormarnschule  
Fach: Informatik  
Lehrer: Herr Buhl   
Zeitraum: 08.2022-12.2022  


## Inhaltsverzeichnis
1. [Der Beginn](https://github.com/juiceinlondon/Schulprojekt/blob/main/Projektseite.md#der-beginn)  
   - [Die Teammitglieder](https://github.com/juiceinlondon/Schulprojekt/blob/main/Projektseite.md#die-teammitglieder)
   - [Unsere bisherigen Erfahrungen beim Programmieren](https://github.com/juiceinlondon/Schulprojekt/blob/main/Projektseite.md#unsere-bisherigen-erfahrungen-beim-programmieren)
   - [Die Ideenfindung](https://github.com/juiceinlondon/Schulprojekt/blob/main/Projektseite.md#die-ideenfindung)
   - [Benutzte Programme und Programmiersprachen](https://github.com/juiceinlondon/Schulprojekt/blob/main/Projektseite.md#benutzte-programme-und-programmiersprachen)
2. [Das Spiel](https://github.com/juiceinlondon/Schulprojekt/blob/main/Projektseite.md#das-spiel)
   - [Was ist "Park Me"?](https://github.com/juiceinlondon/Schulprojekt/blob/main/Projektseite.md#was-ist-park-me)
   - [Bestandteile des Spiels](https://github.com/juiceinlondon/Schulprojekt/blob/main/Projektseite.md#bestandteile-des-spiels)  
3. [Eigene abschließende Bewertung](https://github.com/juiceinlondon/Schulprojekt/blob/main/Projektseite.md#eigene-abschlie%C3%9Fende-bewertung)


## Der Beginn  


### Die Teammitglieder
Direkt zu Beginn des Informatikunterrichtes im August 2022 haben wir, Joel Rosenberg und Lasse Prühs, uns dazu entschlossen, gemeinsam zu arbeiten. Da wir uns bereits im Vorfeld im Privaten über das Programmieren unterhalten haben, fiel uns diese Entscheidung sehr leicht. Außerdem teilen wir ähnliche Interessen im Bereich der Computerarbeit, weshalb wir uns sicher waren, dass unsere gemeinsame Arbeit sehr gut funktionieren wird.  


### Unsere bisherigen Erfahrungen beim Programmieren
In unserem Team war Joel derjenige, der zu Beginn die meisten Erfahrungen im Bereich des Programmierens mitbringen konnte. Im Privaten programmierte er bereits Bots auf der Plattform "Discord" und arbeitete an einem eigenen Spiel. Dies führte er in dem Programm "Unity" durch.  
Lasse hatte ebenfalls grundlegende Kenntnisse. Diese konnte er im Rahmen des Enrichment-Programmes in der achten Klasse sammeln. In seinem belegten Kurs programmierte er verschiedene Dinge, wie Lichtmuster, auf einen Raspberry-Pie. Dieser wurde an einem Fahrrad angebracht, welches die Lichtmuster abspielte. Dieses Projekt konnte er leider nie vollenden, da der Kurs aufgrund von Krankheit des Lehrers nach wenigen Wochen aufgelöst wurde.  
Trotz unserer verschiedenen Voraussetzungen waren wir von Anfang an sehr motiviert und freuten uns auf das, was wir in den nächsten Monaten erschaffen würden.  


### Die Ideenfindung
Von der ersten Stunde an waren wir uns einig, dass wir ein Spiel programmieren wollen. Dies ist auf unser gemeinsames Interesse an Online-Spielen zurückzuführen. Anschließend überlegten wir uns, was für eine Art Spiel wir programmieren wollen. Dabei dachten wir zunächst an ein klassisches 2D-Spiel aus dem Jump&Run-Bereich, welches ähnlich wie Super Mario aufgebaut sein soll. Allerdings wollten wir auch Elemente aus dem Escape Room-Genre in unser Spiel integrieren. Um diese Idee umzusetzen, schlug Joel das Programm "Unity" vor, da er hier bereits positive Erfahrungen sammeln konnte.  
Auf den Schulcomputern ist dieses Programm allerdings nicht installiert, weshalb wir uns anschließend nach neuen Möglichkeiten und Ideen umgesehen haben.  
Dabei kamen wir schnell auf die Idee eines Spiels, in dem der Spieler ein Auto steuert. Auf diese Idee kamen wir, da wir in unserer Freizeit gemeinsam ein Spiel spielen, welches primär mit Autos zu tun hat. Nach einigen Überlegungen, was dieses Auto nun tun soll, legten wir fest, dass man es in verschiedenen Welten einparken muss.  
Dieser Spielidee gaben wir den einfachen und prägnanten Namen: "Park Me"  
Damit war unser Projekt "Park Me" geboren und die Arbeit konnte beginnen.  


### Benutzte Programme und Programmiersprachen
Zur Umsetzung wählten wir das kostenlose und leicht zu erlernende Programm "Greenfoot", was primär durch die Auswahl an Programmen auf den Schulcomputern bedingt war.
Da "Greenfoot" die Programmiersprache Java verwendet, mussten wir uns mit dieser erst genauer befassen. Weder Joel, noch Lasse hatten bereits mit Java gearbeitet. Zum Erlernen gab uns Herr Buhl ein Einführungsbuch über "Greenfoot", welches wir in den ersten Wochen öfters benutzten. Außerdem nutzten wir das ["Greenfoot API"](https://www.greenfoot.org/files/javadoc/) (Application Programming Interface). Dies half uns in vielen Situationen, die Arbeitsweise und Sprache von "Greenfoot" zu verstehen.  
Zur Bearbeitung unserer Bilder (von Actor/Welt/Hintergrund etc.) nutzten wir das kostenlose Programm ["GIMP"](https://www.gimp.org/), welches ebenfalls bereits auf dem Computer installiert war. Die Arbeit in diesem Programm bestand primär darin, die verschiedenen Bilder in ihrer Größe und Rotation zu verändern. Außerdem schnitten wir die Bilder aus, da jedes Bild im Vorfeld von einem weißen Rand umzogen war, welcher optisch nicht in unser Spiel passte.  



## Das Spiel  


### Was ist "Park Me"?  
"Park Me" ist ein 2D Spiel, welches in der [Top-Down Perspektive](https://www.giantbomb.com/top-down-perspective/3015-788/) gespielt wird. Der Spieler steuert hier einen Krankenwagen. Dieser ist im Folgenden Bild dargestellt.  
![ambulance-n_Copy01](https://user-images.githubusercontent.com/111385267/208430268-16956322-7aa7-4497-9f44-773a795ab75c.png)  
Die Aufgabe des Spielers ist es, diesen Krankenwagen in bestimmten Parkplätzen einzuparken. Diese Parkplätze sind durch grüne Checkpoints dargestellt. Während des Ausführens dieser Aufgabe, wird der Spieler von verschiedenen Objekten und anderen Fahrzeugen blockiert. Wenn der Spieler eine Kollision mit einem anderen Objekt/Fahrzeug verursacht, dann ist das Spiel gescheitert und muss neu gestartet werden.  
Um möglichst viel Abwechslung zu bieten, hat unser Spiel vier verschiedene Level, welche sich jeweils in ihrem Schwierigkeitsgrad steigern. Um das Spiel erfolgreich abzuschließen, müssen alle Level hintereinander abgeschlossen werden. Ein Neustart des Spiels bewirkt, dass der Spieler erneut bei Level 1 startet.  



### Bestandteile des Spiels  
In unserem Spiel haben wir, wie bereits erwähnt, vier Level. Die ersten drei Level finden auf dem folgenden Parkplatz statt:   
![Parkplatz-Prototyp](https://user-images.githubusercontent.com/111385267/208446486-6d6377b9-92b4-4659-8712-3fb1ed7deace.png)  
Das vierte, finale Level spielt auf diesem Parkplatz:  
![Download](https://user-images.githubusercontent.com/111385267/208446800-87319c14-2982-45d4-951f-0570436972f1.png)  

In Level 1 befindet sich der Spieler auf einem freien Parkplatz. Der zu erreichende Parkplatz ist durch eine grüne, rechteckige Fläche markiert, welche wie folgt aussieht:  
![check](https://user-images.githubusercontent.com/111385267/208447566-d92604cd-ee17-4acc-850f-6a5ff782e901.png)  
Allerdings ist befindet sich diese Fläche nicht bei jedem Neustart auf demselben Parkplatz. Im Folgenden ist der Code zu sehen, welcher den Checkpoint zufällig auf einem der Parkplätze spawnt. Dies ist möglich, indem der Constructor die Differenz der x- und y-Koordinaten vom oberen linken Parkplatz zum Parkplatz rechts daneben und dem unteren linken Parkplatz mit einer zufälligen Zahl von 0-5 (in x-Richtung) und von 0-2 (in y-Richtung) multipliziert. Das selbe Prinzip wendeten wir bei allen weiteren Checkpoint an.   
```java
        int x = Greenfoot.getRandomNumber(5); 
        int y = Greenfoot.getRandomNumber(2); 
        
        addObject(new Checkpoint(), 218+123*(x), 403+183*(y-1));
```  
Das einzige Hindernis in Level 1 ist ein grünes Auto, welches auf einer festgelegten Route um die Parkplätze herumfährt. Im Folgenden ist der Quellcode für dieses Auto nachzulesen:  
```java
move(1%3);
        
        if(isAtEdge())
        {
            turn(-45);
        }
        
        if(getX() == 75 && getY() == 550)
        {
            setRotation(0);
        }
        
        if(getX() == 850 && getY() == 550)
        {
            setRotation(-90);
        }
        
        if(getX() == 850 && getY() == 80)
        {
            setRotation(-180);
        }
        
        if(getX() == 75 && getY() == 80)
        {
            setRotation(-270);
        }
```  
Wie hier zu erkennen ist, bewegt sich das Auto dauerhaft auf einer Linie weiter, bis es genau bestimmte Punkte in den Ecken der Welt erreicht. An diesen Ecken ändert es seine Fahrtrichtung, sodass sich das Auto auf der Bahn eines geschlossenen Rechtecks bewegt. Damit sieht das erste Level wie folgt aus:   
![Level1](https://user-images.githubusercontent.com/111385267/208451276-33df0413-06d4-4b8c-8fd7-d58c1d11167d.png)  
Die Steuerung des Krankenwagens funktioniert bei uns nach dem von [Dennis "Thresh" Fong](https://www.pcgameshardware.de/Spiele-Entwicklung-Thema-35261/News/WASD-Geschichte-1199800/) etablierten Layout: W,A,S,D. Der Quelltext der Steuerung ist im Folgenden dargestellt:  
 ``` java
 private void steuerung()
    {
                
        if(getX() == 850 && getY() == 450)
        {
            setRotation(-90);
        }
        
        
        if (Greenfoot.isKeyDown("a"))
        {
            if (Greenfoot.isKeyDown("w"))
                {
                    turn(-2);
                }
                
            if (Greenfoot.isKeyDown("s"))
                {
                    turn(-2);
                } 
        }

        
        if (Greenfoot.isKeyDown("d"))
        {
            if (Greenfoot.isKeyDown("w"))
                {
                    turn(2);
                }
            
            if (Greenfoot.isKeyDown("s"))
                {
                    turn(2);
                }  
        }
        
        if (Greenfoot.isKeyDown("w"))
        {
            move(2);
            
        }
        
        if (Greenfoot.isKeyDown("s"))
        {
            move(-2);
        }  
``` 

In Level 2 kommt lediglich ein gelbes Auto hinzu, welches nach dem selben Prinzip wie die Checkpoints zufällig auf einem der Parkplätze spawnt und somit die Schwierigkeit für den Spieler erhöht. Dabei prüft der Constructor außerdem, ob der Checkpoint bereits auf dieser Koordinate platziert wurde. Ist dies der Fall, dann wird ein neuer Parkplatz zufällig generiert.  










## Eigene abschließende Bewertung




 








  

