# Programming –opdracht Loops 1 - Tafels

## Beschrijving

### a.
Schrijf een programma dat de tafel print van een door de gebruiker op te geven geheel getal. De in- en uitvoer van het programma moet er als volgt uitzien:

```
Welke tafel wilt u afdrukken? 3
De tafel van 3:
3 6 9 12 15 18 21 24 27 30
```

### b.
Pas het programma aan zodat er 5 getallen op een rij getoond worden, en in totaal 10 getallen. De in- en uitvoer van het programma moet er als volgt uitzien (zie de tips aan het eind):

```
Welke tafel wilt u afdrukken? 3
De tafel van 3:
3 6 9 12 15
18 21 24 27 30
```

### c.
Breid het programma zo uit dat de gebruiker ook kan aangeven hoeveel getallen hij/zij wil afdrukken. De in- en uitvoer ziet er dan als volgt uit:

```
Welke tafel wilt u afdrukken? 12
Hoeveel getallen wilt u afdrukken? 12
De tafel van 12:
12 24 36 48 60
72 84 96 108 120
132 144
```

### d.
Breid het programma zo uit dat de gebruiker meerdere tafels achter elkaar kan afdrukken. Het programma stopt pas wanneer voor de tafel van 0 wordt gekozen. Een voorbeeld van de in- en uitvoer zie je op de volgende pagina.

## Input/Output

Zie hier een voorbeeld van input/output van deze applicatie nadat alle onderdelen zijn geïmplementeerd. Input die de gebruiker invoert is schuin en onderstreept.

```
Welke tafel wilt u afdrukken (0=stoppen)? 12
Hoeveel getallen wilt u afdrukken? 18
De tafel van 12:
12 24 36 48 60
72 84 96 108 120
132 144 156 168 180
192 204 216

Welke tafel wilt u afdrukken (0=stoppen)? 3
Hoeveel getallen wilt u afdrukken? 10
De tafel van 3:
3 6 9 12 15
18 21 24 27 30

Welke tafel wilt u afdrukken (0=stoppen)? 7
Hoeveel getallen wilt u afdrukken? 4
De tafel van 7:
7 14 21 28

Welke tafel wilt u afdrukken (0=stoppen)? 0
```

## Tips

- Voor deze opdracht heb je een loop nodig. Bij onderdeel a. t/m c. geldt dat het aantal herhalingen al aan het begin van de loop bekend is. Bedenk zelf welke loop in dit geval het handigste is om te gebruiken.
- Gebruik bij onderdeel b. in plaats van System.out.print de methode System.out.printf. Hiermee kun je precies aangeven hoeveel posities een integer moet innemen.
- Gebruik bij onderdeel b. de remainder operator (%) om te bepalen wanneer er 5 getallen op een rij zijn afgedrukt.
- Bij onderdeel d. krijg je te maken met zogenaamde nested loops. Denk goed na over het soort loop dat je hier gaat gebruiken en over welke code wel en welke code niet binnen de buitenste loop komt.

## Richtlijnen bij coderen (zie ook MIW code conventions)

- Zorg dat je naam en het doel van het programma bovenin staan (ICC #1).
- Gebruik de juiste inspringing (indentation) bij de lay-out (ICC #2).
- Let op juist gebruik hoofdletters en kleine letters (ICC #3).
- Gebruik goede namen (ICC #4).
- Voeg waar nodig commentaar toe dat inzicht geeft in je code (ICC#7)