(ns repro.core
  (:require 
   [rum.core :as rum]))

(defn ^:export init
  []
  ;; Try find definition on rum/static.
  rum/static)

