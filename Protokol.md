
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
