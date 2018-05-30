package es.esy.tncgroup.touristsmarter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter recycleAdapter;
    private List<String> touristite = Arrays.asList("Statue", "Scenic Overlook", "Art Museum",
            "Market", "Museum of Natural History", "Temple", "Amusement Park", "City Hall", "Big Bridge");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recycleView);
        recycleAdapter= new RecycleViewAdapter(touristite);
        recyclerView.setAdapter(recycleAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

