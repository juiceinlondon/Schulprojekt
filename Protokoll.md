

### Park Me - Stundenprotokoll

# Inhaltsverzeichnis
| Stunde 1-11| Stunde 12-22|
| -------------------------- |-----------|
| [1. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#17082022)| [12. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#05102022)|
| [2. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#23082022)|[13. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#26102022)|
| [3. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#24082022)|[14. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#02112022)|
| [4. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#30082022)|[15. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#08112022)|
| [5. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#31082022)|[16. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#09112022)|
| [6. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#06092022)|[17. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#16112022)|
| [7. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#07092022)|[18. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#23112022)|
| [8. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#13092022)|[19. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#06122022)|
| [9. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#14092022)|[20. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#07122022)|
| [10. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#27092022)|[21. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#13122022)|
| [11. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#28092022)|[22. Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#14122022)|








## 17.08.2022

Heute haben wir unsere Idee zu einem 2D-basierten Spiel entwickelt. Dieses soll einen Touch von einem Jump&Run und einem Escape Room-Spiel haben.
Unsere Idee ist es, mit Unity zu arbeiten und dort gratis Assets f??r unser Spiel zu benutzen, damit wir mehr Zeit ins Entwickeln, als ins Animieren zu investieren. Diese Idee musste nach intensiver Absprache mit dem Lehrer verworfen werden. Nun m??ssen wir eine neue Idee entwickeln.



## 23.08.2022

In dieser Stunde kamen wir zu dem Entschluss, ein 2D-Parkplatz-Spiel zu programmieren. Hierzu nutzen wir das Programm Greenfoot. In diesem Spiel geht es darum, ein Fahrzeug in einen bestimmten Parkplatz zu bewegen. Dabei m??chten wir Level mit aufsteigender Schwierigkeit entwickeln, wie andere Fahrzeuge, die sich ebenfalls ??ber den Parkplatz bewegen, welche man nicht ber??hren darf. Als erstes ver??nderten wir ein 2D-Bild eines Parkplatzes so, dass es f??r unser erstes Level geeignet ist. Anschlie??end machten wir uns mithilfe des Greenfoot Buches mit den Grundmechaniken des Programmes vertraut.



## 24.08.2022

Die heutige Doppelstunde nutzten wir, um die wichtigsten Grundsteuerelemente f??r das Fahrzeug zu programmieren. Wie in den meisten Spielen ??blich, liegen bei uns die Befehle "vorw??rts, links, r??ckw??rts, rechts" auf den Tasten "w,a,s,d". Dabei kam das Problem auf, dass sich das Fahrzeug nicht wie von uns gedacht nach links und rechts bewegen konnte. Um die richtige Bewegung zu erm??glichen, legten wir fest, dass sich das Fahrzeug drehen soll, sobald der Spieler die Leertaste bet??tigt. Bisher ist es nur m??glich, das Fahrzeug zu drehen, wenn eine weitere Bewegungstaste bet??tigt wird. Zu dem dreht sich das Fahrzeug bei der ersten Bet??tigung der Leertaste nicht um -6??, sondern richtet sich sofort in die Richtung -6?? aus. Dieses Problem wollen wir sp??ter l??sen und uns nun auf das Erstellen von Spawn- und Zielpunkten konzentrieren.  



## 30.08.2022

Wie in der letzten Woche besprochen, war es heute unser Ziel, die Spawn- und Zielpunkte zu erstellen. F??r unser erstes Test-Level legten wir fest, dass unser Fahrzeug in der unteren rechten Ecke der Welt spawnen soll. Der Einfachheit halber platzierten wir das Zielfeld auf den naheliegendsten Parkplatz. Dieses Zielfeld, momentan noch braun dargestellt, liegt genau in der Parkfl??che und soll stets den zu erreichenden Parkplatz signalisieren. Anschlie??end haben wir versucht einen g??nstigen Punkt innerhalb des Feldes zu finden. Erreicht unser Auto nun diesen Punkt, ist das Level erfolgreich abgeschlossen. Da wir keine Koordinaten in unserer Welt anzeigen lassen konnten, mussten wir l??nger nach diesen perfekten Punkt suchen. 



## 31.08.2022 

Das erw??hnte Problem vom 24.08.2022 konnte heute, dank der Hilfe von Herrn Buhl, gel??st werden. Nachdem Herr Buhl sich unsere Bewegungselemente angeschaut hatte, war er der Ansicht, dass man die jeweiligen Codes besser schreiben k??nnte. Er ver??nderte sie zu unserem urspr??nglichen Code. Hier erkl??rten wir, dass wir dabei ebenfalls schwerwiegende Probleme mit der Bewegung hatten, weshalb wir den Code wieder ??nderten. Herr Buhl erkannte, dass das Bild des von uns gew??hlten Actors um 90?? nach rechts gedreht war, wodurch die Probleme w??hrend der Bewegung entstanden. Nun mussten wir das Bild lediglich im Editor um 90?? nach links drehen. 
Im Folgenden ist nur der momentane Code des Fahrzeuges zu sehen.
![Screenshot (1)](https://user-images.githubusercontent.com/111385267/188615644-b1e2afcb-710c-4e4e-b4cb-c29a27c440a2.png)
Den Rest der Stunde widmeten wir dem zuf??lligen Einf??gen von anderen Fahrzeugen. Kollidiert der Spieler w??hrend des Spielens mit ihnen, dann soll das Level scheitern. Dies setzten wir uns als Ziel f??r die n??chste Woche. 



## 06.09.2022

Da Joel heute krank war, arbeitete ich alleine weiter. Wie letzte Woche geplant, f??gte ich die Kollision mit anderen Objekten ein, was direkt funktionierte. Zudem bearbeitete ich das Aussehen des Fahrzeuges so, dass es in unsere Welt passt. Den Rest der Stunde habe ich die bisherigen Protokolle ??berarbeitet und mit Bildern unseres Codes unterlegt.



## 07.09.2022

Auch heute war Joel krank, somit fuhr ich alleine mit der Arbeit fort. Das heutige Ziel war es, dass sich das andere Fahrzeug zuf??llig bewegen kann. F??r diese Bewegung probierte ich verschiedene Methoden aus. Schlie??lich programmierte ich, dass sich dieses Fahrzeug dauerhaft um 4 Einheiten nach vorne bewegt. Gleichzeitig l??uft im Hintergrund ein Zahlengenerator, der eine Zahl zwischen 1 und 100 generiert. Ist diese Zahl kleiner als 20, dreht sich das Fahrzeug eine Einheit nach links. Ist die Zahl gr????er als 80, dreht es sich nach links. Andernfalls bewegt sich das Fahrzeug lediglich geradeaus weiter. Hierbei muss allerdings ??berarbeitet werden, dass sich das Fahrzeug nach einiger Zeit am Rand der Welt "festf??hrt". F??r das vorrangige Ziel, die Schwierigkeit des Levels zu erh??hen, ist die bisherige Funktionsweise jedoch ausreichend. 



## 13.09.2022

Heute war Lasse krank. Somit fuhr ich alleine fort und verwarf die Idee von Lasse, dass das "random" generierte Auto sich anhand einer zuf??lligen Zahl fortbewegt. Nun habe ich stattdessen Punkte gesetzt, die das Auto abf??hrt und sich an jeweiligen Ecken dreht. Dadurch f??hrt das Auto zwar nicht mehr zuf??llsm????ig. Es sieht aber fl??ssiger und realistischer aus. Au??erdem habe ich die Geschwindigkeit verringert und dem Auto hinzugef??gt, dass es, wenn es an das Ende der Welt st????t eine 90??-Drehung macht. Dies d??rfte aber nicht passieren, da das Auto ja einen vorbestimmten Weg abf??hrt.



## 14.09.2022

Heute war Lasse leider wieder krank. Deshalb habe ich mich daran gemacht erstmal einen Checkpoint, also einen Bereich, wo man das Auto parken muss zu erstellen. Dieser Checkpoint sollte au??erdem zuf??llig generiert werden innerhalb bestimmter Koordinaten. Dies habe ich mit Hilfe von Herrn Buhl entwickelt und konnte so die Grundlage daf??r schaffen nun den Checkpoint zu nutzen, daf??r dass man "gewonnen" hat, wenn man einparkt. Dies habe ich gemacht, indem ich die Koordinaten von dem Checkpoint in unserer Actor-Klasse abgefragt habe. Dann habe ich auch noch den Grad der Drehung abgefragt vom Actor, damit man mit einer 5??-Abweichung einparken darf.



## 27.09.2022

Heute zeigte Joel mir die neue Checkpoint-Mechanik und brachte mich auf den neusten Stand, was unser Spiel angeht. Anschlie??end sammelten wir verschiedene M??glichkeiten, mit dem Spiel fortzufahren. Entweder lassen wir das bisherige Level auf dem momentanen Stand und fokussieren uns auf ein neues Level, oder wir perfektionieren das bisherige. Wir entschieden uns f??r Letzteres.



## 28.09.2022

In der heutigen Doppelstunde hatten wir die Idee, ein weiteres Fahrzeug in das Spiel hinzuzuf??gen. Dies soll ein Abschleppwagen sein. Er spawnt in der Welt dann, wenn der Spieler, mit seinem Krankenwagen, mit dem gr??nen Fahrzeug kollidiert. Anschlie??end soll er sich in die Richtung des Unfalls drehen und dort hinbewegen. Mit der Umsetzung dieser Idee hatten wir allerdings Probleme, weshalb wir uns von Herrn Buhl helfen lassen haben. Er behob unsere Fehler und machte uns darauf aufmerksam, dass wir unsere Programmier-Schreibweise ??berarbeiten sollten.



## 05.10.2022

In dieser Doppelstunde war Joel krank, deshalb begann ich damit, die von Herrn Buhl angemerkten Fehler in unserer Schreibweise auszubessern. Nachdem dies erledigt war, widmete ich mich der Verbesserung des Abschleppwagens. Bisher war es so, dass sich das gr??ne Auto, nach der Kollision, dauerhaft weiterbewegt. Dadurch kollidierte es in jedem neuen Bild erneut mit dem Spieler, was dazu f??hrte, dass stetig neue Abschleppwagen spawnen. Hierdurch geriet das Programm sehr ins Stocken.
Folglich musste ich eine Methode finden, den Unfallwagen zu sagen, dass sie anhalten sollen. Ohne dabei das gesamte Programm zu pausieren. Gemeinsam mit Herrn Buhls Referendar fand ich heraus, dass wir hierf??r eine eigene Variable definieren m??ssen. Das Programm ??berpr??ft dann ob diese Variable true oder false ist. Ist sie false, dann l??uft das Spiel normal weiter. Ist sie hingegen true, dann stoppt das Programm die Bewegungen der Unfallwagen und l??sst nur den Abschleppwagen fahren.



## 26.10.2022

An diesem Tag war Joel erneut krank. Zun??chst ??berarbeitete ich das Aussehen unseres Levels, bzw. der Fahrzeuge. Da auf diesem Schul-PC leider kein Programm installiert ist, mit dem die richtige Bearbeitung m??glich ist, schickte ich die entsprechenden Bilder an Robert. Er hat dann auf seinem eigenen Laptop die Bilder nach unseren Anforderungen bearbeitet und an mich zur??ckgeschickt. 
Somit sah unser Level zum ersten Mal fertig aus. 
![Screenshot (7)](https://user-images.githubusercontent.com/111385267/197958603-c839b39b-5d51-44a1-b39f-ca9a07835b49.png)
Das einzige Problem ist momentan die dauerhafte Kollision der Autos. Dessen L??sung m??ssen wir uns in der n??chsten Woche widmen.



## 02.11.2022

Heute haben wir endlich das Problem gel??st. Herr Buhl kl??rte uns daf??r zun??chst ??ber verschiede Methoden auf. Die erste Methode war die, die Herr Buhls Referendar bereits erw??hnt hatte. Die zweite Methode war die "Singleton Methode". Dazu zeigte er uns zuerst ein Beispiel. Da wir dies nach eigenem Versuchen leider nicht selbst geschafft haben umzusetzen, zeigte uns Herr Buhl die erste Variante und wo sie einzusetzen ist. Dies setzten wir schlie??lich um. Nun war das erste Level wirklich fertig.



## 08.11.2022 

Heute hatte Joel ein Vorstellungsgespr??ch und konnte deshalb nicht am Unterricht teilnehmen. Also begann ich damit, ein neues Level zu erstellen. Dazu ??bernahm ich das Layout des ersten Levels. Um das zweite Level zu erreichen, muss der Spieler nun seinen Krankenwagen erfolgreich einparken. Geschieht dies, dann erzeugt der Krankenwagen das neue Level mit einem Delay von 30. In dieser neuen Welt spawnen nun der Spieler und das Greencar erneut.



## 09.11.2022

Um die Schwierigkeit mit jedem Level zu erh??hen, hatten wir heute die Idee, ein weiteres Auto hinzuzuf??gen. Es soll zuf??llig auf einem der Parkpl??tze spawnen und den Spieler behindern. Dabei nutzen wir dieselbe Methode wie f??r die Checkpoints. Hier trat allerdings das Problem auf, dass Checkpoint und Auto mit einer geringen Wahrscheinlichkeit an derselben Stelle spawnen. Mit der Hilfe von Herrn Buhl fanden wir hierf??r eine L??sung. Der Constructor pr??ft vor dem spawnen des Autos, ob dessen x- und y-Koordinaten dieselben sind. Ist dies der Fall, dann wird ein neuer Spawnpunkt auf den Parkpl??tzen generiert. Dies geschieht solange, bis die Koordinaten nicht identisch sind. Somit war das zweite Level fertig.



## 16.11.2022

Heute haben wir das dritte Level angefangen. Dazu gingen wir so wie beim zweiten Level vor und f??gten die bereits fertigen Fahrzeuge ein. Au??erdem f??gten wir ein weiteres Auto ein, welches ebenfalls um die Parkpl??tze herumf??hrt. Dieses lassen wir gegen??ber vom Greencar spawnen, damit der Spieler von beiden Seiten von sich bewegenden Fahrzeugen eingeschr??nkt wird. 



## 23.11.2022

In dieser Stunde stellten wir das dritte Level fertig. Au??erdem haben wir das Aussehen der neuen Fahrzeuge angepasst, sodass keine wei??en R??nder mehr vorhanden sind.
Anschlie??end begannen wir mit Level 4. Um ein wenig Abwechslung zu erzeugen, suchten wir uns dazu einen neuen 2D-Parkplatz aus dem Internet heraus. Dieser hat weniger Parkpl??tze, aber eine Gr??nfl??che in der Mitte. Unsere Vorstellung ist, dass das Spiel fehlschl??gt, wenn der Spieler diese ber??hrt.
![Screenshot (8)](https://user-images.githubusercontent.com/111385267/203496627-228cda42-6fb1-41bb-af58-3ea57a541eed.png)



## 06.12.2022

An diesem Tag war Joel krank. Au??erdem hat uns Herr Buhl genaueres ??ber die Abgabe erz??hlt. Diese wurde nun vom 15.12 auf den 19.12 verschoben. An diesem Tag sollen wir Herrn Buhl die Links zu unserem Stundenprotokoll und unserer Projektseite per E-Mail schicken. Das fertige Spiel wird in den Gruppenordner bei Isurf hochgeladen. Den Rest der Stunde habe ich die letzten Github-Eintr??ge ??berarbeitet und Bilder hinzugef??gt. 



## 07.12.2022 

Heute haben wir uns weiter mit unserem vierten Level besch??ftigt. Da dieser neue Parkplatz anders aufgebaut ist und eine Gr??nfl??che in der Mitte hat, mussten wir eine entsprechende Barriere erstellen, die die Ausma??e der Gr??nfl??che hat. Ber??hrt der Spieler diese Fl??che, dann ist das Spiel verloren. Dazu bearbeiteten wir mit GIMP ein Bild von Gras so, dass es die gewollte Form annimmt. Anschlie??end f??gten wir es als Actor in die Welt ein. Anschlie??end f??gten wir den Checkpoint in das Level ein. Zun??chst ermittelten wir daf??r die Koordinaten des Parkplatzes in der linken oberen Ecke und anschlie??end die Differenz der x- und y-Koordinaten zu den anliegenden Parkpl??tzen daneben und darunter. Nun setzten wir die ermittelten Werte in den Code f??r das Spawnen des Checkpoints aus Level 3 ein. Zuletzt verringerten wir den Multiplikator der x-Koordinaten auf 4, da in diesem Level ein Parkplatz weniger in x-Richtung vorhanden ist.    



## 13.12.2022

Heute war die vorletzte Stunde vor der Vollendigung des Projektes. Da Joel an der morgigen letzten Stunde nicht teilnehmen kann, wollten wir m??glichst viel schaffen, damit ich die morgige Stunde f??r letzte Verbesserungen im Code und dem Aussehen des Spiels nutzen kann. Folglich arbeiteten wir an Level 4. Unser Ziel war es, ein weiteres rotes Auto einzuf??gen, welches in der oberen linken Ecke spawnt und nach demselben Prinzip wie das gr??ne und blaue Auto funktioniert. Dazu ??bernahmen wir den Code des gr??nen Fahrzeuges. Erreicht das rote Auto nun die vorgegebenen Koordinaten in den Ecken der Welt, dann soll es jeweils um 90 Grad entgegen des Uhrzeigers rotieren. Dies erwies sich als sehr schwierig, da das Auto keine von uns programmierte Rotation durchgef??hrt hat. Nach einiger Zeit der L??sungssuche rotierten wir das Bild des Autos in GIMP und schrieben den Bewegungsbefehl des Autos an die letzte Stelle des Codes, hinter die Rotationsbefehle. Diese Kombination l??ste das Problem. Danach ??berabeiteten wir die Steuerung des Spielerfahrzeuges so, dass es sich nur nach links und rechts bewegen kann, wenn die Taste "w" oder "s" gleichzeitig gedr??ckt wird.
Den Rest der Stunde haben wir das Bild des roten Autos in der Gr????e und im Aussehen an unser Level angepasst. 



## 14.12.2022

An diesem Tag fanden die letzten 90 Minuten f??r die Arbeit an diesem Projekt statt. Wie bereits erw??hnt, konnte Joel an diesem Tag nicht am Unterricht teilnehmen. Zun??chst begann ich damit, das Ende des Spiels zu erstellen. Dazu erstellte ich einen Winscreen. Dieser wird angezeigt, wenn der Spieler das vierte Level erfolgreich absolviert und gratuliert dem Spieler zum Erfolg. Anschlie??end spielte ich unser Spiel mehrfach selbst durch und lie?? es ebenfalls von Mitsch??lern testen. Dabei funktioniert fast alles perfekt. Das einzig erkennbare Problem war, dass sich der Abschleppwagen unendlich im Kreis dreht, sobald er den Krankenwagen erreicht. Also f??gte ich ein, dass das Spiel beendet ist, sobald der Abschleppwagen den Krankenwagen ber??hrt. Resetet der Spieler nun unser Spiel, dann beginnt er erneut bei Level 1.
Anbschlie??end habe ich das Spiel in den Gruppenordner bei Isurf hochgeladen, sodass es f??r Herrn Buhl zu finden ist. 
Damit war die Arbeit an unserem ersten Informatik-Projekt beendet und ich begann mit unserer Projektseite.

