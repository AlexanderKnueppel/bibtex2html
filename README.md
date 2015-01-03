# README #

WICHTIG: Musste den Branch kurzzeitig löschen, funktioniert noch nicht wie erwartet... ich häng mich eben dran. 
... Ok habe das Problem gefunden. Wenn der src-gen- oder der xtend-gen-Ordner fehlt, kommt es zu Kompilierungsfehlern beim Generieren (Nachdem das erste mal generiert wurde, liegt wohl an den generierten Files im src-Ordner und der Manifestdatei). Er möchte alles löschen und neu generieren, meckert aber über fehlende classpath-Geschichten und das er nichts zum löschen findet. Dann bricht er einfach ab. 
Die Ordner können daher auch leer sein... hab' sie jetzt aber mal dazu gelegt. Wenn's Probleme gibt, melden.
Ein Maven- oder Antbuild anzulegen, fände ich für die kurze Zeit jetzt etwas overkill.

Hey Leute, die Zeit drückt etwas, deswegen lege ich jetzt mal die Readme an.

### Development-Branch ###

Ich habe einen Development-Branch angelegt und dort jetzt ein xtext-Projekt nur für bibtex generiert. Das andere Projekt war etwas "corrupted".
Ebenso habe ich den .metadata-Ordner gelöscht, da dort lokal-spezifische Daten abgelegt werden.
Pullt bitte mal die Updates.

Den Development-Branch folgendermaßen holen: 

```
#!git

git pull origin Development
git checkout Development
```

Danach ganz normal die 4 neuen Projekte zu eurem Workspace hinzufügen und loslegen.

### xText-Zeugs ###

Wir brauchen ja zwei DSLs. Für die zweite müssen wir abermals ein neues xText-Projekt kreieren. Wir können dann mit Crossreferenzen beide DSLs in einer Eclipse-Instanz benutzen (Wie, weiß ich noch nicht. Evtl. so: https://christiandietrich.wordpress.com/2012/08/07/xtext-referencing-elements-of-one-dsl-from-another-dsl/). 
Ich habe schon mal mit der BibTeX-Grammar-File angefangen. Funktioniert noch nicht alles, aber schon mal etwas. 

Die nächsten Schritte wären:

* Zweites xText-Projekt mit Projektnamen de.tubs.bibtextohtml.(?? lookandfeel oder wie wollen wirs nennen? Brainstorming required)
* Language name entsprechend de.tubs.bibtextohtml.[insertname].[SameNameWithUpperLettersBecauseWhyNot]
* Vernünftige Endung (zB laf für lookandfeel)
* BibTex.xtext erweitern, evtl. Rahmenbedingungen setzen? (BibTex erlaubt ziemlich viel, was mit xtext schwer umzusetzen ist...zB alles außerhalb von {at}Name{...} ist ein Kommentar)
* Mal überlegen, was in die zweite DSL kommt und wie die Syntax aussieht (Aussehen, Sortierung, mehrere Varianten,...?? => Wir brauchen einen konkreten Use-Case)
* Validierung der Eingaben (OCL)
* HTML Generierung (seperate css oder nicht, template usage, usw...) 
* ...