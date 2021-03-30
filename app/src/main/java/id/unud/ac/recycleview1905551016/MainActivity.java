package id.unud.ac.recycleview1905551016;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvComic;
    private ArrayList<Comic> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvComic = findViewById(R.id.rv_comic);
        rvComic.setHasFixedSize(true);

        list.addAll(ComicsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvComic.setLayoutManager(new LinearLayoutManager(this));
        ListComicAdapter listComicAdapter = new ListComicAdapter(list);
        rvComic.setAdapter(listComicAdapter);
    }

    private void showRecyclerGrid(){
        rvComic.setLayoutManager(new GridLayoutManager(this,2));
        GridComicAdapter gridComicAdapter = new GridComicAdapter(list);
        rvComic.setAdapter(gridComicAdapter);
    }

    private void showRecyclerCardView(){
        rvComic.setLayoutManager(new LinearLayoutManager(this));
        CardViewComicAdapter cardViewComicAdapter = new CardViewComicAdapter(list);
        rvComic.setAdapter(cardViewComicAdapter);
    }

    private void setActionBarTitle(String title){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }
    private String title = "Mode List";
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode Card View";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }
}