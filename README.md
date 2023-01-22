# Exercises 23/01

Es 2 RISOLTO
Nella classe it.euris.academy2023.dynamic.DynamicArray prevedere due nuovi metodi:
public Object removeLast(); 
Rimuove l’ultimo elemento dall’array, ridimensionando in modo opportuno il conteggio.
public Object removeAt(int index);
Rimuove l’elemento dall’array alla posizione index, ridimensionando in modo opportuno il conteggio. NB: non devono rimanere buchi nell’array.
Prevedere poi un tasso di crescita esponenziale, radoppiando la dimensione fisica dell’array ogni volta che questa arriva al limite.

Es 3 RISOLTO
Partendo dal template fornito nel package it.euris.academy2023.invoices, completare i seguenti tasks:
-	Nella classe Invoice, implementare il metodo convert, per convertire una stringa in Date e il metodo toString() per una rappresentazione leggibile dei suoi campi;
-	Nella classe InvoiceRepository , implementare il metodo add, per aggiungere le istanze di Invoice all’interno del DynamicArray. Implementare poi il metodo sort, per ordinare le fatture inserite nell’array secondo il criterio di ordinamento specificato. Implementare infine il metodo toString(), per una rappresentazione di una lista di fatture, secondo l’ordinamento corrente.
NB: La classe DynamicArray non deve contenere dipendenze e/o logiche dirette sulla classe Invoice, ma deve mantenere un comportamento generico, pertanto va aggiunto il minimo indispensabile per poter manipolare le posizioni dell’array, senza però definire le logiche di ordinamento (che vanno tenute a livello di InvoiceRepository).
