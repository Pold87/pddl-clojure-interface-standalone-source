(define (domain bachelorworld)

  (:requirements 
    :typing)

  (:types
    thesis paper presentation - document
    student prof - human
    home uni - place
    coffee coke - beverage
    document human place beverage - object)

  (:predicates
    (complete ?d - document)
    (nervous ?h - human)
    (happy ?h - human)
    (all-over)
    (location ?o - object ?p - place)) 

  ;; Create a document
  (:action create
    :parameters (?doc - document ?hum - human ?hom - home)
    :precondition (and (location ?hum ?hom))
    :effect (and (complete ?doc)))

  ;; Run fast
  (:action run
    :parameters (?hum - human ?from ?to - place)
    :precondition (location ?hum ?from) 
    :effect (and (location ?hum ?to)
                 (not (location ?hum ?from))))

  ;; Drink something
  (:action drink
    :parameters (?hum - human ?b - beverage)
    :effect (not (nervous ?hum)))

  ;; Give a presentation
  (:action give
    :parameters (?pres - presentation ?hum - human ?uni - uni)
    :precondition (and (location ?hum ?uni)
                       (complete ?pres)
                       (not (nervous ?hum)))
    :effect (and (all-over)))

  ;; Party hard
  (:action party
    :parameters (?hum - human)
    :precondition (and (all-over))
    :effect (and (happy ?hum))))
