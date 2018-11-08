package xie.araca.logopeia.config;

import android.provider.ContactsContract;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConfigFirebase {

    private static DatabaseReference referenceFirebase;


    public static DatabaseReference getFirebase(){

        if (referenceFirebase == null) {
            referenceFirebase = FirebaseDatabase.getInstance().getReference();
        }
        return referenceFirebase;
    }

}
