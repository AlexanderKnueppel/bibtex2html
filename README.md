# README #

BibTeX2HTML was a student project for the lecture "Model-based software development".

Our goal was to create a Domain-specific language using Xtext (see Eclipse Modeling Framework for further details) to transform BibTeX-Entries into HTML5-conform code.

As for version 1.0 the following publication types are already implemented:

* Article
* Inproceedings
* Manual
* Book

Additional types may follow.

BibTeX-Entry (example.bib):

```TeX
@article{TM83,
  author = "Leung Trang and Zoghman Mebkhout",
   title = "Vari\'et\'es caract\'eristiques et vari\'et\'es polaires",
 journal = "C. R. Acad. Sc. Paris",
  volume = 296,
    year = 1983,
   pages = "129--132",
   url = "http://some.url"
   }
```

DSL for HTML-Generation:

```
module TestGeneration (alphanum) {
	import "example.bib"
	options = [
		prefix : "userprefix-" 
		sorting: author asc
		category: year desc
	]
	styles = [
		author {
			font-styles: bold;
			font-color: blue;
			font-family: "Arial";
		}	
		title {
			font-styles: italic;
			font-color: rgb(15,120,7);
			font-family: "Verdana";
		}
	]
}

run TestGeneration
```