## Redis

### Question: Quelles sont les types de données stockés dans Redis ?

- Des paires clé valeur (equivalent String)
```
Une valeur associée à une clé, avec la clé on obtient la valeur. Voir la classe KeyValue.java.
```

- Des Sets
```
Un ensemble de valeurs associée à une clé. Voir la classe Set.java.
```

- Des Sets rangés
```
Sous la forme d'un HashMap<String, Double>, où les valeurs peuvent être renvoyées en fonction du Double. (croissant, décroissant, supérieur à une certaine valeur,...)
```

- Des Listes
```
Similaire au Set mais les valeurs sont triées par ordre d'insertion dans la liste.
```

- Des HashSet
```
Une clé lié à une Map<Clé, Valeur>. Utile pour accéder à une et seulement une des propriétés d'un objet.
```

### Question : Que peut on faire comme types de requêtes ?

On peut faire des requêtes atomiques via la classe Transaction.
Une aide à la consistence des données peut être la méthode watch, qui va permettre d'exécuter une transaction en fonction de la valeur d'une clé en paramètre.
(ex : si on souhaite supprimer la personne portant l'id 1, on va vérifier juste avant d'exécuter la transaction que cet id est toujours présent en base)

On peut faire des requêtes groupées en créant un objet Pipeline, auquel on ajoute des requêtes avant de toutes les exécuter d'un coup. (moins de latence liée à la connexion)
(les requêtes doivent cependant être indépendantes les unes des autres)

