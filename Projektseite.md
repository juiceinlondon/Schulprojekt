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
"Park Me" ist ein 2D Spiel, welches in der [Top-Down Perspektive](https://www.giantbomb.com/top-down-perspective/3015-788/) gespielt wird. Der Spieler steuert hier einen Krankenwagen. Dieser ist im Folgenden Bild dargestellt:  
![ambulance-n_Copy01](https://user-images.githubusercontent.com/111385267/208430268-16956322-7aa7-4497-9f44-773a795ab75c.png)  
Die Aufgabe des Spielers ist es, diesen Krankenwagen in bestimmten Parkplätzen einzuparken. Diese Parkplätze sind durch grüne Checkpoints dargestellt. Während des Ausführens dieser Aufgabe, wird der Spieler von verschiedenen Objekten und anderen Fahrzeugen blockiert. Wenn der Spieler eine Kollision mit einem anderen Objekt/Fahrzeug verursacht, dann ist das Spiel gescheitert und muss neu gestartet werden.  
Um möglichst viel Abwechslung zu bieten, hat unser Spiel vier verschiedene Level, welche sich jeweils in ihrem Schwierigkeitsgrad steigern. Da viele unserer Hindernisse und Objekte zufällig an verschiedenen Orten gespawnt werden, bietet jedes Level bei jedem neuen Spielen eine anderes Erlebnis. Um das Spiel erfolgreich abzuschließen, müssen alle Level hintereinander abgeschlossen werden. Ein Neustart des Spiels nach dem Scheitern bewirkt, dass der Spieler erneut bei Level 1 startet.    



### Bestandteile des Spiels  
In unserem Spiel haben wir, wie bereits erwähnt, vier Level. Die ersten drei Level finden auf dem folgenden Parkplatz statt:   
![Parkplatz-Prototyp](https://user-images.githubusercontent.com/111385267/208446486-6d6377b9-92b4-4659-8712-3fb1ed7deace.png)  
Das vierte, finale Level spielt auf diesem Parkplatz:  
![Download](https://user-images.githubusercontent.com/111385267/208446800-87319c14-2982-45d4-951f-0570436972f1.png)  

In Level 1 befindet sich der Spieler auf einem freien Parkplatz. Der zu erreichende Parkplatz ist durch eine grüne, rechteckige Fläche markiert, welche wie folgt aussieht:  
![check](https://user-images.githubusercontent.com/111385267/208447566-d92604cd-ee17-4acc-850f-6a5ff782e901.png)  
Allerdings ist befindet sich diese Fläche nicht bei jedem Neustart auf demselben Parkplatz. Im Folgenden ist der Code zu sehen, welcher den Checkpoint zufällig auf einem der Parkplätze spawnt. Dies ist möglich, indem der Constructor die Differenz der x- und y-Koordinaten vom oberen linken Parkplatz zum Parkplatz rechts daneben und dem unteren linken Parkplatz mit einer zufälligen Zahl von 0-5 (in x-Richtung) und von 0-2 (in y-Richtung) multipliziert. Dasselbe Prinzip wendeten wir bei allen weiteren Checkpoints an.   
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

In Level 2 kommt lediglich ein gelbes Auto hinzu, welches nach demselben Prinzip wie die Checkpoints zufällig auf einem der Parkplätze spawnt und somit die Schwierigkeit für den Spieler erhöht. Dabei prüft der Constructor außerdem, ob der Checkpoint bereits auf dieser Koordinate platziert wurde. Ist dies der Fall, dann wird ein neuer Parkplatz zufällig generiert, sodass das Level schlussendlich potentiell wie folgt aussehen kann:  
![Level2](https://user-images.githubusercontent.com/111385267/208452998-a75d543e-e099-494e-8a2d-04bb4cfb1bd9.png)  

Im dritten Level steigert sich die Schwierigkeit erneut. Hier haben wir ein blaues Fahrzeug hinzugefügt, welches in der oberen rechten Ecke spawnt und nach demselben Prinzip wie das grüne Auto um den Parkplatz herumfährt. Außerdem befindet sich auf dem Parkplatz ein rotes Auto. Diese funktioniert wie das gelbe Auto. Allerdings prüft der Constructor außerdem, ob der Parkplatz bereits durch das gelbe Auto belegt wird. Gegebenenfalls sucht er dann einen neuen Parkplatz. Im Folgenden ist nun ein potentielles Level 3 zu erkennen:  
![Level3](https://user-images.githubusercontent.com/111385267/208454739-eefa8569-62e9-4165-b890-b76c1412b9da.png)  

Das letzte Level enthält den Krankenwagen, das grüne und blaue Auto und den Checkpoint. Außerdem befindet sich in der Mitte der Welt eine Barriere, welche als Grünfläche dargestellt ist. Diese darf der Spieler nicht berühren. Tut er dies, dann scheitert das Level und ein Abschleppwagen wird gespawnt. Dieser richtet sich anschließend auf den Krankenwagen aus und bewegt sich auf diesen zu. Berühren sich die Beiden, dann stoppt das Programm und das Spiel muss neugestartet werden. Außerdem spawnt auf dem Unfallwagen eine Rauchfahne und der Spieler wird mittels eines Bildes darüber informiert, dass ein Abschleppwagen gerufen wurde. Derselbe Vorgang wird bei jeder Kollision durch den Krankenwagen durchgeführt. Im Folgenden ist der Quellcode zur Kollision mit dem blauen Auto beispielhaft nachzulesen:  
``` java
public void CheckCollisionBC()
    {
            Bluecar bluecar;
            bluecar = (Bluecar) getOneIntersectingObject(Bluecar.class);
            
            if(bluecar != null && ! towTruckIsSpawned)
            {
                // System.out.println("GAME OVER!");
                Towtruck truck = new Towtruck(this);
                getWorld().addObject(truck, 218, 220);
                truck.setRotation(90);
                
                getWorld().addObject(new Boom(), getX(), getY());
                getWorld().addObject(new Endscreen(), 461, 313);
                
                towTruckIsSpawned = true;
               
             }   
                   
    }
```  
Ein weiteres Bestandteil ist das neue rote Auto. Dieses spawnt in der linken oberen Ecke und bewegt sich nach dem gleichen Prinzip wie das grüne und blaue Auto.  

Schließt der Spieler dieses Level ab, dann erreicht er den "Winscreen" und hat das Spiel somit durchgespielt. Dabei ist der "Winscreen" als eigene Welt eingefügt und wird konstruiert, wenn der Spieler mittig auf dem Checkpoint einparkt. Nach diesem Prinzip funktioniert bei uns jedes Level. Dies bedeutet, dass der Spieler nur ein neues Level erreicht, wenn er so einparkt, dass x- und y-Koordinaten des Checkpoints und des Krankenwagens übereinstimmen. Ist dies der Fall, dann wird ein neues Level mit einer leichten zeitlichen Verzögerung konstruiert.  
```java
 private void istGeparktLvl1()
    {

        Checkpoint cp = (Checkpoint) getOneIntersectingObject(Checkpoint.class);
        if (cp!= null)
        {
            int cpx= cp.getX();
            int cpy= cp.getY();
            
            if(Math.abs(getX()-cpx)<6 && Math.abs(getY()-cpy)<6 && ((Math.abs(getRotation()-90)<5) || Math.abs(getRotation()-270)<5) )
            {
            
                //Greenfoot.stop();
                Greenfoot.delay(30);
                Greenfoot.setWorld(new Parkplätze2() );
            }
        }  

        
    }
``` 
Hier ist beispielhaft die Erzeugung des zweiten Levels dargestellt. Das finale Level kann also wie folgt aussehen:  
![Level4](https://user-images.githubusercontent.com/111385267/208460379-d7163100-e555-429d-afe9-3989aea1d6d5.png)  


## Eigene abschließende Bewertung
Nach unserer viermonatigen Arbeit an unserem Spiel "Park Me" lässt sich zusammenfassend sagen, dass wir sehr zufrieden mit dem Resultat sind. Wir haben nicht nur ein Spiel mit mehreren Leveln und vielen Komponenten erschaffen, sondern auch persönlich Einiges gelernt. Wir hatten beide vor dem Beginn des Informatikunterrichts keine Erfahrung mit der Programmiersprache Java. Dies konnten wir durch unsere Arbeit definitiv ändern, sodass wir nun ein grundlegendes Wissen über Java haben. Unsere Arbeitsphasen liefen zum größten Teil sehr produktiv ab und aufgetretene Fehler konnten, teils durch die Hilfe von Herrn Buhl, behoben werden. Leider waren wir beide des Öfteren Krank, sodass einer von uns manchmal alleine arbeiten musste. Trotz dessen hatte jeder von uns immer etwas zu tun und hat stets konzentriert an unserem Spiel weitergearbeitet. Sei es die Arbeit an unseren Codes, die Arbeit auf Github oder die Arbeit an den visuellen Inhalten unseres Spiels.   
Der Informatikunterricht hat uns in diesen vier Monaten sehr viel Spaß gemacht. Er bot uns eine neue und unbekannte Abwechslung in unserem Schulalltag. Zudem konnten wir mit diesem Fach persönlich viel verbinden, da es private Interessen unsererseits direkt angesprochen hat.  
Für die kommende zweite Hälfte des Schuljahres haben wir bereits überlegt, ein neues Projekt im Bereich des [Physical Computings](https://de.wikipedia.org/wiki/Physical_Computing) zu beginnen. Genauere Ideen haben wir hierfür allerdings noch nicht entwickelt, was allerdings im Laufe der anstehenden Weihnachtsferien geschehen soll. 



 








  

