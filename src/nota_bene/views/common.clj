(ns nota-bene.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup form-helpers page-helpers]))

(defpartial layout [& content]
  (html5
    [:head
     [:title "nota-bene"]
     (include-css "/css/reset.css")]
    [:body
      content]))

(defpartial site-layout [& content]
	(html5
		[:head
      (include-css "/css/codemirror.css")
      (include-css "/css/gh-buttons.css")
      (include-css "/css/gui.css")
      (include-css "/css/neat.css")
      (include-css "/css/nota-bene.css")
      (include-js "http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS_HTML")  
			(include-js "/js/jquery-1.7.1.min.js")
      (include-js "/js/jquery.jscroll.min.js")
      (include-js "/js/codemirror.js")
      (include-js "/js/clojure.js")
      (include-js "/js/xml.js")
      (include-js "/js/markdown.js")
      (include-js "/js/markdown.converter.js")
			(include-js "/js/nota-bene.js")
			[:title "Nota Bene"]]
		[:body {:class "leftmenu"}
				content]))