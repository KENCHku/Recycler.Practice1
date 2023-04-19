package kg.geeks.recyclerpractice1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsViewHolder extends RecyclerView.ViewHolder {

    private Contact contact;
    private ImageView ivContact;
    private TextView tvTitle;
    private TextView tvSubTitle;

    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(Contact contact) {
        initUI();
        ivContact.setImageResource(contact.getImage());
        tvTitle.setText(contact.getTitle());
        tvSubTitle.setText(contact.getSubtitle());
    }

    private void initUI() {
        ivContact = itemView.findViewById(R.id.iv_item_contact);
        tvTitle = itemView.findViewById(R.id.tv_item_title);
        tvSubTitle = itemView.findViewById(R.id.tv_item_subtitle);

    }
}
