

# Schulprojekt

17.08.2022

Heute haben wir unsere Idee zu einem 2D-basierten Spiel entwickelt. Dieses soll einen Touch von einem Jump&Run und einem Escape Room-Spiel haben.
Unsere Idee ist es, mit Unity zu arbeiten und dort gratis Assets zu benutzen für unser Spiel, damit wir mehr Zeit ins Entwickeln, als ins Animieren zu investieren. Diese Idee musste nach intensiver Absprache mit dem Lehrer verworfen werden. Nun müssen wir eine neue Idee entwickeln.

23.08.2022

In dieser Stunde kamen wir zu dem Entschluss, ein 2D-Parkplatz-Spiel zu programmieren. Hierzu nutzen wir das Programm Greenfoot. In diesem Spiel geht es darum, ein Fahrzeug in einen bestimmten Parkplatz zu bewegen. Dabei möchten wir Level mit aufsteigender Schwierigkeit entwicklen, wie andere Fahrzeuge, die sich ebenfalls über den Parkplatz bewegen, welche man nicht berühren darf. Als erstes veränderten wir ein 2D-Bild eines Parkplatzes so, dass es für unser erstes Level geeignet ist. Anschließend machten wir uns mithilfe des Greenfoot Buches mit den Grundmechaniken des Programmes vertraut.

24.08.2022

Die heutige Doppelstunde nutzten wir, um die wichtigsten Grundsteuerelemente für das Fahrzeug zu programmieren. Wie in den meisten Spielen üblich, liegen bei uns die Befehle "vorwärts, links, rückwärts, rechts" auf den Tasten "w,a,s,d". Dabei kam das Problem auf, dass sich das Fahrzeug nicht wie von uns gedacht nach links und rechts bewegen konnte. Um die richtige Bewegung zu ermöglichen, legten wir fest, dass sich das Fahrzeug drehen soll, sobald der Spieler die Leertaste betätigt. Bisher ist es nur mögich das Fahrzeug zu drehen, wenn eine weitere Bewegungstaste betätigt wird. Zu dem dreht sich das Fahrzeug bei der ersten Betätigung der Leertaste nicht um -6°, sondern richtet sich sofort in die Richtung -6° aus. Dieses Problem wollen wir später lösen und uns nun auf das Erstellen von Spawn- und Zielpunkten konzentrieren.  

30.08.2022

Wie in der letzten Woche besprochen war es heute unser Ziel, die Spawn- und Zielpunkte zu erstellen. Für unser erstes Test-Level legten wir fest, dass unser Fahrzeug in der unteren rechten Ecke der Welt spawnen soll. Der Einfachheit halber platzierten wir das Zielfeld auf den naheliegendsten Parkplatz. Dieses Zielfeld, momentan noch braun dargestellt, liegt genau in der Parkfläche und soll stets den zu erreichenden Parkplatz signalisieren. Anschließend haben wir versucht einen günstigen Punkt innerhalb des Feldes zu finden. Erreicht unser Auto nun diesen Punkt, ist das Level erfolgreich abgeschlossen. Da wir keine Koordinaten in unserer Welt anzeigen lassen konnten, mussten wir länger nach diesen perfekten Punkt suchen. 

31.08.2022 

Das erwähnte Problem vom 24.08.2022 konnte heute, dank der Hilfe von Herrn Buhl, gelöst werden. Nachdem Herr Buhl sich unsere Bewegungselemente angeschaut hatte, war er der Ansicht, dass man die jeweiligen Codes besser schreiben könnte. Er veränderte sie zu unserem ursprünglichen Code. Hier erklärten wir, dass wir dabei ebenfalls schwerwiegende Probleme mit der Bewegung hatten, weshalb wir den Code wieder änderten. Herr Buhl erkannte, dass das Bild des von uns gewählten Actors um 90° nach rechts gedreht war, wodurch die Probleme während der Bewegung entstanden. Nun mussten wir das Bild lediglich im Editor um 90° nach links drehen. 
Im Folgenden ist nur der momentane Code des Fahrzeuges zu sehen.
![Screenshot (1)](https://user-images.githubusercontent.com/111385267/188615644-b1e2afcb-710c-4e4e-b4cb-c29a27c440a2.png)
Den Rest der Stunde widmeten wir dem zufälligen Einfügen von anderen Fahrzeugen. Kollidiert der Spieler während des Spielens mit ihnen, dann soll das Level scheitern. Dies setzten wir uns als Ziel für die nächste Woche. 

06.09.2022

Da Joel heute krank war, arbeitete ich alleine weiter. Wie letzte Woche geplant, fügte ich die Kollision mit anderen Objekten ein, was direkt funktionierte. Zudem bearbeitete ich das Aussehen des Fahrzeuges so, dass es in unsere Welt passt. Den Rest der Stunde habe ich die bisherigen Protokolle überarbeitet und mit Bildern unseres Codes unterlegt.

07.09.2022

Auch heute war Joel krank, somit fuhr ich alleine mit der Arbeit fort. Das heutige Ziel war es, dass sich das andere Fahrzeug zufällig bewegen kann. Für diese Bewegung probierte ich verschiedene Methoden aus. Schließlich programmierte ich, dass sich dieses Fahrzeug dauerhaft um 4 Einheiten nach vorne bewegt. Gleichzeitig läuft im Hintergrund ein Zahlengenerator, der eine Zahl zwischen 1 und 100 generiert. Ist diese Zahl kleiner als 20, dreht sich das Fahrzeug eine Eihneit nach links. Ist die Zahl größer als 80, dreht es sich nach links. Andernfalls bewegt sich das Fahrzeug lediglich geradeaus weiter. Hierbei muss allerdings überarbeitet werden, dass sich das Fahrzeug nach einiger Zeit am Rand der Welt "festfährt". Für das vorrängige Ziel, die Schwierigkeit des Levels zu erhöhen, ist die bisherige Funktionsweise jedoch ausreichend. 

13.09.2022

Heute war Lasse krank. Somit fuhr ich alleine fort und verwarf die Idee von Lasse, dass das "random" generierte Auto sich anhand einer zufälligen Zahl fortbewegt. Nun habe ich stattdessen Punkte gesetzt, die das Auto abfährt und sich an jeweiligen Ecken dreht. Dadurch fährt das Auto zwar nicht mehr zufällsmäßig. Es sieht aber flüßiger und realistischer aus. Außerdem habe ich die Geschwindigkeit verringert und dem Auto hinzugefügt, dass es, wenn es an das Ende der Welt stößt eine 90°-Drehung macht. Dies dürfte aber nicht passieren, da das Auto ja einen vorbestimmten Weg abfährt.

14.09.2022

Heute war Lasse leider wieder krank. Deshalb habe ich mich daran gemacht erstmal einen Checkpoint, also einen Bereich, wo man das Auto parken muss zu erstellen. Dieser Checkpoint sollte außerdem zufällig generiert werden innerhalb bestimmter Koordinaten. Dies habe ich mit Hilfe von Herrn Buhl entwickelt und konnte so die Grundlage dafür schaffen nun den Checkpoint zu nutzen, dafür dass man "gewonnen" hat, wenn man einparkt. Dies habe ich gemacht, indem ich die Koordinaten von dem Checkpoint in unserer Actor-Klasse abgefragt habe. Dann habe ich auch noch den Grad der Drehung abgefragt vom Actor, damit man mit einer 5°-Abweichung einparken darf.

27.09.2022

Heute zeigte Joel mir die neue Checkpoint-Mechanik und brachte mich auf den neusten Stand, was unser Spiel angeht. Anschließend sammelten wir verschiedene Möglichkeiten, mit dem Spiel fortzufahren. Entweder lassen wir das bisherige Level auf dem momentanen Stand und fokussieren uns auf ein neues Level, oder wir perfektionieren das bisherige. Wir entschieden uns für Letzteres.

28.09.2022

In der heutigen Doppelstunde hatten wir die Idee, ein weiteres Fahrzeug in das Spiel hinzuzufügen. Dies soll ein Abschleppwagen sein. Er spawnt in der Welt dann, wenn der Spieler, mit seinem Krankenwagen, mit dem grünen Fahrzeug kollidiert. Anschließend soll er sich in die Richtung des Unfalls drehen und dort hin bewegen. Mit der Umsetzung dieser Idee hatten wir allerdings Probleme, weshalb wir uns von Herrn Buhl helfen lassen haben. Er behob unsere Fehler und machte uns darauf aufmerksam, dass wir unsere Programmier-Schreibweise überarbeiten sollten.

05.10.2022

In dieser Doppelstunde war Joel krank, deshalb begann ich damit, die von Herrn Buhl angemerkten Fehler in unserer Schreibweise auszubessern. Nachdem dies erledigt war, widmete ich mich der Verbesserung des Abschleppwagens. Bisher war es so, dass sich das grüne Auto, nach der Kollision, dauerhaft weiterbewegt. Dadurch kollidierte es in jedem neuen Bild erneut mit dem Spieler, was dazu führte, dass stetig neue Abschleppwagen spawnen. Hierdurch geriet das Programm sehr ins Ruckeln.
Folglich musste ich eine Methode finden, den Unfallwagen zu sagen, dass sie anhalten sollen. Ohne dabei das gesamte Programm zu pausieren. Gemeinsam mit Herrn () fand ich heraus, dass wir hierfür eine eigene Variable definieren müssen. Das Programm überprüft dann ob diese Variable true oder false ist. Ist sie false, dann läuft das Spiel normal weiter. Ist sie hingegen true, dann stoppt das Programm die Bewegungen der Unfallwagen und lässt nur den Abschleppwagen fahren.

26.10.2022

An diesem Tag war Joel erneut krank. Zunächst überarbeitete ich das Aussehen unseres Leveles, bzw. der Fahrzeuge. Da auf diesem Schul-PC leider kein Programm installiert ist, mit dem die richtige Bearbeitung möglich ist, schickte ich die entsprechenden Bilder an Robert. Er hat dann auf seinem eigenen Laptop die Bilder nach unseren Anforderungen bearbeitet und an mich zurückgeschickt. 
Somit sah unser Level zum ersten Mal fertig aus. 
![Screenshot (6)](https://user-images.githubusercontent.com/111385267/197958137-22b56553-8f5e-4283-bcf6-aa867aa7492f.png)
