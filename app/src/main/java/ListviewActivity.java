import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.user.week2.R;

import java.util.ArrayList;

/**
 * Created by User on 2018-01-19.
 */

public class ListviewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listView =(ListView)findViewById(R.id.listview);

        ArrayList<Listviewitem> data = new ArrayList<>();
        Listviewitem friend1 = new Listviewitem(R.drawable.profile,"friend1");
        Listviewitem friend2 = new Listviewitem(R.drawable.profile,"friend2");
        Listviewitem friend3 = new Listviewitem(R.drawable.profile,"friend3");
        Listviewitem friend4 = new Listviewitem(R.drawable.profile,"friend4");

        data.add(friend1);
        data.add(friend2);
        data.add(friend3);
        data.add(friend4);

        ListviewAdapter adapter = new ListviewAdapter(this,R.layout.listviewitem,data);
        listView.setAdapter(adapter);

    }
}