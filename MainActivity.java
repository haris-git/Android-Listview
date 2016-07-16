package YOU_PACKAGE_DESTINATION;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private ListView listView1;
    
    private String[] items = {"Monday ", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView)findViewById(R.id.textView1);
        listView1 = (ListView)findViewById(R.id.listView1);

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
                                                                  // I used "android.R.layout" to fill the adapter with the contents of the array "items"

        listView1.setAdapter(arrayAdapter1);

        /*Create an item click listener. The item is the list view, so whenever we click on an item of the list view, something happens*/
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView1.setText(items[position]);
            }
        });
    }
}
