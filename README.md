# README #

Hey Leute, die Zeit drückt etwas, deswegen lege ich jetzt mal die Readme an.

### Development-Branch ###

Ich habe einen Development-Branch angelegt und dort jetzt ein xtext-Projekt nur für bibtex generiert. Das andere Projekt war etwas "corrupted".
Ebenso habe ich den .metadata-Ordner gelöscht, da dort lokal-spezifische Daten abgelegt werden.
Pullt bitte mal die Updates.

Den Development-Branch folgendermaßen holen: 

```
#!git

git pull origin development
git checkout development
```

Danach ganz normal die 4 neuen Projekte zu eurem Workspace hinzufügen und loslegen.

### xText-Zeugs ###

Wir brauchen ja zwei DSLs. Für die zweite müssen wir abermals ein neues xText-Projekt kreieren. Wir können dann mit Crossreferenzen beide DSLs in einer Eclipse-Instanz benutzen (Wie, weiß ich noch nicht. Evtl. so: https://christiandietrich.wordpress.com/2012/08/07/xtext-referencing-elements-of-one-dsl-from-another-dsl/). 
Ich habe schon mal mit der BibTeX-Grammar-File angefangen. Funktioniert noch nicht alles, aber schon mal etwas. 

Die nächsten Schritte wären:
* Zweites xText-Projekt mit Projektnamen de.tubs.bibtextohtml.(?? lookandfeel oder wie wollen wirs nennen? Brainstorming required)
* Language name entsprechend de.tubs.bibtextohtml.[insertname].[SameNameWithUpperLettersBecauseWhyNot]
* Vernünftige Endung (zB laf für lookandfeel)
* BibTex.xtext erweitern, evtl. Rahmenbedingungen setzen? (BibTex erlaubt ziemlich viel, was mit xtext schwer umzusetzen ist...zB alles außerhalb von @Name{...} ist ein Kommentar)
* Mal überlegen, was in die zweite DSL kommt und wie die Syntax aussieht (Aussehen, Sortierung, mehrere Varianten,...?? => Wir brauchen ein konkreten Use-Case)
* Validierung der Eingaben (OCL)
* ...
* HTML Generierung (seperate css,... 

