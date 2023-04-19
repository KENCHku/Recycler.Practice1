package kg.geeks.recyclerpractice1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsViewHolder> {

    private ArrayList<Contact> arrayList;

    public ContactsAdapter(ArrayList<Contact> arrayList) {
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactsViewHolder(LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_contacts, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
