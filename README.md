# codesOOKA
## Fragen

### Welche Aufgabe haben Ports im Kontext eines Komponentendiagramms?
- Kommunikationsschnittstellen, die ausserhalb der Komponente sichtbar ist 
und es ermöglicht Funktionen aus der Komponente außerhalb dieser anzubieten.
- Die Komponente wird durch die Ports von der Umgebung isoliert.
- Ziel ist es die Komponente auf ihre Ports zu reduzieren

### Wie könnte man deren Aufgabe für eine Komponente in Java implementieren?
- Es könnte als Interface, oder als Klasse über die Pattern Delegator oder Proxy, implementiert werden.


### FA0: Welches Design Pattern sollte hier verwendet werden, um die notwendige Delegation zwischen internen und externen Verhalten zu realisieren?
- Proxy-Pattern

### FA1: Gibt es eine dedizierte Reihenfolge beim Aufruf der Methoden des Interfaces?
- Ja gibt es, erst openSession, dann getHotelByName, zuletzt closeSession.

### FA2: Ist die Schnittstelle Caching hinreichend modelliert oder fehlen auch hier Methoden?
- Es fehlen Methoden, um die Daten wieder aus dem Cache zu laden

### FA6: Wie könnte so ein einfacher Navigationsmechanismus aussehen?
- Ausgabe von allen möglichen Interfaces / Suchen über eine Funktion getInterfaces und dann die Herausgabe der gewählten Suche über eine Funktion getInterface(String)


### R1: Um welche externe Komponente könnte man dieses erweitern?
- Es könnte um eine Webkomponente erweitert werden, sodass Clienten Abfragen durchführen können.
