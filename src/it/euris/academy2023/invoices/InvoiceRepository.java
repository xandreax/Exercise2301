package it.euris.academy2023.invoices;

import it.euris.academy2023.dynamic.DynamicArray;

public class InvoiceRepository {

    private final DynamicArray repository;

    public InvoiceRepository() {
        this.repository = new DynamicArray(5);
    }

    public void add(Invoice invoice) {
        repository.add(invoice);
    }

    public void sort(String mode) {
        for (int i = 0; i < repository.getCount(); i++) {
            for (int j = 0; j < repository.getCount() - 1; j++) {
                switch (mode) {
                    case "PROGRESSIVO":
                        if (((Invoice) repository.get(j)).getProgressivo() < ((Invoice) repository.get(j + 1)).getProgressivo()) {
                            repository.swapElementsArray(j, j + 1);
                        }
                        break;
                    case "VALORE":
                        if (((Invoice) repository.get(j)).getValore() < ((Invoice) repository.get(j + 1)).getValore()) {
                            repository.swapElementsArray(j, j + 1);
                        }
                        break;
                    case "DATA":
                        if (((Invoice) repository.get(j)).getDataEmissione().before(((Invoice) repository.get(j + 1)).getDataEmissione())) {
                            repository.swapElementsArray(j, j + 1);
                        }
                        break;
                    default:
                        throw new RuntimeException("Criterio di ordinamento " + mode + " non implementato");
                }
            }
        }
    }

    public String toString() {
        String values = "LISTA INVOICES NEL REPOSITORY:\n\n";
        for (Object obj : repository.getArrayData()) {
            if (obj != null) {
                values = values + obj + "\n\n";
            }
        }
        return values;
    }

    public Invoice removeLast(){
        return (Invoice) repository.removeLast();
    }

    public Invoice removeAt(int index){
        return (Invoice) repository.removeAt(index);
    }
}
