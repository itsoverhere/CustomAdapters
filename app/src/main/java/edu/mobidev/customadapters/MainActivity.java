package edu.mobidev.customadapters;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    ListView lvSuperheroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Superhero> superheroes = new ArrayList<Superhero>();

        superheroes.add(new Superhero("Batman", R.drawable.batman, "Bruce Wayne"));
        superheroes.add(new Superhero("Deadpool", R.drawable.deadpool, "Wade Wilson"));
        superheroes.add(new Superhero("Aquaman", R.drawable.aquaman, "Arthur Curry"));
        superheroes.add(new Superhero("Captain Marvel", R.drawable.captain_marvel, "William Batson"));
        superheroes.add(new Superhero("Captain America", R.drawable.captain_america, "Steve Rogers"));
        superheroes.add(new Superhero("Hulk", R.drawable.hulk, "Bruce Banner"));
        superheroes.add(new Superhero("Daredevil", R.drawable.daredevil, "Matthew Murdock"));
        superheroes.add(new Superhero("Thor", R.drawable.thor, "Thor Odinson "));
        superheroes.add(new Superhero("Flash", R.drawable.flash, "Barry Allen"));


        lvSuperheroes = (ListView) findViewById(R.id.lv_heroes);
        CustomAdapter customAdapter = new CustomAdapter(getBaseContext(), R.layout.list_item, superheroes);
        lvSuperheroes.setAdapter(customAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
