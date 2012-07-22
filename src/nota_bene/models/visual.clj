(ns nota-bene.models.visual
	(:require [incanter.core :as ic]))

(defmulti visualize (fn [val] (type val)) :default nil)

(defmethod visualize org.jfree.chart.JFreeChart
	[val]
	(let [uuid (str (java.util.UUID/randomUUID))
		  out-path (str "/Users/jgre/Software/nota-bene/workbooks/img/" uuid ".png")]
		(ic/save val out-path)
		{:type "image" :path (str "/" uuid ".png")}))

(defmethod visualize nil
	[val]
	nil)