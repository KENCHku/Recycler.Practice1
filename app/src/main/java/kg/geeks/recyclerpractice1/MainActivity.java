package kg.geeks.recyclerpractice1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ContactsAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Contact> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listDigitsSort();
        listDigitsEvenOdd();
        listDigitsSum();
        initList();
    }

    private void listDigitsSum() {
        ArrayList<Integer> digits = new ArrayList<>();
        int sumOfEven = 0;
        int productOfOdd = 1;
        digits.add(12001);
        digits.add(29384);
        digits.add(12384);
        digits.add(909345);
        digits.add(34289);
        digits.add(001);
        digits.add(002);
        digits.add(003);

        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i) %2 == 0){
                sumOfEven += digits.get(i);
            }else {
                productOfOdd *= digits.get(i);
            }
        }

        System.out.println("Sum of even: " + sumOfEven);
        System.out.println("Product of odd: " + productOfOdd);

    }

    private void listDigitsEvenOdd() {
        int[] evenOdd = {10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38};
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        for (int i:evenOdd) {
            if ((i & 1) == 1){
                odd.add(i);
            }else{
                even.add(i);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        System.out.println("Odd: "+odd);
        System.out.println("Even: "+even);
    }

    private void listDigitsSort() {
        int[] numbers = {9991, 821923, 2832, 22, 1120, 9, 3, 33, 1233};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private void initList() {
        arrayList = new ArrayList<>();
        arrayList.add(new Contact(R.drawable.ic_launcher_background, "Title", "Subtitle"));
        arrayList.add(new Contact(R.drawable.ic_launcher_background, "Title", "Subtitle"));
        arrayList.add(new Contact(R.drawable.ic_launcher_background, "Title", "Subtitle"));
        arrayList.add(new Contact(R.drawable.ic_launcher_background, "Title", "Subtitle"));
        arrayList.add(new Contact(R.drawable.ic_launcher_background, "Title", "Subtitle"));
        arrayList.add(new Contact(R.drawable.ic_launcher_background, "Title", "Subtitle"));
        arrayList.add(new Contact(R.drawable.ic_launcher_background, "Title", "Subtitle"));

        initRecycler();
    }

    private void initRecycler() {
        adapter = new ContactsAdapter(arrayList);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
    }
}