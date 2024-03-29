package uk.ac.hereford.djw9349.managers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import uk.ac.hereford.djw9349.objects.Supplier;
import uk.ac.hereford.djw9349.objects.User;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SupplierManager {
    private ArrayList<Supplier> suppliers = new ArrayList<Supplier>();

    public SupplierManager() throws IOException {
        initialise();
    }

    private void initialise() throws IOException {
        File file = new File("supplier.json");
        if (!file.exists()) file.createNewFile();

        Type type = new TypeToken<ArrayList<Supplier>>() {
        }.getType();
        List<Supplier> local = new Gson().fromJson(new FileReader("supplier.json"), type);
        if (local != null) suppliers.addAll(local);
    }

    private void save() throws IOException {
        try (Writer writer = new FileWriter("supplier.json")) {
            Gson builder = new GsonBuilder().create();
            builder.toJson(suppliers, writer);
        }
    }

    public void addSupplier(Supplier supplier) throws IOException {
        suppliers.add(supplier);
        save();
    }

    public void removeSupplier(Supplier supplier) throws IOException {
        suppliers.remove(supplier);
        save();
    }
    
    public void removeSupplier(String string) throws IOException {
        removeSupplier(getSupplierFromString(string));
    }
    
    private Supplier getSupplierFromString(String name) {
        for (Supplier supplier : suppliers) if (supplier.getName().equals(name)) return supplier;
        return null;
    }

    public boolean alreadyExists(String name) {
        for (Supplier supplier : suppliers) if (supplier.getName().equals(name)) return true;
        return false;
    }
    
    public ArrayList<Supplier> getSuppliers() {
        return suppliers;
    }
}
