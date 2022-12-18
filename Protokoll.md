

### Park Me - Stundenprotokoll

# Inhaltsverzeichnis

[1.Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#17082022)
[2.Stunde](https://github.com/juiceinlondon/Schulprojekt/blob/main/Protokoll.md#23082022)
[3.Stunde]
[4.Stunde]
[5.Stunde]
[6.Stunde]
[7.Stunde]
[8.Stunde]
[9.Stunde]
[10.Stunde]
[11.Stunde]
[12.Stunde]
[13.Stunde]
[14.Stunde]

## 17.08.2022

Heute haben wir unsere Idee zu einem 2D-basierten Spiel entwickelt. Dieses soll einen Touch von einem Jump&Run und einem Escape Room-Spiel haben.
Unsere Idee ist es, mit Unity zu arbeiten und dort gratis Assets für unser Spiel zu benutzen, damit wir mehr Zeit ins Entwickeln, als ins Animieren zu investieren. Diese Idee musste nach intensiver Absprache mit dem Lehrer verworfen werden. Nun müssen wir eine neue Idee entwickeln.

## 23.08.2022

In dieser Stunde kamen wir zu dem Entschluss, ein 2D-Parkplatz-Spiel zu programmieren. Hierzu nutzen wir das Programm Greenfoot. In diesem Spiel geht es darum, ein Fahrzeug in einen bestimmten Parkplatz zu bewegen. Dabei möchten wir Level mit aufsteigender Schwierigkeit entwicklen, wie andere Fahrzeuge, die sich ebenfalls über den Parkplatz bewegen, welche man nicht berühren darf. Als erstes veränderten wir ein 2D-Bild eines Parkplatzes so, dass es für unser erstes Level geeignet ist. Anschließend machten wir uns mithilfe des Greenfoot Buches mit den Grundmechaniken des Programmes vertraut.

## 24.08.2022

Die heutige Doppelstunde nutzten wir, um die wichtigsten Grundsteuerelemente für das Fahrzeug zu programmieren. Wie in den meisten Spielen üblich, liegen bei uns die Befehle "vorwärts, links, rückwärts, rechts" auf den Tasten "w,a,s,d". Dabei kam das Problem auf, dass sich das Fahrzeug nicht wie von uns gedacht nach links und rechts bewegen konnte. Um die richtige Bewegung zu ermöglichen, legten wir fest, dass sich das Fahrzeug drehen soll, sobald der Spieler die Leertaste betätigt. Bisher ist es nur mögich das Fahrzeug zu drehen, wenn eine weitere Bewegungstaste betätigt wird. Zu dem dreht sich das Fahrzeug bei der ersten Betätigung der Leertaste nicht um -6°, sondern richtet sich sofort in die Richtung -6° aus. Dieses Problem wollen wir später lösen und uns nun auf das Erstellen von Spawn- und Zielpunkten konzentrieren.  

## 30.08.2022

Wie in der letzten Woche besprochen war es heute unser Ziel, die Spawn- und Zielpunkte zu erstellen. Für unser erstes Test-Level legten wir fest, dass unser Fahrzeug in der unteren rechten Ecke der Welt spawnen soll. Der Einfachheit halber platzierten wir das Zielfeld auf den naheliegendsten Parkplatz. Dieses Zielfeld, momentan noch braun dargestellt, liegt genau in der Parkfläche und soll stets den zu erreichenden Parkplatz signalisieren. Anschließend haben wir versucht einen günstigen Punkt innerhalb des Feldes zu finden. Erreicht unser Auto nun diesen Punkt, ist das Level erfolgreich abgeschlossen. Da wir keine Koordinaten in unserer Welt anzeigen lassen konnten, mussten wir länger nach diesen perfekten Punkt suchen. 

## 31.08.2022 

Das erwähnte Problem vom 24.08.2022 konnte heute, dank der Hilfe von Herrn Buhl, gelöst werden. Nachdem Herr Buhl sich unsere Bewegungselemente angeschaut hatte, war er der Ansicht, dass man die jeweiligen Codes besser schreiben könnte. Er veränderte sie zu unserem ursprünglichen Code. Hier erklärten wir, dass wir dabei ebenfalls schwerwiegende Probleme mit der Bewegung hatten, weshalb wir den Code wieder änderten. Herr Buhl erkannte, dass das Bild des von uns gewählten Actors um 90° nach rechts gedreht war, wodurch die Probleme während der Bewegung entstanden. Nun mussten wir das Bild lediglich im Editor um 90° nach links drehen. 
Im Folgenden ist nur der momentane Code des Fahrzeuges zu sehen.
![Screenshot (1)](https://user-images.githubusercontent.com/111385267/188615644-b1e2afcb-710c-4e4e-b4cb-c29a27c440a2.png)
Den Rest der Stunde widmeten wir dem zufälligen Einfügen von anderen Fahrzeugen. Kollidiert der Spieler während des Spielens mit ihnen, dann soll das Level scheitern. Dies setzten wir uns als Ziel für die nächste Woche. 

## 06.09.2022

Da Joel heute krank war, arbeitete ich alleine weiter. Wie letzte Woche geplant, fügte ich die Kollision mit anderen Objekten ein, was direkt funktionierte. Zudem bearbeitete ich das Aussehen des Fahrzeuges so, dass es in unsere Welt passt. Den Rest der Stunde habe ich die bisherigen Protokolle überarbeitet und mit Bildern unseres Codes unterlegt.

## 07.09.2022

Auch heute war Joel krank, somit fuhr ich alleine mit der Arbeit fort. Das heutige Ziel war es, dass sich das andere Fahrzeug zufällig bewegen kann. Für diese Bewegung probierte ich verschiedene Methoden aus. Schließlich programmierte ich, dass sich dieses Fahrzeug dauerhaft um 4 Einheiten nach vorne bewegt. Gleichzeitig läuft im Hintergrund ein Zahlengenerator, der eine Zahl zwischen 1 und 100 generiert. Ist diese Zahl kleiner als 20, dreht sich das Fahrzeug eine Eihneit nach links. Ist die Zahl größer als 80, dreht es sich nach links. Andernfalls bewegt sich das Fahrzeug lediglich geradeaus weiter. Hierbei muss allerdings überarbeitet werden, dass sich das Fahrzeug nach einiger Zeit am Rand der Welt "festfährt". Für das vorrängige Ziel, die Schwierigkeit des Levels zu erhöhen, ist die bisherige Funktionsweise jedoch ausreichend. 

## 13.09.2022

Heute war Lasse krank. Somit fuhr ich alleine fort und verwarf die Idee von Lasse, dass das "random" generierte Auto sich anhand einer zufälligen Zahl fortbewegt. Nun habe ich stattdessen Punkte gesetzt, die das Auto abfährt und sich an jeweiligen Ecken dreht. Dadurch fährt das Auto zwar nicht mehr zufällsmäßig. Es sieht aber flüßiger und realistischer aus. Außerdem habe ich die Geschwindigkeit verringert und dem Auto hinzugefügt, dass es, wenn es an das Ende der Welt stößt eine 90°-Drehung macht. Dies dürfte aber nicht passieren, da das Auto ja einen vorbestimmten Weg abfährt.

## 14.09.2022

Heute war Lasse leider wieder krank. Deshalb habe ich mich daran gemacht erstmal einen Checkpoint, also einen Bereich, wo man das Auto parken muss zu erstellen. Dieser Checkpoint sollte außerdem zufällig generiert werden innerhalb bestimmter Koordinaten. Dies habe ich mit Hilfe von Herrn Buhl entwickelt und konnte so die Grundlage dafür schaffen nun den Checkpoint zu nutzen, dafür dass man "gewonnen" hat, wenn man einparkt. Dies habe ich gemacht, indem ich die Koordinaten von dem Checkpoint in unserer Actor-Klasse abgefragt habe. Dann habe ich auch noch den Grad der Drehung abgefragt vom Actor, damit man mit einer 5°-Abweichung einparken darf.

## 27.09.2022

Heute zeigte Joel mir die neue Checkpoint-Mechanik und brachte mich auf den neusten Stand, was unser Spiel angeht. Anschließend sammelten wir verschiedene Möglichkeiten, mit dem Spiel fortzufahren. Entweder lassen wir das bisherige Level auf dem momentanen Stand und fokussieren uns auf ein neues Level, oder wir perfektionieren das bisherige. Wir entschieden uns für Letzteres.

## 28.09.2022

In der heutigen Doppelstunde hatten wir die Idee, ein weiteres Fahrzeug in das Spiel hinzuzufügen. Dies soll ein Abschleppwagen sein. Er spawnt in der Welt dann, wenn der Spieler, mit seinem Krankenwagen, mit dem grünen Fahrzeug kollidiert. Anschließend soll er sich in die Richtung des Unfalls drehen und dort hin bewegen. Mit der Umsetzung dieser Idee hatten wir allerdings Probleme, weshalb wir uns von Herrn Buhl helfen lassen haben. Er behob unsere Fehler und machte uns darauf aufmerksam, dass wir unsere Programmier-Schreibweise überarbeiten sollten.

## 05.10.2022

In dieser Doppelstunde war Joel krank, deshalb begann ich damit, die von Herrn Buhl angemerkten Fehler in unserer Schreibweise auszubessern. Nachdem dies erledigt war, widmete ich mich der Verbesserung des Abschleppwagens. Bisher war es so, dass sich das grüne Auto, nach der Kollision, dauerhaft weiterbewegt. Dadurch kollidierte es in jedem neuen Bild erneut mit dem Spieler, was dazu führte, dass stetig neue Abschleppwagen spawnen. Hierdurch geriet das Programm sehr ins Ruckeln.
Folglich musste ich eine Methode finden, den Unfallwagen zu sagen, dass sie anhalten sollen. Ohne dabei das gesamte Programm zu pausieren. Gemeinsam mit Herrn () fand ich heraus, dass wir hierfür eine eigene Variable definieren müssen. Das Programm überprüft dann ob diese Variable true oder false ist. Ist sie false, dann läuft das Spiel normal weiter. Ist sie hingegen true, dann stoppt das Programm die Bewegungen der Unfallwagen und lässt nur den Abschleppwagen fahren.

## 26.10.2022

An diesem Tag war Joel erneut krank. Zunächst überarbeitete ich das Aussehen unseres Leveles, bzw. der Fahrzeuge. Da auf diesem Schul-PC leider kein Programm installiert ist, mit dem die richtige Bearbeitung möglich ist, schickte ich die entsprechenden Bilder an Robert. Er hat dann auf seinem eigenen Laptop die Bilder nach unseren Anforderungen bearbeitet und an mich zurückgeschickt. 
Somit sah unser Level zum ersten Mal fertig aus. 
![Screenshot (7)](https://user-images.githubusercontent.com/111385267/197958603-c839b39b-5d51-44a1-b39f-ca9a07835b49.png)
Das einzige Problem ist momentan die dauerhafte Kollision der Autos. Dessen Lösung müssen wir uns in der nächsten Woche widmen.

## 02.11.2022

Heute haben wir endlich das Problem gelöst. Herr Buhl klärte uns dafür zunächst über verschiede Methoden auf. Die erste Methode war die, die Herr Buhls Referendar bereits erwähnt hatte. Die zweite Methode war die "Singleton Methode". Dazu zeigte er uns zuerst ein Beispiel. Da wir dies nach eigenem Versuchen leider nicht selbst geschafft haben umzusetzen, zeigte uns Herr Buhl die erste Variante und wo sie einzusetzen ist. Nun war das erste Level wirklich fertig.

## 08.11.2022 

Heute hatte Joel ein Vorstellungsgespräch und konnte deshalb nicht am Unterricht teilnehmen. Also begann ich damit, ein neues Level zu erstellen. Dazu übernahm ich das Layout des ersten Levels. Um das zweite Level zu erreichen, muss der Spieler nun seinen Krankenwagen erfolgreich einparken. Geschieht dies, dann erzeugt der Krankenwagen das neue Level mit einem delay von 30. In dieser neuen Welt spawnen nun der Spieler und das Greencar erneut.

## 09.11.2022

Um die Schwierigkeit mit jedem Level zu erhöhen, hatten wir heute die Idee, ein weiteres Auto hinzuzufügen. Es soll zufällig auf einem der Parkplätze spawnen und den Spieler behindern. Dabei nutzen wir die selbe Methode wie für die Checkpoints. Hier trat allerdings das Problem auf, dass Checkpoint und Auto mit einer geringen Wahrscheinlichkeit an der selben Stelle spawnen. Mit der Hilfe von Herrn Buhl fanden wir hierfür eine Lösung. Der Constructor prüft vor dem spawnen des Autos, ob dessen x- und y-Koordinaten die selben sind. Ist dies der Fall, dann wird ein neuer Spawnpunkt auf den Parkplätzen generiert. Dies geschiet solange, bis die Koordinaten nicht identisch sind.

## 16.11.2022

Heute haben wir das drittes Level angefangen. Dazu gingen wir so wie beim zweiten Level vor und fügten die bereits fertigen Fahrzeuge ein. Außerdem fügten wir ein weiteres Auto ein, welches ebenfalls um die Parkplätze herumfährt. Dieses lassen wir gegenüber vom Greencar spawnen, damit der Spieler von beiden Seiten von sich bewegenden Fahrzeugen eingeschränkt wird. 

## 23.11.2022

In dieser Stunde stellten wir das dritte Level fertig. Außerdem haben wir das Aussehen der neuen Fahrzeuge angepasst, sodass keine weißen Ränder mehr vorhanden sind.
Anschließend begannen wir mit Level 4. Um ein wenig Abwechslung zu erzeugen, suchten wir uns dazu einen neuen 2D-Parkplatz aus dem Internet heraus. Dieser hat weniger Parkplätze, aber eine Grünfläche in der Mitte. Unsere Vorstellung ist, dass das Spiel fehlschlägt, wenn der Spieler diese berührt.
![Screenshot (8)](https://user-images.githubusercontent.com/111385267/203496627-228cda42-6fb1-41bb-af58-3ea57a541eed.png)

## 06.12.2022

An diesem Tag war Joel krank. Außerdem hat uns Herr Buhl genaueres über die Abgabe erzählt. Diese wurde nun vom 15.12 auf den 19.12 verschoben. An diesem Tag sollen wir Herrn Buhl die Links zu unserem Stundenprotokoll und unserer Projektseite per Email schicken. Den Rest der Stunde habe ich die letzten Github-Einträge überarbeitet und Bilder hinzugefügt. 

## 07.12.2022 

Heute haben wir uns weiter mit unserem vierten Level beschäftigt. Da dieser neue Parkplatz anders aufgebaut ist und eine Grünfläche in der Mitte hat, mussten wir eine entsprechende Barriere erstellen, die die Ausmaße der Grünfläche hat. Berührt der Spieler diese Fläche, dann ist das Spiel verloren. Dazu bearbeiteten wir mit GIMP ein Bild von Gras so, dass es die gewollte Form annimmt. Anschließend fügten wir es als Actor in die Welt ein. Anschließend fügten wir den Checkpoint in das Level ein. Zunächst ermittelten wir dafür die Koordinaten des Prakplatzes in der linken oberen Ecke und anschließend die Differenz der x- und y-Koordinaten zu den anliegenden Parplätzen daneben und darunter. Nun setzten wir die ermittelten Werte in den Code für das Spawnen des Checkpoints aus Level 3 ein. Zuletzt verringerten wir den Multiplikator der x-Koordinaten auf 4, da in diesem Level ein Parkplatz weniger in x-Richtung vorhanden ist.    


## 13.12.2022

Heute war die vorletzte Stunde vor der Vollendigung des Projektes. Da Joel an der morgigen letzten Stunde nicht teilnehmen kann, wollten wir möglichst viel schaffen, damit ich die morgige Stunde für letzte Verbesserungen im Code und dem Aussehen des Spiel nutzen kann. Folglich arbeiteten wir an Level 4. Unser Ziel war es, ein weiteres rotes Auto einzufügen, welches in der oberen linken Ecke spawnt und nach dem selben Prinzip wie das grüne und blaue Auto funktioniert. Dazu übernahmen wir den Code des grünen Fahrzeuges. Erreicht das rote Auto nun die vorgegebenen Koordinaten in den Ecken der Welt, dann soll es jeweils um 90 Grad entgegen des Uhrzeiges rotieren. Dies erwies sich als sehr schwierig, da das Auto keine von uns programmierte Rotation durchgeführt hat. Nach einiger Zeit der Lösungssuche rotierten wir das Bild des Autos in GIMP und schrieben den Bewegungsbefehl des Autos an die letzte Stelle des Codes, hinter die Rotationsbefehle. Diese Kombination löste des Problem. Danach überabeiteten wir die Steuerung des Spielerfahrzeuges so, dass es sich nur nach links und rechts bewegen kann, wenn die Taste "w" oder "s" gleichzeitig gedrückt wird.
Den Rest der Stunde haben wir das Bild des roten Autos in der Größe und im Aussehen an unser Level angepasst. 

## 14.12.2022

An diesem Tag fanden die letzten 90 Minuten für die Arbeit an diesem Projekt statt. Wie bereits erwähnt, konnte Joel an diesem Tag nicht am Unterricht teilnehmen. Zunächst begann ich damit, das Ende des Spiels zu erstellen. Dazu erstellte ich einen Winscreen. Dieser wird angezeigt, wenn der Spieler das vierte Level erfolgreich absolviert und gratuliert dem Spieler zum Erfolg. Anschließend spielte ich unser Spiel mehrfach selbst durch und ließ es ebenfalls von Mitschülern testen. Dabei funktioniert fast alles perfekt. Das einzig erkennbare Problem war, dass sich der Abschleppwagen unendlich im Kreis dreht, sobald er den Krankenwagen erreicht. Also fügte ich ein, dass das Spiel beendet ist, sobald der Abschleppwagen den Krankenwagen berührt. Resetet der Spieler nun unser Spiel, dann beginnt er erneut bei Level 1.
Anbschließend habe ich das Spiel in den Gruppenordner bei Isurf hochgeladen, sodass es für Herrn Buhl zu finden ist. 
Damit war die Arbeit an unserem ersten Informatik-Projekt beendet und ich begann mit unserer Projektseite.

