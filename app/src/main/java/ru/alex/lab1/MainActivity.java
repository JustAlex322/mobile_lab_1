package ru.alex.lab1;

import static androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ru.alex.lab1.adapter.MonstersAdapter;
import ru.alex.lab1.pojo.Monster;

public class MainActivity extends AppCompatActivity {

    List<Monster> monsterList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_YES);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        MonstersAdapter monstersAdapter = new MonstersAdapter(this, monsterList);
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(monstersAdapter);
    }

    private void setInitialData(){

        monsterList.add(new Monster ("Вампиры", R.drawable.vampire));
        monsterList.add(new Monster ("Вампиры", R.drawable.vampire));
        monsterList.add(new Monster ("Вампиры", R.drawable.vampire));
        monsterList.add(new Monster ("Вампиры", R.drawable.vampire));
        monsterList.add(new Monster ("Вампиры", R.drawable.vampire));
    }
}