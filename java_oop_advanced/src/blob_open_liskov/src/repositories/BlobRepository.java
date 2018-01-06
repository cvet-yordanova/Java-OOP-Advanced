package blob_open_liskov.src.repositories;

import blob_open_liskov.src.interfaces.Blob;
import blob_open_liskov.src.interfaces.Repository;
import blob_open_liskov.src.models.BlobImpl;

import java.util.Map;

public class BlobRepository<T extends Blob> implements Repository<Blob>{
    Map<String, Blob> blobs;

    public void addBlob(BlobImpl blob){
        this.blobs.putIfAbsent(blob.getName(), blob);
    };

    public Blob findByName(String name){
        if(this.blobs.containsKey(name)){
            return this.blobs.get(name);
        }else{
            System.out.println("Kann nicht blob_open_liskov finden.");
            return null;
        }
    }

    @Override
    public void add(Blob addBlob) {
        this.blobs.putIfAbsent(addBlob.getName(), addBlob);
    }
}
